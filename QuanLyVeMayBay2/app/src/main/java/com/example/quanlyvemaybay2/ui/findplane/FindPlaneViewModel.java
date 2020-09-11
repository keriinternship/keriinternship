package com.example.quanlyvemaybay2.ui.findplane;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.quanlyvemaybay2.model.CityCode;
import com.example.quanlyvemaybay2.repository.CityCodeRepository;

import java.util.ArrayList;

import io.reactivex.disposables.CompositeDisposable;

public class FindPlaneViewModel extends ViewModel {
    private MutableLiveData<ArrayList<String>> mList;

//    private CityCodeRepository cityCodeRepository;
//    private CompositeDisposable disposable = new CompositeDisposable();
//    private MutableLiveData<CityCode> modCityCodeMutableLiveData = new MutableLiveData<>();

    public FindPlaneViewModel(ArrayList<String> list){
        mList = new MutableLiveData<ArrayList<String>>();
        mList.setValue(list);
    }

    public LiveData<ArrayList<String>> getmList() {
        return mList;
    }

}
