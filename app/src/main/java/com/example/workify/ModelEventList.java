package com.example.workify;

import java.security.Principal;

public class ModelEventList {


    private String mevent_name;
    private String mevent_description;
    private String mday_date_event;
    private String mmonth_day_event;
    private int list_itemt_image;

    public String getMevent_name() {
        return mevent_name;
    }

    public void setMevent_name(String mevent_name) {
        this.mevent_name = mevent_name;
    }

    public String getMevent_description() {
        return mevent_description;
    }

    public void setMevent_description(String mevent_description) {
        this.mevent_description = mevent_description;
    }

    public String getMday_date_event() {
        return mday_date_event;
    }

    public void setMday_date_event(String mday_date_event) { this.mday_date_event = mday_date_event;
    }

    public String getMmonth_day_event() {
        return mmonth_day_event;
    }

    public void setMmonth_day_event(String mmonth_day_event) {
        this.mmonth_day_event = mmonth_day_event;
    }

    public int getList_itemt_image() {
        return list_itemt_image;
    }

    public void setList_itemt_image(int list_itemt_image) {
        this.list_itemt_image = list_itemt_image;
    }

    public ModelEventList(String mevent_name, String mevent_description, String mday_date_event, String mmonth_day_event, int list_itemt_image) {
        this.mevent_name = mevent_name;
        this.mevent_description = mevent_description;
        this.mday_date_event = mday_date_event;
        this.mmonth_day_event = mmonth_day_event;
        this.list_itemt_image = list_itemt_image;
    }
    public ModelEventList(){}
}
