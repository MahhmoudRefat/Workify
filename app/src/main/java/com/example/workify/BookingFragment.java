package com.example.workify;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookingFragment extends Fragment  {

    //NOTE : here the list should get extras from the main activity RecyclerView vertical list

        private List<ModelBookingList> modelBookingListOject;
        private RecyclerView mRecyclerView;




        public BookingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_booking, container, false);


        modelBookingListOject = new ArrayList<>();
        mRecyclerView = view.findViewById(R.id.Booking_recycler_view);
        RVBookingAdapter rvBookingAdapter =new RVBookingAdapter(this.getContext(),modelBookingListOject);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(layoutManager1);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(),LinearLayoutManager.VERTICAL));
        mRecyclerView.setAdapter(rvBookingAdapter);
        rvBookingAdapter.notifyDataSetChanged();
        addItemToBookingArryList();


        return view;


    }
    private  void addItemToBookingArryList(){



        ModelBookingList modelBookingList = new ModelBookingList("1","20","70","4");
        ModelBookingList modelBookingList2 = new ModelBookingList("2","30","50","2");
        ModelBookingList modelBookingList3 = new ModelBookingList("3","15","40","3");
        ModelBookingList modelBookingList4 = new ModelBookingList("4","10","30","1");
        ModelBookingList modelBookingList5 = new ModelBookingList("5","10","30","1");
        ModelBookingList modelBookingList6 = new ModelBookingList("6","10","30","1");
        ModelBookingList modelBookingList7 = new ModelBookingList("7","10","30","1");
        ModelBookingList modelBookingList8 = new ModelBookingList("8","10","30","1");
        ModelBookingList modelBookingList9 = new ModelBookingList("9","10","30","1");
        ModelBookingList modelBookingList10 = new ModelBookingList("10","10","30","1");

        modelBookingListOject.add(modelBookingList );
        modelBookingListOject.add(modelBookingList2 );
        modelBookingListOject.add(modelBookingList3);
        modelBookingListOject.add(modelBookingList4 );
        modelBookingListOject.add(modelBookingList5 );
        modelBookingListOject.add(modelBookingList6 );
        modelBookingListOject.add(modelBookingList7 );
        modelBookingListOject.add(modelBookingList8 );
        modelBookingListOject.add(modelBookingList9 );
        modelBookingListOject.add(modelBookingList10 );





    }

}
