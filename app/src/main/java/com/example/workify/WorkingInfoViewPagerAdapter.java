package com.example.workify;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class WorkingInfoViewPagerAdapter extends FragmentStatePagerAdapter {

    public WorkingInfoViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int i) {


        switch(i){
            case 0:
                OverViewFragment overViewFragment =new OverViewFragment();
                return overViewFragment;
            case 1:
                ReviewsFragment reviewsFragment = new ReviewsFragment();
                return reviewsFragment;
            case 2:
                BookingFragment bookingFragment =new BookingFragment();
                return bookingFragment;
        }
        return null;

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0 :
                return "OVERVIEW " ;
            case 1:
                return "REVIEWS" ;
            case 2:
                return "BOOKING" ;

        }
        return null;
    }
}
