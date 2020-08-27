package com.example.quanlyvemaybay2.data_model;

public class city_code {
    int city_id;
    String name_city, code;

    public city_code() {
    }

    public city_code(int city_id, String name_city, String code) {
        this.city_id = city_id;
        this.name_city = name_city;
        this.code = code;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getName_city() {
        return name_city;
    }

    public void setName_city(String name_city) {
        this.name_city = name_city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return name_city + "(" + code + ")" ;
    }
}
