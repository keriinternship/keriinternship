package com.example.quanlyvemaybay.Frament;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.quanlyvemaybay.R;

public class HomeFrament extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.main_layout ,container ,false);
        Animation animation = AnimationUtils.loadAnimation( getContext(), R.anim.bg_circle_rotate );
        return  view;
    }
    @Override
    public void onClick(View v) {

    }
}
