package com.example.workify;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.List;
import java.util.zip.Inflater;

public class RVBookingAdapter extends RecyclerView.Adapter<RVBookingAdapter.BookingViewHolder> implements DatePickerDialog.OnDateSetListener , TimePickerDialog.OnTimeSetListener {
    Context context;
    private List<ModelBookingList> modelBookingListsObject;
    int day,month,year,hour,minute,hourto,minutto;
    int dayFinal,monthFinal,yearFinal,hourFinal,minuteFinal,hourFinalto,minuteFinalto;


    public RVBookingAdapter(Context context, List<ModelBookingList> modelBookingListsObject) {
        this.context = context;
        this.modelBookingListsObject = modelBookingListsObject;
    }

    /* ******************* The View Holder Inner Class ***********************/

    public class BookingViewHolder extends RecyclerView.ViewHolder {


        TextView Single_room_num;
        TextView Room_hour_price;
        TextView Num_of_chair;
        TextView Num_of_table;
        Button   btn_Booking;



        public BookingViewHolder(@NonNull View itemView) {
            super(itemView);

            Single_room_num=itemView.findViewById(R.id.single_room_num);
            Room_hour_price=itemView.findViewById(R.id.room_hour_price);
            Num_of_chair=itemView.findViewById(R.id.num_of_chair);
            Num_of_table=itemView.findViewById(R.id.num_of_table);
            btn_Booking=itemView.findViewById(R.id.BBtn_booking);

            btn_Booking.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Calendar c = Calendar.getInstance();
                    year=c.get(Calendar.YEAR);
                    month=c.get(Calendar.MONTH);
                    day=c.get(Calendar.DAY_OF_MONTH);

                    DatePickerDialog datePickerDialog = new DatePickerDialog(context,RVBookingAdapter.this,year,month,day);
                    datePickerDialog.show();
                }
            });
        }

        /* ****************************************************************************/

    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        yearFinal = year;
        monthFinal=month;
        dayFinal = dayOfMonth;
/* *************** from ************************/
        Calendar c = Calendar.getInstance();
        hour=c.get(Calendar.HOUR_OF_DAY);
        minute=c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog=new TimePickerDialog(context,RVBookingAdapter.this,hour,minute, DateFormat.is24HourFormat(context));

/* ********************  to************* */


        TimePickerDialog timePickerDialog2=new TimePickerDialog(context,RVBookingAdapter.this,hourto,minutto, DateFormat.is24HourFormat(context));


        timePickerDialog.show();
        //timePickerDialog2.show();

        Calendar cto = Calendar.getInstance();
        hourto=cto.get(Calendar.HOUR_OF_DAY);
        minutto=cto.get(Calendar.MINUTE);
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute ) {
                hourFinal =hourOfDay;
                minuteFinal = minute;

        final AlertDialog.Builder builder=new AlertDialog.Builder(context);
        builder.setTitle("YourBooking"  );
        builder.setMessage("\n" + "-----------------"+"\n" + "date : " + dayFinal +"/"+monthFinal+"/"+yearFinal +"\n" +"\n" + "Time : from"+ hourFinal +" : "+minuteFinal + "\n" +"\n" + "Price : 30 LE" + "\n"+"\n"+"\n"+"\n" );
        builder.setNegativeButton("Confirm", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        }).create();

        builder.setPositiveButton("Discard", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        final AlertDialog dialog = builder.create();
        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                Button negativeButton = ((AlertDialog)dialog).getButton(DialogInterface.BUTTON_NEGATIVE);
                Button positiveButton = ((AlertDialog)dialog).getButton(DialogInterface.BUTTON_POSITIVE);


                int greenColor = context.getResources().getColor(R.color.start_green);

                negativeButton.setBackgroundColor(greenColor);
                negativeButton.setTextColor(Color.WHITE);

                int redColor = context.getResources().getColor(R.color.red);

                positiveButton.setBackgroundColor(redColor);
                positiveButton.setTextColor(Color.WHITE);


            }
        });
      //  builder.show();
        dialog.show();

    }


    @NonNull
    @Override
    public BookingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem_booking_rv,viewGroup,false);
        return new BookingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookingViewHolder bookingViewHolder, int i) {
        final ModelBookingList modelBookingListBindObject =modelBookingListsObject.get(i);
        bookingViewHolder.Single_room_num.setText(modelBookingListBindObject.getSingle_room_num());
        bookingViewHolder.Room_hour_price.setText(modelBookingListBindObject.getRoom_hour_price());
        bookingViewHolder.Num_of_chair.setText(modelBookingListBindObject.getNum_of_chair());
        bookingViewHolder.Num_of_table.setText(modelBookingListBindObject.getNum_of_table());


    }

    @Override
    public int getItemCount() {
        return modelBookingListsObject.size();
    }


}
