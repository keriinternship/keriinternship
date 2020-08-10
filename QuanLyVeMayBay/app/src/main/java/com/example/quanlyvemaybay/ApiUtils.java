package com.example.quanlyvemaybay;

import com.example.quanlyvemaybay.InterFace.APIService;
import com.example.quanlyvemaybay.Retrofit.RetrofitClient;

/**
 * IDE: Android Studio
 * Created by Nguyen Van Hao
 * Name package: com.example.quanlyvemaybay;
 * Name project: QuanLyVeMayBay
 * Date: 27/07/2020
 * Time: 9h30
 */
public class ApiUtils {
    public static final String BASE_URL = "http://10.0.2.2";

    private ApiUtils() {
    }

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
