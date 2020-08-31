package com.example.quanlyvemaybay2.utils;

import com.example.quanlyvemaybay2.Retrofit.RetrofitClient;


public class ApiAgeUtils {
    public static final String BASE_URL = "http://10.0.2.2";

    private ApiAgeUtils() {
    }

    public static ApiAgeUtils getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(ApiAgeUtils.class);
    }
}
