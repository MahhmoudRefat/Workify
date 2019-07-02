package com.example.workify;

public class ModelBookingList {


    private String single_room_num;
    private String room_hour_price;
    private String num_of_chair;
    private String num_of_table;

    public ModelBookingList(String single_room_num, String room_hour_price, String num_of_chair, String num_of_table) {
        this.single_room_num = single_room_num;
        this.room_hour_price = room_hour_price;
        this.num_of_chair = num_of_chair;
        this.num_of_table = num_of_table;
    }

    public String getSingle_room_num() {
        return single_room_num;
    }

    public void setSingle_room_num(String single_room_num) {
        this.single_room_num = single_room_num;
    }

    public String getRoom_hour_price() {
        return room_hour_price;
    }

    public void setRoom_hour_price(String room_hour_price) {
        this.room_hour_price = room_hour_price;
    }

    public String getNum_of_chair() {
        return num_of_chair;
    }

    public void setNum_of_chair(String num_of_chair) {
        this.num_of_chair = num_of_chair;
    }

    public String getNum_of_table() {
        return num_of_table;
    }

    public void setNum_of_table(String num_of_table) {
        this.num_of_table = num_of_table;
    }
}
