package com.example.quanlyvemaybay2.ui.inforfly;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.quanlyvemaybay2.R;

public class InFlyFragment extends Fragment {

    //Chieu di
    TextView tv_diemdiCD, tv_DiemdenCD,
            tv_moneyCDi, tv_dateCD,
            tv_TimekhCD, tv_DatekhCD,
            tv_DiemxpCD, tv_maVeCD,
            tv_DiemktCD, tv_TimektCD,
            tv_DatektCD;
    ImageView img_hangbayCD;
    Button btn_ChuyenkhacCD;
    //Chieu ve
    TextView tv_DiemdiCV, tv_DiemdenCV,
            tv_moneychieuVe, tv_TimekhCV,
            tv_DatekhCV, tv_DiemxpCV,
            tv_TimeKtCV, tv_DateKTCV,
            tv_diemktCV, tv_maVeCV,
            tv_dateCV;
    Button btn_ChuyenkhacCV;
    ImageView img_hangbayCV;
    //Thong tin gia ve
    TextView tv_Giave, tv_Thue, tv_Tong;
    //Button chuyen man hinh
    Button btnTieptuc;
    View root;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         root = inflater.inflate(R.layout.information_flight_layout, container, false);
        init();
        return root;
    }

    public void init() {
        //Chien di
        tv_diemdiCD = root.findViewById(R.id.tv_diemdiCD);
        tv_DiemdenCD = root.findViewById(R.id.tv_DiemdenCD);
        tv_moneyCDi = root.findViewById(R.id.tv_moneyCDi);
        tv_dateCD = root.findViewById(R.id.tv_dateCD);
        tv_TimekhCD = root.findViewById(R.id.tv_TimekhCD);
        tv_DatekhCD = root.findViewById(R.id.tv_DatekhCD);
        tv_DiemxpCD = root.findViewById(R.id.tv_DiemxpCD);
        tv_DiemktCD = root.findViewById(R.id.tv_DiemktCD);
        tv_maVeCD = root.findViewById(R.id.tv_maVeCD);
        tv_TimektCD = root.findViewById(R.id.tv_TimektCD);
        tv_DatektCD = root.findViewById(R.id.tv_DatektCD);
        img_hangbayCD = root.findViewById(R.id.img_hangbayCD);
        btn_ChuyenkhacCD = root.findViewById(R.id.btn_ChuyenkhacCD);
        //Chieu ve
        tv_DiemdiCV = root.findViewById(R.id.tv_DiemdiCV);
        tv_DiemdenCV = root.findViewById(R.id.tv_DiemdenCV);
        tv_moneychieuVe = root.findViewById(R.id.tv_moneychieuVe);
        tv_TimekhCV = root.findViewById(R.id.tv_TimekhCV);
        tv_DatekhCV = root.findViewById(R.id.tv_DatekhCV);
        tv_DiemxpCV = root.findViewById(R.id.tv_DiemxpCV);
        tv_TimeKtCV = root.findViewById(R.id.tv_TimeKtCV);
        tv_DateKTCV = root.findViewById(R.id.tv_DateKTCV);
        tv_diemktCV = root.findViewById(R.id.tv_diemktCV);
        tv_maVeCV = root.findViewById(R.id.tv_maVeCV);
        tv_dateCV = root.findViewById(R.id.tv_dateCV);
        btn_ChuyenkhacCV = root.findViewById(R.id.btn_ChuyenkhacCV);
        img_hangbayCV = root.findViewById(R.id.img_hangbayCV);
        //Thong tin gia ve
        tv_Giave = root.findViewById(R.id.tv_Giave);
         tv_Thue =root.findViewById(R.id.tv_Thue);
         tv_Tong = root.findViewById(R.id.tv_Tong);
         btnTieptuc = root.findViewById(R.id.btnTieptuc);
    }
}
