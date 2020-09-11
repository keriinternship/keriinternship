package com.example.quanlyvemaybay2.utils;

import com.example.quanlyvemaybay2.Retrofit.RetrofitClient;
import com.example.quanlyvemaybay2.remote.APIService;

public class ApiServiceUtils {
    public static final String BASE_URL = "http://localhost";

    private ApiServiceUtils() {
    }

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
