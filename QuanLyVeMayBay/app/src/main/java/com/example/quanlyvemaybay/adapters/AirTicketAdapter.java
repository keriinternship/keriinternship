package com.example.quanlyvemaybay.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlyvemaybay.R;
import com.example.quanlyvemaybay.models.AirTicket;

import java.util.List;

import retrofit2.Response;

public class AirTicketAdapter extends RecyclerView.Adapter<AirTicketAdapter.AirTicketViewHolder>{
    private Response<List<AirTicket>> response;
    private Context context;
    private AirTicketViewHolder airTicketViewHolder;
    private AirTicket airTicket;
    private List<AirTicket> airTicketList;
    public AirTicketAdapter(Context context, List<AirTicket> airTicketList) {
        this.airTicketList = airTicketList;
        this.context = context;
    }

    @NonNull
    @Override
    public AirTicketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.air_ticket_layout, parent, false);
        airTicketViewHolder = new AirTicketViewHolder(view);
        return airTicketViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AirTicketViewHolder holder, int position) {
        airTicket = airTicketList.get(position);
        holder.tvDiemDiDiemDen.setText(airTicket.getDiemdi() + " - " + airTicket.getDiemden());
        holder.tvNgayDiNgayDen.setText(airTicket.getNgaydi() + " - " + airTicket.getNgayden());
        holder.tvGioXPGioDen.setText(airTicket.getGioxp() + " - " + airTicket.getGioden());
        holder.tvGiaTien.setText(airTicket.getGiatien());
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return airTicketList.size();
    }

    public static class AirTicketViewHolder extends RecyclerView.ViewHolder {
        TextView tvNgayDiNgayDen, tvGioXPGioDen, tvDiemDiDiemDen, tvGiaTien;
        CardView cv_air_ticket;

        public AirTicketViewHolder(@NonNull View itemView) {
            super(itemView);
            cv_air_ticket = (CardView) itemView.findViewById(R.id.cv_air_ticket);
            tvDiemDiDiemDen = (TextView) itemView.findViewById(R.id.tvDiemDiDiemDen);
            tvNgayDiNgayDen = (TextView) itemView.findViewById(R.id.tvNgayDiNgayDen);
            tvGioXPGioDen = (TextView) itemView.findViewById(R.id.tvGioXPGioDen);
            tvGiaTien = (TextView) itemView.findViewById(R.id.tvGiaTien);
        }
    }
}

