package com.example.quanlyvemaybay2.utils;

import com.example.quanlyvemaybay2.Retrofit.RetrofitClient;
import com.example.quanlyvemaybay2.interFace.APIService;

public class ApiServiceUtils {
    public static final String BASE_URL = "http://10.0.2.2";

    private ApiServiceUtils() {
    }

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
