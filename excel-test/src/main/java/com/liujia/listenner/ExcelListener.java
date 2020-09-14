package com.liujia.listenner;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.liujia.entity.LoanInfo;

import java.util.ArrayList;
import java.util.List;


/**
 * 每解析一行会回调invoke()方法。
 * 整个excel解析结束会执行doAfterAllAnalysed()方法
 *
 * @author ex_111806190
 * @since 2020-9-14 9:52
 */
public class ExcelListener extends AnalysisEventListener {
    //自定义用于暂时存储data。
    //可以通过实例获取该值
    private List<LoanInfo> datas = new ArrayList<LoanInfo>();

    private void doSomething(LoanInfo object) {
        System.out.println("doSomething");
        //1、入库调用接口
    }

    @Override
    public void invoke(Object o, AnalysisContext context) {
        System.out.println("当前行：" + context.getCurrentRowNum());
        if (o instanceof LoanInfo) {
            LoanInfo loanInfo = (LoanInfo) o;
            datas.add(loanInfo);//数据存储到list，供批量处理，或后续自己业务逻辑处理。
            doSomething(loanInfo);//根据自己业务做处理
        }
    }

    public void doAfterAllAnalysed(AnalysisContext context) {
        System.out.println("doAfterAllAnalysed");
    }

    public List<LoanInfo> getDatas() {
        return datas;
    }

    public void setDatas(List<LoanInfo> datas) {
        this.datas = datas;
    }
}
