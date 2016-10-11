package com.lanhun.framework.orm.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class User {
    /**
     * id(主键)
     */
    @Id
    @Column(name = "f_id")
    private String id;

    /**
     * 编码
     */
    @Column(name = "f_number")
    private String number;

    /**
     * 名称
     */
    @Column(name = "f_name")
    private String name;

    /**
     * 创建时间
     */
    @Column(name = "f_create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "f_last_modify_time")
    private Date lastModifyTime;

    /**
     * 创建人
     */
    @Column(name = "f_creator")
    private String creator;

    /**
     * 修改人
     */
    @Column(name = "f_last_modifier")
    private String lastModifier;

    /**
     * 获取id(主键)
     *
     * @return f_id - id(主键)
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id(主键)
     *
     * @param id id(主键)
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取编码
     *
     * @return f_number - 编码
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置编码
     *
     * @param number 编码
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取名称
     *
     * @return f_name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取创建时间
     *
     * @return f_create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return f_last_modify_time - 修改时间
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param lastModifyTime 修改时间
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    /**
     * 获取创建人
     *
     * @return f_creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取修改人
     *
     * @return f_last_modifier - 修改人
     */
    public String getLastModifier() {
        return lastModifier;
    }

    /**
     * 设置修改人
     *
     * @param lastModifier 修改人
     */
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }
}