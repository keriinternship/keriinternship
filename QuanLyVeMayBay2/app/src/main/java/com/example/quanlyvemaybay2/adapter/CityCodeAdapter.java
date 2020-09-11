package com.example.quanlyvemaybay2.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlyvemaybay2.R;
import com.example.quanlyvemaybay2.model.CityCode;
import com.example.quanlyvemaybay2.interfaces.CityCodeInterface;

import java.util.ArrayList;

public class CityCodeAdapter extends RecyclerView.Adapter<CityCodeAdapter.CityCodeViewHolder> {
    private Context context;
    private ArrayList<CityCode> cityCodes;
    private CityCodeInterface cityCodeInterface;
    private CityCode cityCode;
    public static CityCode cityCode_static;
    private int row_index = -1;

    public CityCodeAdapter(Context context, ArrayList<CityCode> cityCodes) {
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

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull final CityCodeViewHolder holder, final int position) {
        cityCode = cityCodes.get(position);

        holder.item_city.setText(cityCode.toString());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cityCode_static = cityCodes.get(position);
            }
        });



    }

    @Override
    public int getItemCount() {
        return cityCodes.size();
    }

    public class CityCodeViewHolder extends RecyclerView.ViewHolder {
        TextView item_city;

        public CityCodeViewHolder(@NonNull View itemView) {
            super(itemView);
            item_city = itemView.findViewById(R.id.item_city);
        }
    }
}
