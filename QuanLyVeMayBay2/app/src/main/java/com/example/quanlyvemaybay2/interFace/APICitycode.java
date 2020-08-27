package com.example.quanlyvemaybay2.interFace;

import com.example.quanlyvemaybay2.data_model.city_code;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;

public interface APICitycode {
    // GET students from server
    // Server return json array
    @GET("/QL_Planes/api_citycode.php")
    Call<List<city_code>> getApi_citycode();
}
