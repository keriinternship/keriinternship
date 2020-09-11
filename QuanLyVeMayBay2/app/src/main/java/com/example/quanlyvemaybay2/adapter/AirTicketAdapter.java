package com.example.quanlyvemaybay2.adapter;

import android.app.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
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

import com.example.quanlyvemaybay2.model.AirTicket;

import com.example.quanlyvemaybay2.interfaces.OnClickToShowInforPerson;
import com.example.quanlyvemaybay2.model.AirTicket;
import com.example.quanlyvemaybay2.ui.findplane.FindPlaneFragment;
import com.example.quanlyvemaybay2.ui.inforperson.InforPerson;


import java.util.ArrayList;

public class AirTicketAdapter extends RecyclerView.Adapter<AirTicketAdapter.AirTicketViewHolder> {
    private Context context;
    private ArrayList<AirTicket> ticketList;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    private OnClickToShowInforPerson onClick;
    Intent intent;

    public AirTicketAdapter(Context context, ArrayList<AirTicket> ticketList, OnClickToShowInforPerson onClick) {
        this.context = context;
        this.ticketList = ticketList;
        this.onClick = onClick;
    }
    @NonNull
    @Override
    public AirTicketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view  = inflater.inflate(R.layout.item_airticket_layout, parent, false);

        return new AirTicketViewHolder(view, onClick);

    }

    @Override
    public void onBindViewHolder(@NonNull AirTicketViewHolder holder, int position) {
        AirTicket AirTicket = ticketList.get(position);

        holder.tv_maVe.setText(AirTicket.getPlanes_id());
        holder.tv_giaTien.setText(AirTicket.getGiatien());
        holder.tv_maDi.setText(AirTicket.getDiemdi());
        holder.tv_gioXP.setText(AirTicket.getGioxp());
        holder.tv_maDen.setText(AirTicket.getDiemden());
        holder.tv_gioDen.setText(AirTicket.getGioden());


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
        TextView tv_maVe,  tv_giaTien ,tv_maDi , tv_gioXP,tv_maDen, tv_gioDen;
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
            btnChon =  itemView.findViewById(R.id.btnChon);
            btnXemchitiet =   itemView.findViewById(R.id.btnXem);
            this.onClick = onClick;

            btnChon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClick.onClickToShow();
                }
            });
        }

    }
}

