package com.example.quanlyvemaybay2.adapter;

import android.app.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlyvemaybay2.R;

import com.example.quanlyvemaybay2.interfaces.APIPlane;
import com.example.quanlyvemaybay2.model.AirTicket;

import com.example.quanlyvemaybay2.interfaces.OnClickToShowInforPerson;
import com.example.quanlyvemaybay2.model.AirTicket;
import com.example.quanlyvemaybay2.model.CityCode;
import com.example.quanlyvemaybay2.model.Plane;
import com.example.quanlyvemaybay2.ui.findplane.FindPlaneFragment;
import com.example.quanlyvemaybay2.ui.inforperson.InforPerson;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AirTicketAdapter extends RecyclerView.Adapter<AirTicketAdapter.AirTicketViewHolder> {
    private Context context;
    private ArrayList<AirTicket> ticketList;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    private OnClickToShowInforPerson onClick;
    Intent intent;
    APIPlane apiPlane;
    int planes_id;
    boolean isMotChieu;
    String ngayDi, diemDi;

    public AirTicketAdapter(Context context, ArrayList<AirTicket> ticketList, OnClickToShowInforPerson onClick, boolean isMotChieu, String ngayDi, String diemDi) {
        this.context = context;
        this.ticketList = ticketList;
        this.onClick = onClick;
        this.isMotChieu = isMotChieu;
        this.ngayDi = ngayDi;
        this.diemDi = diemDi;
    }

    public AirTicketAdapter(Context context, ArrayList<AirTicket> ticketList, OnClickToShowInforPerson onClick, boolean isMotChieu) {
        this.context = context;
        this.ticketList = ticketList;
        this.onClick = onClick;
        this.isMotChieu = isMotChieu;
    }

    @NonNull
    @Override
    public AirTicketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_airticket_layout, parent, false);

        return new AirTicketViewHolder(view, onClick);

    }

    @Override
    public void onBindViewHolder(@NonNull AirTicketViewHolder holder, int position) {
        final AirTicket airTicket = ticketList.get(position);

        planes_id = Integer.parseInt(airTicket.getPlanes_id());
//        apiPlane.getApi_plane(planes_id).enqueue(new Callback<List<Plane>>() {
//            @Override
//            public void onResponse(Call<List<Plane>> call, Response<List<Plane>> response) {
////                holder.tv_maVe.setText(response.body().get(0).getPlanes_id());
//
//                try {
//                    Log.d("planes", response.body().get(0).getPlanes_id() +"");
//
//                } catch (Exception e) {
//                    Log.d("onResponse", "Error");
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Plane>> call, Throwable t) {
//                Log.d("onFailure", t.toString());
//            }
//        });

        holder.tv_maVe.setText(airTicket.getPlanes_id());
        holder.tv_giaTien.setText(airTicket.getGiatien());
        holder.tv_maDi.setText(airTicket.getDiemdi());
        holder.tv_gioXP.setText(airTicket.getGioxp());
        holder.tv_maDen.setText(airTicket.getDiemden());
        holder.tv_gioDen.setText(airTicket.getGioden());


        holder.btnXemchitiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return ticketList.size();
    }

    public class AirTicketViewHolder extends RecyclerView.ViewHolder {
        TextView tv_maVe, tv_giaTien, tv_maDi, tv_gioXP, tv_maDen, tv_gioDen;
        Button btnChon, btnXemchitiet;
        OnClickToShowInforPerson onClick;

        public AirTicketViewHolder(@NonNull View itemView, final OnClickToShowInforPerson onClick) {
            super(itemView);
            tv_maVe = itemView.findViewById(R.id.tv_maVe);
            tv_giaTien = itemView.findViewById(R.id.tv_giaTien);
            tv_gioDen = itemView.findViewById(R.id.tv_gioDen);
            tv_maDi = itemView.findViewById(R.id.tv_maDi);
            tv_maDen = itemView.findViewById(R.id.tv_maDen);
            tv_gioXP = itemView.findViewById(R.id.tv_gioXP);
            btnChon = itemView.findViewById(R.id.btnChon);
            btnXemchitiet = itemView.findViewById(R.id.btnXem);
            this.onClick = onClick;

            btnChon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClick.onClickToShow(isMotChieu);
                }
            });

        }

    }
}

