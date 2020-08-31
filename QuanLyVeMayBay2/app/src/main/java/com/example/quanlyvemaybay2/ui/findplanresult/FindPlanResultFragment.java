package com.example.quanlyvemaybay2.ui.findplanresult;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlyvemaybay2.ui.findplane.SharedViewModel;
import com.example.quanlyvemaybay2.utils.ApiServiceUtils;
import com.example.quanlyvemaybay2.R;
import com.example.quanlyvemaybay2.adapter.AirTicketAdapter;
import com.example.quanlyvemaybay2.data_model.AirTicket;
import com.example.quanlyvemaybay2.interfaces.APIService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FindPlanResultFragment extends Fragment {
    RecyclerView listItem;
    private APIService mAPIService;
    TextView tv_maDi, tv_maDen, tv_Date,tv_AgeNguoiLon,tv_AgeTreem;
    Button btnHangHK , btnGiaCuoc;
    View root;
    AirTicketAdapter airTicketAdapter;
    ArrayList<AirTicket> arrayListAirTicket = new ArrayList<AirTicket>();
    private SharedViewModel sharedViewModel;
    private Bundle mBundle = new Bundle();
    String diemDi, diemDen, ngayDi;
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
        mAPIService = ApiServiceUtils.getAPIService();
    }

    private void getAllAirsticker() {
        mBundle = getArguments();
        diemDi = getArguments().getString("diemdi");
        diemDen = getArguments().getString("diemden");
        ngayDi = getArguments().getString("ngaydi");
        Log.d("testPassData", diemDi + diemDen + ngayDi);
        mAPIService.getApi_air(diemDi, diemDen, ngayDi).enqueue(new Callback<List<AirTicket>>() {
            @Override
            public void onResponse(Call<List<AirTicket>> call, Response<List<AirTicket>> response) {
                try {
                    String result = "";

                    for (int i = 0; i < response.body().size(); i++) {
                        arrayListAirTicket.add(response.body().get(i));

                    }
                    airTicketAdapter = new AirTicketAdapter(getContext(), arrayListAirTicket);
                    listItem.setAdapter(airTicketAdapter);
                } catch (Exception e) {
                    Log.d("onResponse", "Error");
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<List<AirTicket>> call, Throwable t) {
                Log.d("onFailure", t.toString());
            }
        });
    }
}
