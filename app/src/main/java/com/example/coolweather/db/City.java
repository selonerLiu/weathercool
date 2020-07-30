package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private int cityCode;
    private int provinceId;
    private String cityName;

    public int getId() {
        return id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
