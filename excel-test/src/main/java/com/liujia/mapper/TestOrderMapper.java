package com.liujia.mapper;

import com.liujia.entity.ShopOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 测试而已 Mapper 接口
 * </p>
 *
 * @author liujia
 * @since 2020-09-15
 */
public interface TestOrderMapper  {

    ShopOrder getShopOrderList(String businessId) ;
}
