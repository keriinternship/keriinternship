package com.example.quanlyvemaybay2.utils;

import com.example.quanlyvemaybay2.Retrofit.RetrofitClient;
import com.example.quanlyvemaybay2.interFace.APICitycode;


public class ApiCityCodeUtils {
    public static final String BASE_URL = "http://10.0.2.2";

    private ApiCityCodeUtils() {
    }

    public static APICitycode getApiCitycode() {

        return RetrofitClient.getClient(BASE_URL).create(APICitycode.class);
    }
}
