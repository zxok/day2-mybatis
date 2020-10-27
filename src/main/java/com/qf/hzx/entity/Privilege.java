package com.qf.hzx.entity;

public class Privilege {
    /**
     * 权限主键id
     */
    private Integer pId;

    /**
     * 权限名称
     */
    private String pName;

    /**
     * 权限说明
     */
    private String declare;

    /**
     * 0表示位删除，1表示删除
     */
    private Integer isDel;

    public Privilege() {
    }

    public Privilege(Integer pId, String pName, String declare) {
        this.pId = pId;
        this.pName = pName;
        this.declare = declare;
    }

    @Override
    public String toString() {
        return "Privilege{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", declare='" + declare + '\'' +
                ", isDel=" + isDel +
                '}';
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getDeclare() {
        return declare;
    }

    public void setDeclare(String declare) {
        this.declare = declare;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}

