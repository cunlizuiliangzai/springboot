package com.liujia.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author ex_111806190
 * @since 2020-9-15 10:39
 */
@Data
public class ShopOrder {

    private String shopName;

    private String logoAddress;

    private List<MonthOrder> monthOrderlist;

}

@Data
class Order {

    private static final long serialVersionUID = 1L;

    private String id;

    private String payStatus;

    private String settleAccountType;

    private BigDecimal payMoney;

    private Date createDate;
}

@Data
class DayOrder {

    private String days;

    private List<Order> orders;

}

@Data
class MonthOrder {

    private String months;

    private Integer num;

    private BigDecimal amount;

    private List<DayOrder> dayOrders;

}




