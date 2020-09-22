package com.example.quanlyvemaybay2.dialogs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.quanlyvemaybay2.R;
import com.example.quanlyvemaybay2.validators.Validate;
import com.google.android.material.button.MaterialButton;

public class DialogInforContact extends Dialog implements android.view.View.OnClickListener {
    public Activity activity;
    public Dialog dialog;
    public MaterialButton yes, no;
    private EditText edtDanhXung, edt_Ho, edt_HovaTen, edt_Diachi, edt_Email;

    public DialogInforContact(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_infor_contact_layout);

        edtDanhXung =  findViewById(R.id.edt_Danhxung);
        edt_Ho =  findViewById(R.id.edt_Ho);
        edt_HovaTen =  findViewById(R.id.edt_HovaTen);
        edt_Diachi =  findViewById(R.id.edt_Diachi);
        edt_Email =  findViewById(R.id.edt_Email);

        yes =  findViewById(R.id.btn_Huy);
        no =  findViewById(R.id.btn_Dongy);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Huy:
                break;
            case R.id.btn_Dongy:
            {
                if(!Validate.isValidEmail(edt_Email.getText().toString())){
                    showDialog("Thông báo!", "Email không hợp lệ!");
                    break;
                }

                if(!Validate.isValidateName(edtDanhXung.getText().toString())){
                    showDialog("Thông báo!", "Danh xưng không hợp lệ!");
                    break;
                }



            }
                break;
            default:
                break;
        }
        dismiss();
    }

    public void showDialog (String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("OK", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.create().show();
    }

}
