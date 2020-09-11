package com.example.quanlyvemaybay2.ui.findplane;

import android.app.DatePickerDialog;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.quanlyvemaybay2.R;
import com.example.quanlyvemaybay2.databinding.FragmentFindPlaneLayoutBinding;
import com.example.quanlyvemaybay2.dialogs.DialogCityCode;
import com.example.quanlyvemaybay2.model.CityCode;
import com.example.quanlyvemaybay2.viewmodel.CityCodeViewModel;
import com.example.quanlyvemaybay2.viewmodel.ViewModelFactory;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;


public class FindPlaneFragment extends Fragment {
    private ImageButton ibtnSwap;
    private MaterialButton btnKhuHoi, btnMotChieu, btnMaDiemDi, btnMaDiemDen;
    private MaterialButtonToggleGroup btnTogGroup;
    MaterialButton btnFindPlanes;
    private Button edtNgayDen, edtNgayDi;
    private int mYear;
    private int mMonth;
    private int mDay;
    private String mDMY;
    Date date;
    private boolean isMotChieu = false;
    private CityCodeViewModel cityCodeViewModel;
    Bundle mBundle;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_find_plane_layout, container, false);

        // Get views từ layouts
        ibtnSwap = root.findViewById(R.id.ibtnSwap);
        btnFindPlanes = root.findViewById(R.id.btnFindPlanes);
        btnKhuHoi = root.findViewById(R.id.btnKhuHoi);
        btnMotChieu = root.findViewById(R.id.btnMotChieu);
        btnTogGroup = root.findViewById(R.id.btngGroup);
        btnMaDiemDi = root.findViewById(R.id.btnMaDiemDi);
        btnMaDiemDen = root.findViewById(R.id.btnMaDiemDen);
        edtNgayDen = root.findViewById(R.id.edtNgayDen);
        edtNgayDi = root.findViewById(R.id.edtNgayDi);

        // Default string of date
        final SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        mYear = calendar.get(Calendar.YEAR);
        mMonth = calendar.get(Calendar.MONTH);
        mDay = calendar.get(Calendar.DAY_OF_MONTH);

        date = new Date(mYear - 1900, mMonth, mDay);

        mDMY = simpleDate.format(date);

        // Click editNgayDi to show date picker dialog
        edtNgayDi.setText(mDMY);
        edtNgayDi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                mYear = calendar.get(Calendar.YEAR);
                mMonth = calendar.get(Calendar.MONTH);
                mDay = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(),
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                date = new Date(year - 1900, monthOfYear, dayOfMonth);
                                mDMY = simpleDate.format(date);
                                edtNgayDi.setText(mDMY);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        // Click editNgayDen to show date picker dialog
        edtNgayDen.setText(mDMY);
        edtNgayDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                mYear = calendar.get(Calendar.YEAR);
                mMonth = calendar.get(Calendar.MONTH);
                mDay = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(),
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                date = new Date(year - 1900, monthOfYear, dayOfMonth);
                                mDMY = simpleDate.format(date);
                                edtNgayDen.setText(mDMY);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        // Set animation cho imageView swap điểm đi và điểm đến
        ibtnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation myAnim = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
                ibtnSwap.startAnimation(myAnim);

                String temp = btnMaDiemDi.getText().toString();
                btnMaDiemDi.setText(btnMaDiemDen.getText().toString());
                btnMaDiemDen.setText(temp);
            }
        });

        btnFindPlanes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        btnMaDiemDi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogToChooseCityCode(btnMaDiemDi);
            }
        });

        btnMaDiemDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogToChooseCityCode(btnMaDiemDen);
            }
        });


        // Set backgroundTint cho button Khứ hồi và Một chiều khi khởi chạy app
        switch (btnTogGroup.getCheckedButtonId()) {
            case R.id.btnKhuHoi: {
                btnKhuHoi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorOrange, getContext().getTheme())));
                btnKhuHoi.setTextColor(getResources().getColor(R.color.colorWhite, getContext().getTheme()));
                btnMotChieu.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite, getContext().getTheme())));
                btnMotChieu.setTextColor(getResources().getColor(R.color.colorOrange, getContext().getTheme()));
            }
            break;
            case R.id.btnMotChieu: {
                btnMotChieu.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorOrange, getContext().getTheme())));
                btnMotChieu.setTextColor(getResources().getColor(R.color.colorWhite, getContext().getTheme()));
                btnKhuHoi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite, getContext().getTheme())));
                btnKhuHoi.setTextColor(getResources().getColor(R.color.colorOrange, getContext().getTheme()));
            }
            break;
            default:
                break;
        }

        // Click vào button Khứ hồi
        btnKhuHoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set backgroundTint cho button Khứ hồi và Một chiều
                btnKhuHoi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorOrange, getContext().getTheme())));
                btnKhuHoi.setTextColor(getResources().getColor(R.color.colorWhite, getContext().getTheme()));
                btnMotChieu.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite, getContext().getTheme())));
                btnMotChieu.setTextColor(getResources().getColor(R.color.colorOrange, getContext().getTheme()));
                edtNgayDen.setEnabled(true);
                isMotChieu = false;
            }
        });

        // Click vào button Một chiều
        btnMotChieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set backgroundTint cho button Khứ hồi và Một chiều
                btnMotChieu.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorOrange, getContext().getTheme())));
                btnMotChieu.setTextColor(getResources().getColor(R.color.colorWhite, getContext().getTheme()));
                btnKhuHoi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite, getContext().getTheme())));
                btnKhuHoi.setTextColor(getResources().getColor(R.color.colorOrange, getContext().getTheme()));
                edtNgayDen.setEnabled(false);
                isMotChieu = true;
            }
        });

        btnFindPlanes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBundle = new Bundle();
                mBundle.putBoolean("?motchieu", isMotChieu);
                mBundle.putString("diemdi", btnMaDiemDi.getText().toString());
                mBundle.putString("diemden", btnMaDiemDen.getText().toString());
                mBundle.putString("ngaydi", edtNgayDi.getText().toString());


                NavHostFragment.findNavController(FindPlaneFragment.this).navigate(R.id.action_nav_findplane_to_nav_result_findplanes, mBundle);
            }
        });

        return root;
    }

    private void openDialogToChooseCityCode(Button button) {
        DialogCityCode dialogCityCode = new DialogCityCode().newInstance(button);
        dialogCityCode.show(getActivity().getSupportFragmentManager(), "Choose city code");
    }
}
