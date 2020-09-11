package com.example.quanlyvemaybay2.viewmodel;

import androidx.lifecycle.MutableLiveData;

import com.example.quanlyvemaybay2.model.CityCode;
import com.example.quanlyvemaybay2.repository.CityCodeRepository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class CityCodeViewModel {
    private MutableLiveData<ArrayList<String>> mList;

    private CityCodeRepository cityCodeRepository;
    private CompositeDisposable disposable = new CompositeDisposable();
    private MutableLiveData<List<CityCode>> modCityCodeMutableLiveData = new MutableLiveData<>();


    @Inject
    public CityCodeViewModel(CityCodeRepository cityCodeRepository) {
        this.cityCodeRepository = cityCodeRepository;
    }

    public MutableLiveData<List<CityCode>> getModCityCodeMutableLiveData() {
        loadData();
        return modCityCodeMutableLiveData;
    }

    private void loadData() {
        disposable.add(cityCodeRepository.modelSingle().observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<List<CityCode>>() {
                    @Override
                    public void onSuccess(List<CityCode> cityCodes) {
                        getModCityCodeMutableLiveData().setValue(cityCodes);
                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }
                }));
    }

}
