package com.example.quanlyvemaybay2.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlyvemaybay2.R;
import com.example.quanlyvemaybay2.adapter.CityCodeAdapter;
import com.example.quanlyvemaybay2.model.CityCode;
import com.example.quanlyvemaybay2.divider.DividerItemDecoration;
import com.example.quanlyvemaybay2.interfaces.APICitycode;
import com.example.quanlyvemaybay2.interfaces.CityCodeInterface;
import com.example.quanlyvemaybay2.utils.ApiCityCodeUtils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DialogCityCode extends DialogFragment implements CityCodeInterface{
    CityCode cityCode;
    APICitycode mApiCitycode;
    RecyclerView rvCityCode;
    CityCodeAdapter adapter;
    ArrayList<CityCode> cityCodes = new ArrayList<CityCode>();
    Button button;
    View view;

    public DialogCityCode newInstance(Button button) {
        
        DialogCityCode fragment = new DialogCityCode();
        fragment.button = button;
        return fragment;

    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        // Create dialog for choose code
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        // Get layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        // Set view for a view
        view = inflater.inflate(R.layout.dialog_city_code, null);
        //
        rvCityCode = view.findViewById(R.id.rvCityCode);
        //
        mApiCitycode = ApiCityCodeUtils.getApiCitycode();
        mApiCitycode.getApi_citycode().enqueue(new Callback<List<CityCode>>() {
            @Override
            public void onResponse(Call<List<CityCode>> call, Response<List<CityCode>> response) {
                try {
                    for (int i = 0; i < response.body().size(); i++) {
                        cityCodes.add(response.body().get(i));
                    }
                    // Create adapter
                    adapter = new CityCodeAdapter(getContext(), cityCodes);
                    // Set adapter to rvCityCode
                    rvCityCode.setAdapter(adapter);
                } catch (Exception e) {
                    Log.d("onResponse", "Error");
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<List<CityCode>> call, Throwable t) {
                Log.d("onFailure", t.toString());
            }
        });
//        cityCodes.add(new city_code(1,"AAA", "AAA"));
//        cityCodes.add(new city_code(1,"AAA", "AAA"));
//        cityCodes.add(new city_code(1,"AAA", "AAA"));
//        cityCodes.add(new city_code(1,"AAA", "AAA"));
//
//        adapter = new CityCodeAdapter(getContext(), cityCodes);
//        rvCityCode.setAdapter(adapter);
        rvCityCode.addItemDecoration(new DividerItemDecoration(getResources().getDrawable(R.drawable.divider, getActivity().getTheme())));
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
                button.setText(CityCodeAdapter.cityCode_static.getCode());
            }
        });
        return alertDialog.create();
    }


    @Override
    public void OnClickToGetCityCodeListener(CityCode cityCode) {
        this.cityCode = cityCode;
    }
}
