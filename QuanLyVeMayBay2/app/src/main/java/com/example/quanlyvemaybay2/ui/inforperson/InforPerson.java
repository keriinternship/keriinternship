package com.example.quanlyvemaybay2.ui.inforperson;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.quanlyvemaybay2.R;
import com.example.quanlyvemaybay2.dialogs.DialogInforClients;
import com.example.quanlyvemaybay2.dialogs.DialogInforContact;
import com.example.quanlyvemaybay2.dialogs.DialogInforLight;

public class InforPerson extends Fragment {
    Button btnLienhe,btnKhachHang;
    Button btnChitiet;
    View root;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_infor_person_layout, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        btnLienhe = view.findViewById(R.id.btnLienHe);
        btnKhachHang = view.findViewById(R.id.btnKhachHang);
        btnChitiet = view.findViewById(R.id.btn_Chitiet);
        btnLienhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //dialog contact
                DialogInforContact dialogInforContacts = new DialogInforContact(getActivity(), android.R.style.Theme_Light);
                dialogInforContacts.show();
            }
        });
        btnKhachHang.setOnClickListener(new View.OnClickListener() {
            //diaalog lien he
            @Override
            public void onClick(View view) {
                DialogInforClients dialogInforClients = new DialogInforClients(getActivity(), android.R.style.Theme_Light);
                dialogInforClients.show();
            }
        });
        btnChitiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogInforLight dialogInforLights = new DialogInforLight(getActivity(), android.R.style.Theme_Light);
                dialogInforLights.show();
            }
        });
    }
}
