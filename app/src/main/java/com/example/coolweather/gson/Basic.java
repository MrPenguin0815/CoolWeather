package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //由于返回的json数据中 一些属性名 （主要因为缩写或歧义）不适合作为这个实体类的 java属性名
    //所以用 @SerializedName注释的方式让json属性和java属性建立映射关系

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
