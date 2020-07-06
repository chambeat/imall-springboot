package com.chm.bean;

import java.io.Serializable;

/**
 * 商品搜索条件类（暂未使用）
 */
public class GoodsSearchMap implements Serializable {

    private String gName;
    private String gType;

    public GoodsSearchMap() {
    }

    public GoodsSearchMap(String gName, String gType) {
        this.gName = gName;
        this.gType = gType;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgType() {
        return gType;
    }

    public void setgType(String gType) {
        this.gType = gType;
    }

    @Override
    public String toString() {
        return "GoodsSearchMap{" +
                "gName='" + gName + '\'' +
                ", gType='" + gType + '\'' +
                '}';
    }
}
