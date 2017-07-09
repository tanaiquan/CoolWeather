package com.coolweather.app.model;

/**
 * Entity city
 * Created by tanaq on 17-7-9.
 */

public class City {
    private int id;
    private String cityName; //名称
    private String cityCode; //代号
    private int provinceId;  //省ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
