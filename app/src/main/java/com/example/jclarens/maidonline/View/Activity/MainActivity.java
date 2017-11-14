package com.example.jclarens.maidonline.View.Activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.jclarens.maidonline.R;
import com.example.jclarens.maidonline.View.Fragment.FragmentCari;
import com.example.jclarens.maidonline.View.Fragment.FragmentHome;
import com.example.jclarens.maidonline.View.Fragment.FragmentLainnya;
import com.example.jclarens.maidonline.View.Fragment.FragmentPesan;
import com.example.jclarens.maidonline.View.Fragment.FragmentTransaksi;

public class MainActivity extends AppCompatActivity {
    private Fragment fragment;
    private FragmentManager fragmentManager;

    private BottomNavigationView bottomNavigation;
    private FrameLayout frameLayout;
//    private FragmentHome fragmentHome = new FragmentHome();
//    private FragmentCari fragmentCari = new FragmentCari();
//    private FragmentTransaksi fragmentStatus = new FragmentTransaksi();
//    private FragmentPesan fragmenPesan = new FragmentPesan();
//    private FragmentLainnya fragmentLainnya = new FragmentLainnya();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = (FrameLayout) findViewById(R.id.main_container);

        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigation.inflateMenu(R.menu.navigation);
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.main_container, new FragmentHome()).commit();

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.menu_home:
//                        Toast.makeText(MainActivity.this,"Beranda",Toast.LENGTH_LONG).show();
//                        posisiF=1;
                        fragment = new FragmentHome();
                        break;
                    case R.id.menu_cari:
//                        Toast.makeText(MainActivity.this,"Cari",Toast.LENGTH_LONG).show();
//                        posisiF=2;
                        fragment = new FragmentCari();
                        break;
                    case R.id.menu_status:
//                        Toast.makeText(MainActivity.this,"Status",Toast.LENGTH_LONG).show();
                        //posisiF=3;
//                        if (SharedPref.getValueString(ConstClass.USER) == "")
//                            fragment = new FragmentUnauthorized();
//                        else
                        fragment = new FragmentTransaksi();
                        break;
                    case R.id.menu_pesan:
//                        Toast.makeText(MainActivity.this,"Pesan",Toast.LENGTH_LONG).show();
//                        posisiF=4;
//                        if (SharedPref.getValueString(ConstClass.USER) == "")
//                            fragment = new FragmentUnauthorized();
//                        else
                        fragment = new FragmentPesan();
                        break;
                    case R.id.menu_lainnya:
  //                      Toast.makeText(MainActivity.this,"Lainnya",Toast.LENGTH_LONG).show();
//                        posisiF=5;
                        fragment = new FragmentLainnya();
                        break;
                }
                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main_container, fragment).commit();
                return true;
            }
        });
    }
}
