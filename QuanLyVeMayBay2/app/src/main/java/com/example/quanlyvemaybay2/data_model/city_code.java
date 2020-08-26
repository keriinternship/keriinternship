package com.example.quanlyvemaybay2.data_model;

public class city_code {
    String name_city, maCode;

    public city_code(String name_city, String maCode) {
        this.name_city = name_city;
        this.maCode = maCode;
    }

    public city_code() {
    }

    public String getName_city() {
        return name_city;
    }

    public void setName_city(String name_city) {
        this.name_city = name_city;
    }

    public String getMaCode() {
        return maCode;
    }

    public void setMaCode(String maCode) {
        this.maCode = maCode;
    }

    @Override
    public String toString() {
        return "city_code{" +
                "name_city='" + name_city + '\'' +
                ", maCode='" + maCode + '\'' +
                '}';
    }
}
