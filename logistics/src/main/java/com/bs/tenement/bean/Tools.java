package com.bs.tenement.bean;

public class Tools {
    private Integer id;

    private String tNo;

    private String yType;

    private Integer num;

    private Integer maxWeight;

    private Integer maxBulk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo == null ? null : tNo.trim();
    }

    public String getyType() {
        return yType;
    }

    public void setyType(String yType) {
        this.yType = yType == null ? null : yType.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Integer getMaxBulk() {
        return maxBulk;
    }

    public void setMaxBulk(Integer maxBulk) {
        this.maxBulk = maxBulk;
    }
}