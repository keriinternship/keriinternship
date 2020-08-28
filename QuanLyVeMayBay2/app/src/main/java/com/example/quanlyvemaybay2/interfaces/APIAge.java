package com.example.quanlyvemaybay2.interFace;

import com.example.quanlyvemaybay2.data_model.age;
import com.example.quanlyvemaybay2.data_model.city_code;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIAge {
    @GET("/QL_Planes/api_age.php")
    Call<List<age>> getApi_air();
}
