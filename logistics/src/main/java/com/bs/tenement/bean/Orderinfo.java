package com.bs.tenement.bean;

public class Orderinfo {
    private Integer id;

    private String oId;

    private String jName;

    private String jPhone;

    private String jAddr;

    private String sName;

    private String sPhone;

    private String sAddr;

    private String wDesc;

    private String wType;

    private Integer wWeight;

    private Integer wBulk;

    private String yType;

    private Integer price;

    private Integer status;

    private Long createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public String getjName() {
        return jName;
    }

    public void setjName(String jName) {
        this.jName = jName == null ? null : jName.trim();
    }

    public String getjPhone() {
        return jPhone;
    }

    public void setjPhone(String jPhone) {
        this.jPhone = jPhone == null ? null : jPhone.trim();
    }

    public String getjAddr() {
        return jAddr;
    }

    public void setjAddr(String jAddr) {
        this.jAddr = jAddr == null ? null : jAddr.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public String getsAddr() {
        return sAddr;
    }

    public void setsAddr(String sAddr) {
        this.sAddr = sAddr == null ? null : sAddr.trim();
    }

    public String getwDesc() {
        return wDesc;
    }

    public void setwDesc(String wDesc) {
        this.wDesc = wDesc == null ? null : wDesc.trim();
    }

    public String getwType() {
        return wType;
    }

    public void setwType(String wType) {
        this.wType = wType == null ? null : wType.trim();
    }

    public Integer getwWeight() {
        return wWeight;
    }

    public void setwWeight(Integer wWeight) {
        this.wWeight = wWeight;
    }

    public Integer getwBulk() {
        return wBulk;
    }

    public void setwBulk(Integer wBulk) {
        this.wBulk = wBulk;
    }

    public String getyType() {
        return yType;
    }

    public void setyType(String yType) {
        this.yType = yType == null ? null : yType.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}