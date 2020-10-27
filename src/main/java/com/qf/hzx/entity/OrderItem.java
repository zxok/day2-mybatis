package com.qf.hzx.entity;

public class OrderItem {
    /**
     * id主键
     */
    private Integer id;

    /**
     * 订单id
     */
    private Integer oId;

    /**
     * 订单号
     */
    private String oNo;

    /**
     * 商品名
     */
    private String oiName;

    /**
     * 商品图片
     */
    private String oiImg;

    /**
     * 数量
     */
    private Integer oiSize;

    /**
     * 1表示删除，0表示未删除
     */
    private Integer isDel;

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", oId=" + oId +
                ", oNo='" + oNo + '\'' +
                ", oiName='" + oiName + '\'' +
                ", oiImg='" + oiImg + '\'' +
                ", oiSize=" + oiSize +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getOiName() {
        return oiName;
    }

    public void setOiName(String oiName) {
        this.oiName = oiName;
    }

    public String getOiImg() {
        return oiImg;
    }

    public void setOiImg(String oiImg) {
        this.oiImg = oiImg;
    }

    public Integer getOiSize() {
        return oiSize;
    }

    public void setOiSize(Integer oiSize) {
        this.oiSize = oiSize;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}

