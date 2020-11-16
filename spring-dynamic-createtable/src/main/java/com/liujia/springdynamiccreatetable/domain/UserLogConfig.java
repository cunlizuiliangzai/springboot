package com.liujia.springdynamiccreatetable.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("用户配置")
public class UserLogConfig implements Serializable {
    /**
     * ���
     */
    @ApiModelProperty(name = "id",value = "id",example = "123")
    private Long id;

    /**
     * �û���
     */
    @ApiModelProperty(name = "name",value = "名称",example = "zhangsan")
    private String name;

    /**
     * �û���Ӧ����־�洢��
     */
    private String table_name;

    /**
     * user_log_config
     */
    private static final long serialVersionUID = 1L;

    /**
     * ���
     * @return id ���
     */
    public Long getId() {
        return id;
    }

    /**
     * ���
     * @param id ���
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * �û���
     * @return name �û���
     */
    public String getName() {
        return name;
    }

    /**
     * �û���
     * @param name �û���
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * �û���Ӧ����־�洢��
     * @return table_name �û���Ӧ����־�洢��
     */
    public String getTable_name() {
        return table_name;
    }

    /**
     * �û���Ӧ����־�洢��
     * @param table_name �û���Ӧ����־�洢��
     */
    public void setTable_name(String table_name) {
        this.table_name = table_name == null ? null : table_name.trim();
    }
}