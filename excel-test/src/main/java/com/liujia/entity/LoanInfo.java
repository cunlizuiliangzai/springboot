package com.liujia.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;


/**
 * @author ex_111806190
 * @since 2020-9-14 9:59
 */
@Data
public class LoanInfo extends BaseRowModel {


    @ExcelProperty(value = "id", index = 0)
    private String id;

    @ExcelProperty(value = "name", index = 1)
    private String name;

}
