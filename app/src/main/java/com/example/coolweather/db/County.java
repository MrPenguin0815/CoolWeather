package com.example.coolweather.db;

public class County {
    private int id;
    /**
     * 记录当前县对应的天气id
     */
    private String weatherId;
    /**
     * 记录县的名字
     */
    private String countyName;
    /**
     * 记录当前区县所属市的id
     */
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
