package com.liujia.listenner;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.liujia.entity.BizWorkerOrderRepair;
import com.liujia.entity.ReparirInfo;
import com.liujia.mapper.BizWorkerOrderRepairMapper;
import com.liujia.service.IBizWorkerOrderRepairService;
import org.springframework.beans.BeanUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


/**
 * 每解析一行会回调invoke()方法。
 * 整个excel解析结束会执行doAfterAllAnalysed()方法
 *
 * @author ex_111806190
 * @since 2020-9-14 9:52
 */
public class ExcelListener extends AnalysisEventListener {

    private BizWorkerOrderRepairMapper mapper;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/ss");

    public ExcelListener(BizWorkerOrderRepairMapper mapper) {
        this.mapper = mapper;
    }

    //自定义用于暂时存储data。
    //可以通过实例获取该值
    private List<ReparirInfo> datas = new ArrayList<ReparirInfo>();

    private void doSomething(ReparirInfo object) {
        System.out.println("doSomething");
        //1、入库调用接口
    }

    @Override
    public void invoke(Object o, AnalysisContext context) {
        System.out.println("当前行：" + context.getCurrentRowNum());
        if (o instanceof ReparirInfo) {
            ReparirInfo reparirInfo = (ReparirInfo) o;
            datas.add(reparirInfo);//数据存储到list，供批量处理，或后续自己业务逻辑处理。
            doSomething(reparirInfo);//根据自己业务做处理
        }
    }

    public void doAfterAllAnalysed(AnalysisContext context) {
        List<BizWorkerOrderRepair> collect = datas.stream().map(reparirInfo -> {
            BizWorkerOrderRepair bizWorkerOrderRepair = new BizWorkerOrderRepair();
            BeanUtils.copyProperties(reparirInfo, bizWorkerOrderRepair);
            bizWorkerOrderRepair.setOrderState(5);
            bizWorkerOrderRepair.setSyscStatus(2);
            try {
                Date parse = sdf.parse(reparirInfo.getBeginDatetime());
                long time = parse.getTime() / 1000;
                bizWorkerOrderRepair.setBeginDatetime((int) time);
            } catch (ParseException parseException) {
            }

            try {
                Date parse = sdf.parse(reparirInfo.getReserveDatetime());
                long time = parse.getTime() / 1000;
                bizWorkerOrderRepair.setReserveDatetime((int) time);
            } catch (ParseException parseException) {

            }


            bizWorkerOrderRepair.setCid(1);
            Date date = new Date();
            long time = date.getTime() / 1000;

            bizWorkerOrderRepair.setCreateTime((int) time);
            bizWorkerOrderRepair.setLastUpdateTime((int) time);
            return bizWorkerOrderRepair;
        }).collect(Collectors.toList());

        List<List<BizWorkerOrderRepair>> lists = averageAssign(collect, 8);
        for (List<BizWorkerOrderRepair> list : lists) {
            mapper.insertBeatch(list);
        }


    }

    public List<ReparirInfo> getDatas() {
        return datas;
    }

    public void setDatas(List<ReparirInfo> datas) {
        this.datas = datas;
    }


    //把一个list切割成多个小的list
    public static <T> List<List<T>> averageAssign(List<T> source, int n) {
        List<List<T>> result = new ArrayList<List<T>>();
        int remainder = source.size() % n;  //(先计算出余数)
        int number = source.size() / n;  //然后是商
        int offset = 0;//偏移量
        for (int i = 0; i < n; i++) {
            List<T> value = null;
            if (remainder > 0) {
                value = source.subList(i * number + offset, (i + 1) * number + offset + 1);
                remainder--;
                offset++;
            } else {
                value = source.subList(i * number + offset, (i + 1) * number + offset);
            }
            result.add(value);
        }
        return result;
    }
}
