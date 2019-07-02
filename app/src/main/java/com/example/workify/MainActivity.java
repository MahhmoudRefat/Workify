package com.example.workify;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        private List<ModelEventList> modelEventLists;
        private  List<ModelWorkingSpaceList> modelWorkingSpaceLists;
        private RecyclerView mRecyclerView;
        private RecyclerView mRecyclerViewvertical;
        private DrawerLayout drawerLayout;
        private Toolbar toolbar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.event_recycler_view);
        mRecyclerViewvertical = findViewById(R.id.working_space_recycler_view);
        /********** the Horizontal Events Recycler View ***********************/
        modelEventLists = new ArrayList<>();
        RVEventAdapterHorizontal adapter = new RVEventAdapterHorizontal(this, modelEventLists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));
        mRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        addItemToArryList();


        /***************** The Vertical Working Space Recycler View ********************************************/
        modelWorkingSpaceLists = new ArrayList<>();
        RVWorkingSpaceAdapterVertical rvWorkingSpaceAdapterVertical = new RVWorkingSpaceAdapterVertical(this, modelWorkingSpaceLists);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this);
        mRecyclerViewvertical.setLayoutManager(layoutManager1);
        mRecyclerViewvertical.setItemAnimator(new DefaultItemAnimator());
       /* mRecyclerViewvertical.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));*/
        mRecyclerViewvertical.setAdapter(rvWorkingSpaceAdapterVertical);
        rvWorkingSpaceAdapterVertical.notifyDataSetChanged();
        addItemToArryListVertical();


        /*********************************The NAvigation Drawer Code ************************************************/


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
                        //startActivity(new Intent(MainActivity.this,MainActivity.class));
                        break;
                    case R.id.nav_item_profile:
                        startActivity(new Intent(MainActivity.this,ProfileActivity.class));
                        break;
                    case R.id.nav_item_notifications:
                       startActivity(new Intent(MainActivity.this,NotificationsActivity.class));
                        break;
                    case R.id.nav_item_favorite:
                        startActivity(new Intent(MainActivity.this,FavoriteAvtivity.class));
                        break;
                    case R.id.nav_item_booking_list:
                        startActivity(new Intent(MainActivity.this,BookingListActivity.class));
                    break;
                    case R.id.nav_item_logout:
                        startActivity(new Intent(MainActivity.this,SignInActivity.class));
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



   private  void  addItemToArryList(){
       Log.e("Recycler","additemtoarray : recyclerview");
       ModelEventList p1 = new ModelEventList("Ios Workshope","this is a work shop for ios and iphone developing ","20","April",R.drawable.ios_workshob);
       ModelEventList p2 = new ModelEventList("web Foundation","this is a work shop for web developing ","30","April",R.drawable.web_foundation);

       modelEventLists.add(p1);
       modelEventLists.add(p2);
       modelEventLists.add(p1);
       modelEventLists.add(p2);
       modelEventLists.add(p1);
       modelEventLists.add(p2);
       modelEventLists.add(p1);
       modelEventLists.add(p2);
       modelEventLists.add(p1);
       modelEventLists.add(p2);

   }
    private  void  addItemToArryListVertical(){                                                                                                                                                                                                   /*   private int working_space_over_view_image;
                                                                                                                                                                                                                                                        private String working_space_description;
                                                                                                                                                                                                                                                        private int availabel_hour_num;
                                                                                                                                                                                                                                                        private String open_time;
                                                                                                                                                                                                                                                        private int room_num;
                                                                                                                                                                                                                                                        private String close_time; */
        Log.e("Recycler","additemtoarray : recyclerviewvertical");
        ModelWorkingSpaceList modelWorkingSpaceList = new ModelWorkingSpaceList(R.drawable.planet_work_space,"Planet Co-Working Space","ad Dpqi , Giza Government","Planet guru Innovatio Space",4,R.drawable.infopicsecond,"Lorem ipsum dolor site amet ,consecteutur adipising elit sed do eiusmod tempor incididunt ut labore et dolore megna aliqua ut enim ed minim veniem auis nastrud exercitation ullemoo labori nisi ut aliquip ex ee","12","10AM","8","10PM");
        ModelWorkingSpaceList modelWorkingSpaceList2 = new ModelWorkingSpaceList(R.drawable.mandala_work_space,"Mandala Co-Working Space","Nasr city , Cairo","Planet guru Innovatio Space",3.5f,R.drawable.infopic,"Lorem ipsum dolor site amet ,consecteutur adipising elit sed do eiusmod tempor incididunt ut labore et dolore megna aliqua ut enim ed minim veniem auis nastrud exercitation ullemoo labori nisi ut aliquip ex ee","14","9AM","12","11PM");

        modelWorkingSpaceLists.add(modelWorkingSpaceList);
        modelWorkingSpaceLists.add(modelWorkingSpaceList2);
        modelWorkingSpaceLists.add(modelWorkingSpaceList);
        modelWorkingSpaceLists.add(modelWorkingSpaceList2);
        modelWorkingSpaceLists.add(modelWorkingSpaceList);
        modelWorkingSpaceLists.add(modelWorkingSpaceList2);
        modelWorkingSpaceLists.add(modelWorkingSpaceList);
        modelWorkingSpaceLists.add(modelWorkingSpaceList2);
        modelWorkingSpaceLists.add(modelWorkingSpaceList);
        modelWorkingSpaceLists.add(modelWorkingSpaceList2);
        modelWorkingSpaceLists.add(modelWorkingSpaceList);
        modelWorkingSpaceLists.add(modelWorkingSpaceList2);
        modelWorkingSpaceLists.add(modelWorkingSpaceList);
        modelWorkingSpaceLists.add(modelWorkingSpaceList2);

    }

}
