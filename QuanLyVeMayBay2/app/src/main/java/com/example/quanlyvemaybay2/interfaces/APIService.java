package com.example.quanlyvemaybay2.interfaces;

import com.example.quanlyvemaybay2.data_model.AirTicket;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    // GET students from server
    // Server return json array
    @GET("/QL_Planes/api_air.php")
    Call<List<AirTicket>>getApi_air(@Query("diemdi") String diemdi , @Query("diemden") String diemden , @Query("ngaydi") String ngaydi);
}
