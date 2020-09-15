package com.liujia.mapper;

import com.liujia.entity.BizWorkerOrderRepair;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * <p>
 * 维修工单表 Mapper 接口
 * </p>
 *
 * @author liujia
 * @since 2020-09-14
 */
@Mapper
public interface BizWorkerOrderRepairMapper extends BaseMapper<BizWorkerOrderRepair> {

    void insertBeatch(List<BizWorkerOrderRepair> list);

    BizWorkerOrderRepair getOrderById(String id);
}
