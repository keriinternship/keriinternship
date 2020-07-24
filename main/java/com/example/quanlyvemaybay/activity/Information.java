package com.example.quanlyvemaybay.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quanlyvemaybay.R;
import com.example.quanlyvemaybay.activity.HomeActivity;
import static com.example.quanlyvemaybay.activity.HomeActivity.KEY_DATA;
public class Information extends AppCompatActivity {
    Intent intent;
    Bundle data;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.information_layout);


    }
}
