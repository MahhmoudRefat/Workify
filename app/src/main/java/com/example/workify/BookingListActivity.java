package com.example.workify;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

public class BookingListActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_list);


        drawerLayout = findViewById(R.id.NavigationDrawer_layout);
        NavigationView navigationView = findViewById(R.id.Navigation_Drawer);
        toolbar = findViewById(R.id.nav_toolbar);

        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemid = menuItem.getItemId();
                menuItem.setChecked(true);
                drawerLayout.closeDrawers();
                switch (itemid) {
                    case R.id.nav_item_home:
                        startActivity(new Intent(BookingListActivity.this,MainActivity.class));
                        break;
                    case R.id.nav_item_profile:
                        startActivity(new Intent(BookingListActivity.this,ProfileActivity.class));
                        break;
                    case R.id.nav_item_notifications:
                         startActivity(new Intent(BookingListActivity.this,NotificationsActivity.class));
                        break;
                    case R.id.nav_item_favorite:
                        startActivity(new Intent(BookingListActivity.this,FavoriteAvtivity.class));
                        break;
                    case R.id.nav_item_booking_list:
                        break;
                    case R.id.nav_item_logout:
                        startActivity(new Intent(BookingListActivity.this,SignInActivity.class));

                        break;
                    default:
                        return true;
                }
                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:drawerLayout.openDrawer(Gravity.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    }

