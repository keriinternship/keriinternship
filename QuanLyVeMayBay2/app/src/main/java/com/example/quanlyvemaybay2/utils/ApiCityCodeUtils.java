package com.example.quanlyvemaybay2.utils;

import com.example.quanlyvemaybay2.Retrofit.RetrofitClient;
import com.example.quanlyvemaybay2.interfaces.APICitycode;


public class ApiCityCodeUtils {
    public static final String BASE_URL = "http://localhost";

    private ApiCityCodeUtils() {
    }

    public static APICitycode getApiCitycode() {

        return RetrofitClient.getClient(BASE_URL).create(APICitycode.class);
    }
}
