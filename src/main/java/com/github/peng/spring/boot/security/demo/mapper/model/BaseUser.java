package com.github.peng.spring.boot.security.demo.mapper.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "base_user")
public class BaseUser {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_PASSWORD")
    private String userPassword;

    @Column(name = "NIKE_NAME")
    private String nikeName;

    /**
     * 1 正常，2 禁用
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return USER_PASSWORD
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return NIKE_NAME
     */
    public String getNikeName() {
        return nikeName;
    }

    /**
     * @param nikeName
     */
    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    /**
     * 获取1 正常，2 禁用
     *
     * @return STATUS - 1 正常，2 禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1 正常，2 禁用
     *
     * @param status 1 正常，2 禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}