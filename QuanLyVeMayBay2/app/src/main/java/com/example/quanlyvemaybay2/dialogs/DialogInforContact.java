package com.example.quanlyvemaybay2.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.quanlyvemaybay2.R;
import com.google.android.material.button.MaterialButton;

public class DialogInforContact extends Dialog implements android.view.View.OnClickListener {
    public Activity activity;
    public Dialog dialog;
    public MaterialButton yes, no;


    public DialogInforContact(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_infor_contact_layout);
        yes =  findViewById(R.id.btn_Huy);
        no =  findViewById(R.id.btn_Dongy);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Huy:
                break;
            case R.id.btn_Dongy:
                break;
            default:
                break;
        }
        dismiss();
    }

}
