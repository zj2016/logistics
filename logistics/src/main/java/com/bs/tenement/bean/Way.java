package com.bs.tenement.bean;

public class Way {
    private Integer id;

    private String wNo;

    private String addr;

    private Integer createTime;

    private String oId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getwNo() {
        return wNo;
    }

    public void setwNo(String wNo) {
        this.wNo = wNo == null ? null : wNo.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }
}