package com.example.workify;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 */
public class OverViewFragment extends Fragment {
    private static final String TAG ="overviewfragment";
    public OverViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


             View v =  inflater.inflate(R.layout.fragment_over_view, container, false);

        TextView tv_working_space_description = v.findViewById(R.id.working_space_description_info);
        TextView tv_availabel_hour_num = v.findViewById(R.id.available_hour);
        TextView tv_open_time = v.findViewById(R.id.open_time_box_num);
        TextView tv_room_num = v.findViewById(R.id.room_box_num);
        TextView tv_close_time = v.findViewById(R.id.close_box_num);

             /* **************** Incoming Intent ************** */

        if (this.getActivity().getIntent().hasExtra("working_space_description") && getActivity().getIntent().hasExtra("availabel_hour_num") && getActivity().getIntent().hasExtra("open_time") && getActivity().getIntent().hasExtra("room_num") && getActivity().getIntent().hasExtra("close_time")) {

            Log.d(TAG, "cheking for incoming intent");
             String working_description = this.getActivity().getIntent().getStringExtra("working_space_description");
            String availabel_num = this.getActivity().getIntent().getStringExtra("availabel_hour_num");
            String open_time = this.getActivity().getIntent().getStringExtra("open_time");
            String room_num = this.getActivity().getIntent().getStringExtra("room_num");
            String close_time = this.getActivity().getIntent().getStringExtra("close_time");

            tv_working_space_description.setText(working_description);
            tv_availabel_hour_num.setText(availabel_num);
            tv_open_time .setText(open_time);
            tv_room_num.setText(room_num);
            tv_close_time.setText(close_time);

        }

        return v;

    }


}
