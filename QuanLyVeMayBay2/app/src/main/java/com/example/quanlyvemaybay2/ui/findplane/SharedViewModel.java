package com.example.quanlyvemaybay2.ui.findplane;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class SharedViewModel extends ViewModel {
    private MutableLiveData<ArrayList<String>> mList;

    public SharedViewModel(ArrayList<String> list){
        mList = new MutableLiveData<ArrayList<String>>();
        mList.setValue(list);
    }

    public LiveData<ArrayList<String>> getmList() {
        return mList;
    }

}
