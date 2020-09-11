package com.example.quanlyvemaybay2.remote;

import com.example.quanlyvemaybay2.model.Age;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIAge {
    @GET("/QL_Planes/api_age.php")
    Call<List<Age>>getApi_air();
}
