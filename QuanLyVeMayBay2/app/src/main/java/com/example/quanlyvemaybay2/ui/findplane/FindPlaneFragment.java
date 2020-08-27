package com.example.quanlyvemaybay2.ui.findplane;

        import android.content.res.ColorStateList;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;
        import android.widget.ImageButton;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.fragment.app.Fragment;

        import com.example.quanlyvemaybay2.R;
        import com.google.android.material.button.MaterialButton;
        import com.google.android.material.button.MaterialButtonToggleGroup;


public class FindPlaneFragment extends Fragment {
    private ImageButton ibtnSwap;
    private MaterialButton btnKhuHoi, btnMotChieu;
    private MaterialButtonToggleGroup btnTogGroup;
    MaterialButton btnFindPlanes;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_find_plane_layout, container, false);
        ibtnSwap = root.findViewById(R.id.ibtnSwap);

        btnFindPlanes = root.findViewById(R.id.btnFindPlanes);


        // Get views từ layouts
        btnKhuHoi = root.findViewById(R.id.btnKhuHoi);
        btnMotChieu = root.findViewById(R.id.btnMotChieu);
        btnTogGroup = root.findViewById(R.id.btngGroup);

        // Set animation cho imageView swap điểm đi và điểm đến

        ibtnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation myAnim = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
                ibtnSwap.startAnimation(myAnim);
            }
        });

        btnFindPlanes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        // Set backgroundTint cho button Khứ hồi và Một chiều khi khởi chạy app
        switch (btnTogGroup.getCheckedButtonId()) {
            case R.id.btnKhuHoi: {
                btnKhuHoi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorOrange, getContext().getTheme())));
                btnMotChieu.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite, getContext().getTheme())));
            }
            break;
            case R.id.btnMotChieu: {
                btnMotChieu.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorOrange, getContext().getTheme())));
                btnKhuHoi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite, getContext().getTheme())));
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
                btnMotChieu.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite, getContext().getTheme())));
            }
        });

        // Click vào button Một chiều
        btnMotChieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set backgroundTint cho button Khứ hồi và Một chiều
                btnMotChieu.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorOrange)));
                btnKhuHoi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));
            }
        });

        return root;
    }
}
