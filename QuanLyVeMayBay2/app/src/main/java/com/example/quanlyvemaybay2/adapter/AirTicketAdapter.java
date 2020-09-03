package com.example.quanlyvemaybay2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlyvemaybay2.R;
import com.example.quanlyvemaybay2.model.AirTicket;

import java.util.ArrayList;

public class AirTicketAdapter extends RecyclerView.Adapter<AirTicketAdapter.AirTicketViewHolder> {
    private Context context;
    private ArrayList<AirTicket> ticketList;

    public AirTicketAdapter(Context context, ArrayList<AirTicket> ticketList) {
        this.context = context;
        this.ticketList = ticketList;
    }
    @NonNull
    @Override
    public AirTicketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view  = inflater.inflate(R.layout.item_airticket_layout, parent, false);

        return new AirTicketViewHolder(view);

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

        holder.btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
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
        public AirTicketViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_maVe = itemView.findViewById(R.id.tv_maVe);
            tv_giaTien = itemView.findViewById(R.id.tv_giaTien);
            tv_gioDen = itemView.findViewById(R.id.tv_gioDen);
            tv_maDi = itemView.findViewById(R.id.tv_maDi);
            tv_maDen = itemView.findViewById(R.id.tv_maDen);
            tv_gioXP = itemView.findViewById(R.id.tv_gioXP);
            btnChon =  itemView.findViewById(R.id.btnChon);
            btnXemchitiet =   itemView.findViewById(R.id.btnXem);

        }
    }
}

