package com.coolweather.app.model;

/**
 * Entity province
 * Created by tanaq on 17-7-9.
 */

public class Province {
    private int id;
    private String provinceName; //名称
    private String provinceCode; //代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}
