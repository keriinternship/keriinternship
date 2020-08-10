package com.example.quanlyvemaybay.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * IDE: Android Studio
 * Created by Nguyen Van Hao
 * Name package com.example.quanlyvemaybay.Retrofit;
 * Name project: QuanLyVeMayBay
 * Date: 27/7/2020
 * Time: 9h30
 */
public class RetrofitClient {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl( baseUrl )
                    .addConverterFactory( GsonConverterFactory.create())
                    .build();
        }
        return  retrofit;
    }
}
