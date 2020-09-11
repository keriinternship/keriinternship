package com.example.quanlyvemaybay2.repository;

import com.example.quanlyvemaybay2.model.CityCode;
import com.example.quanlyvemaybay2.remote.APICitycode;
import com.example.quanlyvemaybay2.remote.APIService;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class CityCodeRepository {
    private APICitycode apiCitycode;

    @Inject
    public CityCodeRepository(APICitycode apiCitycode){
        this.apiCitycode = apiCitycode;
    }

    public Single<List<CityCode>> modelSingle(){
        return apiCitycode.getApi_citycode();
    }
}
