package com.example.workify;
// this is the model of the vertical adapter and  the overview fragment data

public class ModelWorkingSpaceList {

    /* ************ Vertical Working Space RecyclerView Data ***************************/
    private int img_working_space;
    private String working_space_name;
    private String working_space_address;
    private String planet_guru_innovation_space;
    private float ratingbar_working_space;


    /* ************************* The OverView fragment connect data ****************/
    private int working_space_over_view_image;
    private String working_space_description;
    private String availabel_hour_num;
    private String open_time;
    private String room_num;
    private String close_time;
    /* *******************************************************************************/




    public ModelWorkingSpaceList(int img_working_space, String working_space_name, String working_space_address, String planet_guru_innovation_space, float ratingbar_working_space, int working_space_over_view_image, String working_space_description, String availabel_hour_num, String open_time, String room_num, String close_time) {
        /* ************ Vertical Working Space RecyclerView Data ***************************/
        this.img_working_space = img_working_space;
        this.working_space_name = working_space_name;
        this.working_space_address = working_space_address;
        this.planet_guru_innovation_space = planet_guru_innovation_space;
        this.ratingbar_working_space = ratingbar_working_space;
        /* **********************  The OverView fragment connect data *********************************************/
        this.working_space_over_view_image = working_space_over_view_image;
        this.working_space_description = working_space_description;
        this.availabel_hour_num = availabel_hour_num;
        this.open_time = open_time;
        this.room_num = room_num;
        this.close_time = close_time;
        /* ***********************************************************************************************************/
    }


    /* ************ Vertical Working Space RecyclerView Method ***************************/

    public int getImg_working_space() {
        return img_working_space;
    }

    public void setImg_working_space(int img_working_space) {
        this.img_working_space = img_working_space;
    }

    public String getWorking_space_name() {
        return working_space_name;
    }

    public void setWorking_space_name(String working_space_name) {
        this.working_space_name = working_space_name;
    }

    public String getWorking_space_address() {
        return working_space_address;
    }

    public void setWorking_space_address(String working_space_address) {
        this.working_space_address = working_space_address;
    }

    public String getPlanet_guru_innovation_space() {
        return planet_guru_innovation_space;
    }

    public void setPlanet_guru_innovation_space(String planet_guru_innovation_space) {
        this.planet_guru_innovation_space = planet_guru_innovation_space;
    }

    public Float getRatingbar_working_space() {
        return ratingbar_working_space;
    }

    public void setRatingbar_working_space(Float ratingbar_working_space) {
        this.ratingbar_working_space = ratingbar_working_space;
    }


    /* ******************** Vertical Working Space RecyclerView Method ***********************************/

    /* ************ The OverView fragment connect Method  ***************************/

    public int getWorking_space_over_view_image() {
        return working_space_over_view_image;
    }

    public void setWorking_space_over_view_image(int working_space_over_view_image) {
        this.working_space_over_view_image = working_space_over_view_image;
    }

    public String getWorking_space_description() {
        return working_space_description;
    }

    public void setWorking_space_description(String working_space_description) {
        this.working_space_description = working_space_description;
    }

    public String getAvailabel_hour_num() {
        return availabel_hour_num;
    }

    public void setAvailabel_hour_num(String availabel_hour_num) {
        this.availabel_hour_num = availabel_hour_num;
    }

    public String getOpen_time() {
        return open_time;
    }

    public void setOpen_time(String open_time) {
        this.open_time = open_time;
    }

    public String getRoom_num() {
        return room_num;
    }

    public void setRoom_num(String room_num) {
        this.room_num = room_num;
    }

    public String getClose_time() {
        return close_time;
    }

    public void setClose_time(String close_time) {
        this.close_time = close_time;
    }

    /* ******************** end of The OverView fragment connect Method ***********************************/




}
