package com.example.quanlyvemaybay2.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlyvemaybay2.R;
import com.example.quanlyvemaybay2.adapter.CityCodeAdapter;
import com.example.quanlyvemaybay2.data_model.city_code;
import com.example.quanlyvemaybay2.interFace.APICitycode;
import com.example.quanlyvemaybay2.utils.ApiCityCodeUtils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DialogCityCode extends DialogFragment {
    APICitycode mApiCitycode;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        // Create dialog for choose code
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        // Get layout inflater
        LayoutInflater inflater = LayoutInflater.from(getContext());
        // Set view for a view
        final View view = inflater.inflate(R.layout.dialog_city_code, null);

        //
        final RecyclerView rvCityCode = view.findViewById(R.id.rvCityCode);
        //
        mApiCitycode = ApiCityCodeUtils.getApiCitycode();
        mApiCitycode.getApi_citycode().enqueue(new Callback<List<city_code>>() {
            @Override
            public void onResponse(Call<List<city_code>> call, Response<List<city_code>> response) {
                ArrayList<city_code> cityCodes = new ArrayList<city_code>();
                // Get city_code item of response to add in cityCodes
                for (int i = 0; i < response.body().size(); i++) {
                    cityCodes.add(response.body().get(i));
                }
                // Create adapter
                CityCodeAdapter adapter = new CityCodeAdapter(getContext(), cityCodes);
                // Set adapter to rvCityCode
                rvCityCode.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<city_code>> call, Throwable t) {

            }
        });

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        rvCityCode.setLayoutManager(layoutManager);

        // Set view for dialog
        alertDialog.setView(view);

        // Click HỦY  to exit this dialog
        alertDialog.setNegativeButton(R.string.huy, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dismiss();
            }
        });

        alertDialog.setPositiveButton(R.string.chon, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        return alertDialog.create();
    }


}
