package com.liujia.base;
/**
 * Copyright 2017-2025 Evergrande Group.
 */

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @author: maofujiang
 * @Date: 2020-3-26
 */
@Data
public class MpBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    // 注意！这里需要标记为填充字段
    /**
     * 主键
     */
    @TableId(value = "uuid", type = IdType.INPUT)
    private String uuid;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 创建者
     */
    @TableField(value = "create_user", fill = FieldFill.INSERT)
    private String createUser;

    /**
     * 更新者
     */
    @TableField(value = "update_user", fill = FieldFill.INSERT_UPDATE)
    private String updateUser;

    /**
     * 是否删除标志  0 删除 1 保留
     */
    @TableField(value = "delete_flag", fill = FieldFill.INSERT)
    private Integer deleteFlag;

}
