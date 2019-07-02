package com.example.workify;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;


public class RVWorkingSpaceAdapterVertical extends RecyclerView.Adapter<RVWorkingSpaceAdapterVertical.vertical_viewholder> {
    private static final String TAG ="Recycler";
    private Context context;

    private List<ModelWorkingSpaceList> modelWorkingSpaceLists;

    public RVWorkingSpaceAdapterVertical(Context context, List<ModelWorkingSpaceList> modelWorkingSpaceLists) {
        this.context = context;
        this.modelWorkingSpaceLists = modelWorkingSpaceLists;
    }



    /* ******************* The View Holder Inner Class ***********************/

    public class vertical_viewholder extends RecyclerView.ViewHolder{



        ImageView img_working_space_;
        TextView working_space_name;
        TextView working_space_address;
        TextView  planet_guru_innovation_space;
        RatingBar ratingbar_working_space;
        Button btn_booking;




        public vertical_viewholder(@NonNull View itemView) {
            super(itemView);

            img_working_space_=itemView.findViewById(R.id.img_working_space);
            working_space_name=itemView.findViewById(R.id.working_space_name);
            working_space_address=itemView.findViewById(R.id.working_space_address);
            planet_guru_innovation_space=itemView.findViewById(R.id.planet_guru_innovation_space);
            ratingbar_working_space=itemView.findViewById(R.id.ratingbar_working_space);
             btn_booking=itemView.findViewById(R.id.Btn_booking);



        }
    }
    /* ********************************************************************************************/

    @NonNull
    @Override
    public vertical_viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem_ver,viewGroup,false);
        return new RVWorkingSpaceAdapterVertical.vertical_viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final vertical_viewholder vertical_viewholder, final int i) {
        final ModelWorkingSpaceList modelWorkingSpaceListobject =modelWorkingSpaceLists.get(i);
        vertical_viewholder.img_working_space_.setImageResource(modelWorkingSpaceListobject.getImg_working_space());
        vertical_viewholder.working_space_name.setText(modelWorkingSpaceListobject.getWorking_space_name());
        vertical_viewholder. working_space_address.setText(modelWorkingSpaceListobject.getWorking_space_address());
        vertical_viewholder.planet_guru_innovation_space.setText(modelWorkingSpaceListobject.getPlanet_guru_innovation_space());
        vertical_viewholder.ratingbar_working_space.setRating(modelWorkingSpaceListobject.getRatingbar_working_space());

        vertical_viewholder.btn_booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,WorkingSpaceInfo.class);

         /* ************************************ the overview fragment intent items *************************/

                intent.putExtra("working_space_over_view_name",modelWorkingSpaceListobject.getWorking_space_name());
                intent.putExtra("working_space_over_view_image",modelWorkingSpaceListobject.getWorking_space_over_view_image());
                intent.putExtra("working_space_description",modelWorkingSpaceListobject.getWorking_space_description());
                intent.putExtra("availabel_hour_num",modelWorkingSpaceListobject.getAvailabel_hour_num());
                intent.putExtra("open_time",modelWorkingSpaceListobject.getOpen_time());
                intent.putExtra("room_num",modelWorkingSpaceListobject.getRoom_num());
                intent.putExtra("close_time",modelWorkingSpaceListobject.getClose_time());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return modelWorkingSpaceLists.size();
    }

}
