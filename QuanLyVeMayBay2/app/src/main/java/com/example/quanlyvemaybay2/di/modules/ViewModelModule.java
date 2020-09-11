package com.example.quanlyvemaybay2.di.modules;


import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.quanlyvemaybay2.di.ViewModelKey;
import com.example.quanlyvemaybay2.ui.findplane.FindPlaneViewModel;
import com.example.quanlyvemaybay2.viewmodel.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(FindPlaneViewModel.class)
    abstract ViewModel bindFindPlaneModel(FindPlaneViewModel findPlaneViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindFactory (ViewModelFactory factory);
}
