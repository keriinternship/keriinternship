package com.example.quanlyvemaybay2.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.quanlyvemaybay2.R;
import com.google.android.material.button.MaterialButton;

public class DialogInforLight extends Dialog implements android.view.View.OnClickListener  {
    public Activity activity;
    public Dialog dialog;
    public MaterialButton yes;



    public DialogInforLight(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.information_flight_layout);
        yes =  findViewById(R.id.btn_tieptuc);
        yes.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        dismiss();
    }

}
