package com.example.quanlyvemaybay2;

import com.example.quanlyvemaybay2.Retrofit.RetrofitClient;
import com.example.quanlyvemaybay2.interFace.APIService;

public class ApiUtils {
    public static final String BASE_URL = "http://10.0.2.2";

    private ApiUtils() {
    }

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
