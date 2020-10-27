package com.qf.hzx.entity;

import java.util.List;

public class Roles {
    /**
     * 角色主键id
     */
    private Integer rId;

    /**
     * 角色名称
     */
    private String rName;

    /**
     * 角色说明
     */
    private String declare;

    /**
     * 0表示位删除，1表示删除
     */
    private Integer isDel;

    private List<Privilege> privileges;

    @Override
    public String toString() {
        return "Roles{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", declare='" + declare + '\'' +
                ", privileges=" + privileges +
                '}';
    }

    public Roles() {
    }

    public Roles(Integer rId, String rName, String declare, List<Privilege> privileges) {
        this.rId = rId;
        this.rName = rName;
        this.declare = declare;
        this.privileges = privileges;
    }

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
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

