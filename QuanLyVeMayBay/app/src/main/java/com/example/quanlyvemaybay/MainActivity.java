package com.example.quanlyvemaybay;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.quanlyvemaybay.InterFace.APIService;
import com.example.quanlyvemaybay.adapters.AirTicketAdapter;
import com.example.quanlyvemaybay.models.AirTicket;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends Fragment {
    private int rowSize = 5;
    private int rem = 0;
    Toolbar toolbar;

    private APIService mAPIService;

    private RecyclerView rvAirTickets;
    private AirTicketAdapter adapter;
    private List<AirTicket> list = new ArrayList<>();
    private List<AirTicket> newList = new ArrayList<>();
    private LinearLayout linearScroll;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.activity_main, container, false);
//        Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.bg_anim);
        rvAirTickets = view.findViewById(R.id.rvAirTickets);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        linearScroll = view.findViewById(R.id.linear_scroll);
//        rvAirTickets.setHasFixedSize(true);
        rvAirTickets.setLayoutManager(layoutManager);
        mAPIService = ApiUtils.getAPIService();

        getAllAirsticker();
        return view;
    }


    private void getAllAirsticker() {
        mAPIService.getApi_air().enqueue(new Callback<List<AirTicket>>() {
            @Override
            public void onResponse(Call<List<AirTicket>> call, Response<List<AirTicket>> response) {
                list = response.body();
                rem = list.size() % rowSize;
                if (rem > 0) {
                    for (int i = 0; i < rowSize - rem; i++) {
                        list.add(new AirTicket());
                    }
                }

                addItem(0);

                int size = list.size() / rowSize;
                for (int j = 0; j < size; j++) {
                    final int k;
                    k = j;
                    Button btnPage = new Button(getContext());
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(120, LinearLayout.LayoutParams.WRAP_CONTENT);
                    lp.setMargins(5, 2, 2, 2);
                    btnPage.setTextColor(Color.WHITE);
                    btnPage.setTextSize(16.0f);
                    btnPage.setId(j);
                    btnPage.setText(String.valueOf(j + 1));
                    linearScroll.addView(btnPage, lp);

                    btnPage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            addItem(k);
                        }
                    });

                }
                adapter = new AirTicketAdapter(getContext(), newList);
                rvAirTickets.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<AirTicket>> call, Throwable t) {

            }
        });
    }

    private void addItem(int i) {
        newList.clear();
        i = i * rowSize;
        for (int j = 0; j < rowSize; j++) {
            if (i > list.size() - 1) {
                return;
            }
            newList.add(j, list.get(i));
            i = i + 1;
        }
        adapter = new AirTicketAdapter(getContext(), newList);
        rvAirTickets.setAdapter(adapter);
    }


}
