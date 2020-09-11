package com.example.quanlyvemaybay2.di.components;


import com.example.quanlyvemaybay2.MainActivity;
import com.example.quanlyvemaybay2.di.modules.ContextModule;
import com.example.quanlyvemaybay2.di.modules.NetworkModule;
import com.example.quanlyvemaybay2.ui.findplane.FindPlaneFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class, ContextModule.class})
public interface AppComponent {
    void inject(FindPlaneFragment mFindPlaneFragment);
}
