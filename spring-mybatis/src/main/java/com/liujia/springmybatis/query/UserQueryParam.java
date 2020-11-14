package com.liujia.springmybatis.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户分页查询参数")
public class UserQueryParam {
    @ApiModelProperty(value = "页数",name = "pageNum",required = true)
    private Integer pageNum;
    @ApiModelProperty(value = "长度",name = "pageSize",required = true)
    private Integer pageSize;

    @ApiModelProperty(value = "昵称",name = "nikeName",required = false)
    private String nickName;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getNikeName() {
        return nickName;
    }

    public void setNikeName(String nikeName) {
        this.nickName = nikeName;
    }
}
