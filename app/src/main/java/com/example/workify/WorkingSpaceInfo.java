package com.example.workify;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class WorkingSpaceInfo extends AppCompatActivity {

    //This if For The Working space information  page user can see overview or review or booking .
    //contain image , back image button ,working space name .
    // containViewpager With Three fragments .

    private ViewPager viewPager;
    public static WorkingInfoViewPagerAdapter workingInfoViewPagerAdapter;
    private TabLayout tabLayout;
    TextView work_space_name_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_working_space_info);


        viewPager = findViewById(R.id.working_info_pagger);
        tabLayout = findViewById(R.id.tabs_layout_name);
        work_space_name_info=findViewById(R.id.working_space_name_info);

        workingInfoViewPagerAdapter = new WorkingInfoViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(workingInfoViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        /* ****** This is Incoming intent For the Image *****************/
        Log.d("get intent in main info","getIncomingIntent:cheking for incoming intent");
        if(getIntent().hasExtra("working_space_over_view_image" )&& getIntent().hasExtra("working_space_over_view_name" )){

          int image_content = getIntent().getIntExtra("working_space_over_view_image",R.drawable.infopic);
            ImageView imageView = findViewById(R.id.img_info_working_space);
            imageView.setImageResource(image_content);

            String working_name = getIntent().getStringExtra( "working_space_over_view_name");
            work_space_name_info.setText(working_name);


        }
        /* ------------- End  Incoming intent For the Image ----------------------- */

    }

//this is a back Button
    public void backbut(View view) {
        this.finish();
    }
}
