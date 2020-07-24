package com.example.quanlyvemaybay.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.quanlyvemaybay.Frament.HomeFrament;
import com.example.quanlyvemaybay.R;

public class HomeActivity extends AppCompatActivity {
    public static Intent intent;
    int questionID = 0;
    ActionBarDrawerToggle drawerToggle;
    private Context context;
    ListView drawerList;
    final static String KEY_DATA = "data";
    Bundle data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.main_layout );
        FrameLayout mainlayout=  findViewById( R.id.drawerContainer );
         Toolbar toolbar = findViewById( R.id.toolbar );
         drawerList = findViewById( R.id.drawerListView );
        setSupportActionBar(toolbar);
       // getSupportActionBar().setDisplayShowTitleEnabled(false);
        ActionBar actionBar = getSupportActionBar();
        final DrawerLayout drawerLayout = findViewById(  R.id.drawer_layout );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        drawerToggle = new ActionBarDrawerToggle( this , drawerLayout ,R.string.openDrawer , R.string.closeDrawer ){
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed( drawerView );
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened( drawerView );
            }
        };
        drawerList.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                questionID = position;
                drawerLayout.closeDrawer( drawerList );
            }
        } );
        drawerLayout.setDrawerListener( drawerToggle );
        drawerToggle.syncState();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menu_layout, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        switch (item.getItemId()) {
            case R.id.action_information:
                intent = new Intent(HomeActivity.this , Information.class);
                startActivity( intent );
                return true;
            case R.id.acction_Setting:
                intent = new Intent(HomeActivity.this , setting.class);
                startActivity( intent );
                return true;
        }
        return super.onOptionsItemSelected( item );
    }

//    private void thongTin() {
//        Intent intent = new Intent(context, Information.class);
//        intent.setClass(HomeActivity.this , Information.class);
//        intent.putExtra(KEY_DATA, data);
//        intent =getIntent();
//        startActivity(intent);
//    }
//    private void init()
//    {
//        Animation animation = AnimationUtils.loadAnimation(this,R.anim.bg_circle_rotate);
//        animation.setDuration(3000);
//        findViewById(R.id.load ).startAnimation( animation );
//        getSupportFragmentManager().beginTransaction()
//                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
//                .replace(R.id.frame_main, new HomeFrament())
//                .commit();
//    }
}