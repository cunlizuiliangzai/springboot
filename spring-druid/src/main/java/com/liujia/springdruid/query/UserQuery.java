package com.liujia.springdruid.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "查询参数")
public class UserQuery {
    @ApiModelProperty(name = "pageSize",value = "页数",example = "10")
    private Integer pageSize;
    @ApiModelProperty(name = "pageNum",value = "页码",example = "1")
    private Integer pageNum;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
