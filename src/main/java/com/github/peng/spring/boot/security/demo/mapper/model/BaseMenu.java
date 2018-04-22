package com.github.peng.spring.boot.security.demo.mapper.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "base_menu")
public class BaseMenu {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "MENU_URL")
    private String menuUrl;

    @Column(name = "MENU_SEQ")
    private String menuSeq;

    @Column(name = "MENU_PARENT_ID")
    private Integer menuParentId;

    @Column(name = "MENU_NAME")
    private String menuName;

    @Column(name = "MENU_ICON")
    private String menuIcon;

    @Column(name = "MENU_ORDER")
    private String menuOrder;

    /**
     * 1 是 0 否
     */
    @Column(name = "IS_LEAF")
    private String isLeaf;

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
     * @return MENU_URL
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * @param menuUrl
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * @return MENU_SEQ
     */
    public String getMenuSeq() {
        return menuSeq;
    }

    /**
     * @param menuSeq
     */
    public void setMenuSeq(String menuSeq) {
        this.menuSeq = menuSeq;
    }

    /**
     * @return MENU_PARENT_ID
     */
    public Integer getMenuParentId() {
        return menuParentId;
    }

    /**
     * @param menuParentId
     */
    public void setMenuParentId(Integer menuParentId) {
        this.menuParentId = menuParentId;
    }

    /**
     * @return MENU_NAME
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return MENU_ICON
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * @param menuIcon
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    /**
     * @return MENU_ORDER
     */
    public String getMenuOrder() {
        return menuOrder;
    }

    /**
     * @param menuOrder
     */
    public void setMenuOrder(String menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * 获取1 是 0 否
     *
     * @return IS_LEAF - 1 是 0 否
     */
    public String getIsLeaf() {
        return isLeaf;
    }

    /**
     * 设置1 是 0 否
     *
     * @param isLeaf 1 是 0 否
     */
    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }
}