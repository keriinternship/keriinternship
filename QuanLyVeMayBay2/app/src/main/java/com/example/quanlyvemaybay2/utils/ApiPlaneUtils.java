package com.example.quanlyvemaybay2.utils;

import com.example.quanlyvemaybay2.Retrofit.RetrofitClient;
import com.example.quanlyvemaybay2.interfaces.APICitycode;
import com.example.quanlyvemaybay2.interfaces.APIPlane;

public class ApiPlaneUtils {
    public static final String BASE_URL = "http://10.0.2.2";

    private ApiPlaneUtils() {
    }

    public static APIPlane getApiPlanes() {

        return RetrofitClient.getClient(BASE_URL).create(APIPlane.class);
    }
}
