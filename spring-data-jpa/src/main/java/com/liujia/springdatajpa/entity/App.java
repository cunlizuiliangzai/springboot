package com.liujia.springdatajpa.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
// @Table: 对应数据库中的表, 必须, name=表名, Indexes是声明表里的索引, columnList是索引的列, 同时声明此索引列是否唯一, 默认false
//@Table(name = "app", indexes = {@Index(name = "id", columnList = "id", unique = true), @Index(name = "name", columnList = "name", unique = true)})
public class App {
    /**
     * 主键
     */
    @Id // @Id: 指明id列, 必须
    @GeneratedValue(strategy = GenerationType.IDENTITY) // @GeneratedValue： 表明是否自动生成, 必须, strategy也是必写, 指明主键生成策略, 默认是Oracle
    private Integer id;

    /**
     * AppID
     */
    private String appid;

    /**
     * 应用名
     */
//    @Column(name = "name", nullable = false) // @Column： 对应数据库列名,可选, nullable 是否可以为空, 默认true
    private String name;

    /**
     * 部门Id
     */
    private String orgid;

    /**
     * 部门名字
     */
    private String orgname;

    /**
     * ownerName
     */
    private String ownername;

    /**
     * ownerEmail
     */
    private String owneremail;

    /**
     * 1: deleted, 0: normal
     */
    private Boolean isdeleted;

    /**
     * 创建人邮箱前缀
     */
    private String datachangeCreatedby;

    /**
     * 创建时间
     */
    private Date datachangeCreatedtime;

    /**
     * 最后修改人邮箱前缀
     */
    private String datachangeLastmodifiedby;

    /**
     * 最后修改时间
     */
    private Date datachangeLasttime;

    /**
     * app
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return Id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * AppID
     * @return AppId AppID
     */
    public String getAppid() {
        return appid;
    }

    /**
     * AppID
     * @param appid AppID
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * 应用名
     * @return Name 应用名
     */
    public String getName() {
        return name;
    }

    /**
     * 应用名
     * @param name 应用名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 部门Id
     * @return OrgId 部门Id
     */
    public String getOrgid() {
        return orgid;
    }

    /**
     * 部门Id
     * @param orgid 部门Id
     */
    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    /**
     * 部门名字
     * @return OrgName 部门名字
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * 部门名字
     * @param orgname 部门名字
     */
    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    /**
     * ownerName
     * @return OwnerName ownerName
     */
    public String getOwnername() {
        return ownername;
    }

    /**
     * ownerName
     * @param ownername ownerName
     */
    public void setOwnername(String ownername) {
        this.ownername = ownername == null ? null : ownername.trim();
    }

    /**
     * ownerEmail
     * @return OwnerEmail ownerEmail
     */
    public String getOwneremail() {
        return owneremail;
    }

    /**
     * ownerEmail
     * @param owneremail ownerEmail
     */
    public void setOwneremail(String owneremail) {
        this.owneremail = owneremail == null ? null : owneremail.trim();
    }

    /**
     * 1: deleted, 0: normal
     * @return IsDeleted 1: deleted, 0: normal
     */
    public Boolean getIsdeleted() {
        return isdeleted;
    }

    /**
     * 1: deleted, 0: normal
     * @param isdeleted 1: deleted, 0: normal
     */
    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    /**
     * 创建人邮箱前缀
     * @return DataChange_CreatedBy 创建人邮箱前缀
     */
    public String getDatachangeCreatedby() {
        return datachangeCreatedby;
    }

    /**
     * 创建人邮箱前缀
     * @param datachangeCreatedby 创建人邮箱前缀
     */
    public void setDatachangeCreatedby(String datachangeCreatedby) {
        this.datachangeCreatedby = datachangeCreatedby == null ? null : datachangeCreatedby.trim();
    }

    /**
     * 创建时间
     * @return DataChange_CreatedTime 创建时间
     */
    public Date getDatachangeCreatedtime() {
        return datachangeCreatedtime;
    }

    /**
     * 创建时间
     * @param datachangeCreatedtime 创建时间
     */
    public void setDatachangeCreatedtime(Date datachangeCreatedtime) {
        this.datachangeCreatedtime = datachangeCreatedtime;
    }

    /**
     * 最后修改人邮箱前缀
     * @return DataChange_LastModifiedBy 最后修改人邮箱前缀
     */
    public String getDatachangeLastmodifiedby() {
        return datachangeLastmodifiedby;
    }

    /**
     * 最后修改人邮箱前缀
     * @param datachangeLastmodifiedby 最后修改人邮箱前缀
     */
    public void setDatachangeLastmodifiedby(String datachangeLastmodifiedby) {
        this.datachangeLastmodifiedby = datachangeLastmodifiedby == null ? null : datachangeLastmodifiedby.trim();
    }

    /**
     * 最后修改时间
     * @return DataChange_LastTime 最后修改时间
     */
    public Date getDatachangeLasttime() {
        return datachangeLasttime;
    }

    /**
     * 最后修改时间
     * @param datachangeLasttime 最后修改时间
     */
    public void setDatachangeLasttime(Date datachangeLasttime) {
        this.datachangeLasttime = datachangeLasttime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appid=").append(appid);
        sb.append(", name=").append(name);
        sb.append(", orgid=").append(orgid);
        sb.append(", orgname=").append(orgname);
        sb.append(", ownername=").append(ownername);
        sb.append(", owneremail=").append(owneremail);
        sb.append(", isdeleted=").append(isdeleted);
        sb.append(", datachangeCreatedby=").append(datachangeCreatedby);
        sb.append(", datachangeCreatedtime=").append(datachangeCreatedtime);
        sb.append(", datachangeLastmodifiedby=").append(datachangeLastmodifiedby);
        sb.append(", datachangeLasttime=").append(datachangeLasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}