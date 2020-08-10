package com.example.quanlyvemaybay.InterFace;

import com.example.quanlyvemaybay.models.AirTicket;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * IDE: Android Studio
 * Created by Nguyen Van Hao
 * Name package com.example.quanlyvemaybay.InterFace;
 * Name project: QuanLyVeMayBay
 * Date: 27/7/2020
 * Time: 9h30
 */
public interface APIService  {
        // GET students from server
        // Server return json array
        @GET("/QL_Planes/api_air.php")
        Call<List<AirTicket>>getApi_air();
}
