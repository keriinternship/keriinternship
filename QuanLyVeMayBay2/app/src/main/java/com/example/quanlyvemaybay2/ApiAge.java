package com.example.quanlyvemaybay2;

import com.example.quanlyvemaybay2.Retrofit.RetrofitClient;
import com.example.quanlyvemaybay2.interFace.APIService;

public class ApiAge {
    public static final String BASE_URL = "http://10.0.2.2";

    private ApiAge() {
    }

    public static ApiAge getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(ApiAge.class);
    }
}
