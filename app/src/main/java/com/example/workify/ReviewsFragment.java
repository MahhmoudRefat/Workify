package com.example.workify;
//NOTE : here the list should get extras from the main activity RecyclerView vertical list
//It Will Change

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReviewsFragment extends Fragment {


 RecyclerView reviewrecyclerView;
List<ModelReviewList> modelReviewListObject;
    public ReviewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_reviews, container, false);




            reviewrecyclerView = view.findViewById(R.id.review_recycler_view);
            modelReviewListObject = new ArrayList<>();
            RvReviewAdapter rvReviewAdapter = new RvReviewAdapter(this.getActivity(), modelReviewListObject);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
            reviewrecyclerView.setLayoutManager(layoutManager);
            reviewrecyclerView.setItemAnimator(new DefaultItemAnimator());
            reviewrecyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayoutManager.VERTICAL));
            reviewrecyclerView.setAdapter(rvReviewAdapter);
            rvReviewAdapter.notifyDataSetChanged();





        addItemToReviewArryList();

        return view;
    }


    private  void addItemToReviewArryList(){



        ModelReviewList modelReviewList = new ModelReviewList("MohamedAhmed","this is a good working space i love it and i always go to it , i love the rooms",4);
        ModelReviewList modelReviewList2 = new ModelReviewList("salem fathy","this is a good working space i love it and i always go to it , i love the rooms",3.5f);
        ModelReviewList modelReviewList3 = new ModelReviewList("sara ahmed","this is a good working space i love it and i always go to it , i love the rooms",2f);
        ModelReviewList modelReviewList4 = new ModelReviewList("salem ahmed","this is a good working space i love it and i always go to it , i love the rooms",3f);
        ModelReviewList modelReviewList5 = new ModelReviewList("karim fathy","this is a good working space i love it and i always go to it , i love the rooms",5f);
        ModelReviewList modelReviewList6 = new ModelReviewList("islam kamal","this is a good working space i love it and i always go to it , i love the rooms",3f);
        ModelReviewList modelReviewList7 = new ModelReviewList("sobhy mohamed","this is a good working space i love it and i always go to it , i love the rooms",1f);

        modelReviewListObject.add(modelReviewList);
        modelReviewListObject.add(modelReviewList2);
        modelReviewListObject.add(modelReviewList3);
        modelReviewListObject.add(modelReviewList4);
        modelReviewListObject.add(modelReviewList5);
        modelReviewListObject.add(modelReviewList6);
        modelReviewListObject.add(modelReviewList7);
        modelReviewListObject.add(modelReviewList);
        modelReviewListObject.add(modelReviewList2);
        modelReviewListObject.add(modelReviewList3);
        modelReviewListObject.add(modelReviewList4);
        modelReviewListObject.add(modelReviewList5);
        modelReviewListObject.add(modelReviewList6);
        modelReviewListObject.add(modelReviewList7);



    }

}
