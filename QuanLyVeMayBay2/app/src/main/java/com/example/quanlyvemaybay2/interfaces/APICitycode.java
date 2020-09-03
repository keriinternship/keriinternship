package com.example.quanlyvemaybay2.interfaces;

import com.example.quanlyvemaybay2.model.CityCode;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APICitycode {
    // GET students from server
    // Server return json array
    @GET("/QL_Planes/api_citycode.php")
    Call<List<CityCode>>getApi_citycode();
}
