package com.qf.hzx.entity;

public class UserAddress {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer uId;

    /**
     * 收货人
     */
    private String name;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 省份
     */
    private String provinces;

    /**
     * 城市
     */
    private String city;

    /**
     * 区、县
     */
    private String region;

    /**
     * 详细地址
     */
    private String detailedAddress;

    /**
     * 0表示未删除，1表示删除
     */
    private Integer isDel;

    @Override
    public String toString() {
        return "UserAddressMapper{" +
                "id=" + id +
                ", uId=" + uId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", provinces='" + provinces + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}

