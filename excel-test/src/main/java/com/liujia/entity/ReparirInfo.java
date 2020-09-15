package com.liujia.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

import java.util.Date;

/**
 * @author ex_111806190
 * @since 2020-9-14 16:45
 */
@Data
public class ReparirInfo extends BaseRowModel {


    @ExcelProperty(value = "workerOrderNo", index = 1)
    private String orkerOrderNo;

    @ExcelProperty(value = "beginDatetime", index = 2)
    private String beginDatetime;

    @ExcelProperty(value = "operator", index = 3)
    private String operator;


    @ExcelProperty(value = "userName", index = 6)
    private String userName;


    @ExcelProperty(value = "userPhone",index = 8)
    private String userPhone;

    @ExcelProperty(value = "province",index = 9)
    private String province;

    @ExcelProperty(value = "city",index = 10)
    private String city;

    @ExcelProperty(value = "area",index = 11)
    private String area;

    @ExcelProperty(value = "street",index = 12)
    private String street;

    @ExcelProperty(value = "address",index = 13)
    private String address;

    @ExcelProperty(value = "reserveDatetime",index = 17)
    private String reserveDatetime;
}
