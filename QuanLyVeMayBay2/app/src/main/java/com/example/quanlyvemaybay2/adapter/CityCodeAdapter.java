package com.example.quanlyvemaybay2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlyvemaybay2.R;
import com.example.quanlyvemaybay2.data_model.city_code;

import java.util.ArrayList;

public class CityCodeAdapter extends RecyclerView.Adapter<CityCodeAdapter.CityCodeViewHolder>{
    private Context context;
    private ArrayList<city_code> cityCodes;

    public CityCodeAdapter(Context context, ArrayList<city_code> cityCodes) {
        this.context = context;
        this.cityCodes = cityCodes;
    }

    @NonNull
    @Override
    public CityCodeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_city, parent, false);

        return new CityCodeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CityCodeViewHolder holder, int position) {
        city_code city_code = cityCodes.get(position);

        holder.item_city.setText(city_code.toString());
    }

    @Override
    public int getItemCount() {
        return cityCodes.size();
    }

    public class CityCodeViewHolder extends RecyclerView.ViewHolder{
        TextView item_city;
        public CityCodeViewHolder(@NonNull View itemView) {
            super(itemView);
            item_city = itemView.findViewById(R.id.item_city);
        }
    }
}
