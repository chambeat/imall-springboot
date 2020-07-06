package com.chm.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Goods implements Serializable {

    private Integer id;
    private String gName;
    private Double gPrice;
    private Integer gStock;
    private String gType;
    private String gOrigin;

    public Goods() {
    }

    public Goods(Integer id, String gName, Double gPrice, Integer gStock, String gType, String gOrigin) {
        this.id = id;
        this.gName = gName;
        this.gPrice = gPrice;
        this.gStock = gStock;
        this.gType = gType;
        this.gOrigin = gOrigin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //@JsonProperty("gName")
    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    //@JsonProperty("gPrice")
    public Double getgPrice() {
        return gPrice;
    }

    public void setgPrice(Double gPrice) {
        this.gPrice = gPrice;
    }

    //@JsonProperty("gStock")
    public Integer getgStock() {
        return gStock;
    }

    public void setgStock(Integer gStock) {
        this.gStock = gStock;
    }

    //@JsonProperty("gType")
    public String getgType() {
        return gType;
    }

    public void setgType(String gType) {
        this.gType = gType;
    }

    //@JsonProperty("gOrigin")
    public String getgOrigin() {
        return gOrigin;
    }

    public void setgOrigin(String gOrigin) {
        this.gOrigin = gOrigin;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", gName='" + gName + '\'' +
                ", gPrice=" + gPrice +
                ", gStock=" + gStock +
                ", gType='" + gType + '\'' +
                ", gOrigin='" + gOrigin + '\'' +
                '}';
    }
}
