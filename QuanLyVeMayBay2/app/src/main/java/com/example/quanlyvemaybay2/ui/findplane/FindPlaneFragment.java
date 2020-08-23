package com.example.quanlyvemaybay2.ui.findplane;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.quanlyvemaybay2.R;

public class FindPlaneFragment extends Fragment {
    private ImageButton ibtnSwap;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_find_plane_layout, container, false);
        ibtnSwap = root.findViewById(R.id.ibtnSwap);
        ibtnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation myAnim= AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
                ibtnSwap.startAnimation(myAnim);
            }
        });
        return root;
    }
}
