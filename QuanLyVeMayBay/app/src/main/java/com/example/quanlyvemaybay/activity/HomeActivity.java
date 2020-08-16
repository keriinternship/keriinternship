//package com.example.quanlyvemaybay.activity;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
//import android.widget.SearchView;
//
//import com.example.quanlyvemaybay.MainActivity;
//import com.example.quanlyvemaybay.R;
//
//public class HomeActivity extends AppCompatActivity {
//    Toolbar toolbar;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate( savedInstanceState );
//        setContentView( R.layout.activity_home );
//        initAnimation();
//
//    }
//
//    private void initAnimation() {
//        Animation animation = AnimationUtils.loadAnimation( this, R.anim.bg_anim );
//        animation.setDuration( 3000 );
//            findViewById( R.id.load ).startAnimation( animation );
//        getSupportFragmentManager().beginTransaction()
//                .setCustomAnimations( R.anim.fade_in,R.anim.fade_out )
//                .replace( R.id.frame_main,new MainActivity()).commit();
//    }
//}