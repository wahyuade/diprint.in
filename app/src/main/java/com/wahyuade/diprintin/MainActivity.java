package com.wahyuade.diprintin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.wahyuade.diprintin.my_order.MyOrderFragment;
import com.wahyuade.diprintin.my_profile.MyProfileFragment;
import com.wahyuade.diprintin.saldo.SaldoFragment;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new MyOrderFragment()).commit();
        final ActionBar actionBar = getSupportActionBar();
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {

            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new MyOrderFragment()).commit();
                        break;
                    case R.id.action_order:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new SaldoFragment()).commit();
                        actionBar.removeAllTabs();
                        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
                        break;
                    case R.id.action_profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new MyProfileFragment()).commit();
                        actionBar.removeAllTabs();
                        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
                        break;
                }
                return true;
            }
        });
    }
}
