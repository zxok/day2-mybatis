package com.qf.hzx.entity;

import java.util.Date;
import java.util.List;

public class Order {
    /**
     * 主键
     */
    private Integer oId;

    /**
     * 订单号
     */
    private String oNo;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 用户
     */
    private Integer uId;

    /**
     * 1表示删除，0表示未删除
     */
    private Integer isDel;

    private User user;
    private List<OrderItem> orderItemsList;


    @Override
    public String toString() {
        return "Order{" +
                "oId=" + oId +
                ", oNo='" + oNo + '\'' +
                ", createDate=" + createDate +
                ", uId=" + uId +
                ", user=" + user +
                ", orderItemsList=" + orderItemsList +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderItem> getOrderItemsList() {
        return orderItemsList;
    }

    public void setOrderItemsList(List<OrderItem> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getoNo() {
        return oNo;
    }

    public void setoNo(String oNo) {
        this.oNo = oNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}

