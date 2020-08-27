package com.example.quanlyvemaybay2.interFace;

import com.example.quanlyvemaybay2.data_model.air_ticket;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    // GET students from server
    // Server return json array
    @GET("/QL_Planes/api_air.php")
    Call<List<air_ticket>>getApi_air(@Query("diemdi") String diemdi , @Query("diemden") String diemden , @Query("ngaydi") String ngaydi);
}
