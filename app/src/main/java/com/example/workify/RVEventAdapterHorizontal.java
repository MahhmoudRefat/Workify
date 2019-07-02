package com.example.workify;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RVEventAdapterHorizontal extends RecyclerView.Adapter<RVEventAdapterHorizontal.EventViewHolder>{

    private static final String TAG ="Recycler";
    private Context context;
    private List<ModelEventList> modelEventLists;

    public RVEventAdapterHorizontal(Context context, List<ModelEventList> modelEventLists) {
        this.context = context;
        this.modelEventLists = modelEventLists;
    }

    /* ******************* The View Holder Inner Class ***********************/

    public class EventViewHolder extends RecyclerView.ViewHolder{

        TextView tvEventDescription;
        TextView tvEventName;
        TextView tvDayDateEvent;
        TextView tvMonthDateEvent;
        ImageView imgEvent;


        public EventViewHolder(@NonNull View itemView) {
            super(itemView);

            tvEventDescription =itemView.findViewById(R.id.description);
            tvEventName =itemView.findViewById(R.id.event_name);
            tvDayDateEvent =itemView.findViewById(R.id.day_date);
            tvMonthDateEvent =itemView.findViewById(R.id.month_date);
            imgEvent = itemView.findViewById(R.id.list_item_image);
        }
    }
    /* *********************************************************************************************/
    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Log.e("Recycler","onCreateViewHolder : recyclerview");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem_hor,viewGroup,false);
        return new EventViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder eventViewHolder, int i) {
        Log.e("Recycler","onbindviewholder : recyclerview");
        ModelEventList modelEventList =modelEventLists.get(i);
        eventViewHolder.imgEvent.setImageResource(modelEventList.getList_itemt_image());
        eventViewHolder.tvEventName.setText(modelEventList.getMevent_name());
        eventViewHolder.tvEventDescription.setText(modelEventList.getMevent_description());
        eventViewHolder.tvDayDateEvent.setText(modelEventList.getMday_date_event());
        eventViewHolder.tvMonthDateEvent.setText(modelEventList.getMmonth_day_event());



    }


    @Override
    public int getItemCount() {
        Log.e("Recycler","getcount : recyclerview");
        return modelEventLists.size();
    }



}


