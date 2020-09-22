package com.example.quanlyvemaybay2.interfaces;

import com.example.quanlyvemaybay2.model.CityCode;
import com.example.quanlyvemaybay2.model.Plane;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIPlane {
    @GET("/QL_Planes/api_planes.php")
    Call<List<Plane>>getApi_plane(@Query("planes_id") int planes_id);
}
