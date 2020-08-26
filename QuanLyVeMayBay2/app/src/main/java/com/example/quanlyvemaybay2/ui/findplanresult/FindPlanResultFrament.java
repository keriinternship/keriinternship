package com.example.quanlyvemaybay2.ui.findplanresult;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlyvemaybay2.ApiUtils;
import com.example.quanlyvemaybay2.R;
import com.example.quanlyvemaybay2.adapter.RecyclerAdapter;
import com.example.quanlyvemaybay2.data_model.air_ticket;
import com.example.quanlyvemaybay2.interFace.APIService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FindPlanResultFrament extends Fragment {
    RecyclerView listItem;
    private APIService mAPIService;
    TextView tv_maDi, tv_maDen, tv_Date,tv_AgeNguoiLon,tv_AgeTreem;
    Button btnHangHK , btnGiaCuoc;
    View root;
    RecyclerAdapter recyclerAdapter;
    ArrayList<air_ticket> arrayListAir_ticket = new ArrayList<air_ticket>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.find_airticket_layout, container, false);
        init();
        getAllAirsticker();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        listItem.setLayoutManager(layoutManager);
        return root;
    }
    public  void  init()
    {
        tv_maDi = root.findViewById(R.id.tv_maDi);
        tv_maDen = root.findViewById(R.id.tv_maDen);
        tv_Date = root.findViewById(R.id.tv_Date);
        tv_AgeNguoiLon = root.findViewById(R.id.tv_AgeNguoiLon);
        tv_AgeTreem = root.findViewById(R.id.tv_AgeTreem);
        btnHangHK = root.findViewById(R.id.btnHangHK);
        btnGiaCuoc = root.findViewById(R.id.btnGiaCuoc);
        listItem = root.findViewById(R.id.itemFind);
        mAPIService = ApiUtils.getAPIService();
    }

    private void getAllAirsticker() {
        mAPIService.getApi_air("SGN", "HAN", "16/3/2020").enqueue(new Callback<List<air_ticket>>() {
            @Override
            public void onResponse(Call<List<air_ticket>> call, Response<List<air_ticket>> response) {
                try {
                    String result = "";

                    for (int i = 0; i < response.body().size(); i++) {
                        arrayListAir_ticket.add(response.body().get(i));

                    }
                    recyclerAdapter = new RecyclerAdapter(getContext(), arrayListAir_ticket);
                    listItem.setAdapter(recyclerAdapter);
                } catch (Exception e) {
                    Log.d("onResponse", "Error");
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<List<air_ticket>> call, Throwable t) {
                Log.d("onFailure", t.toString());
            }
        });
    }
}
