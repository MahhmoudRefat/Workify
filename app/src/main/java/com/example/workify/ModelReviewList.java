package com.example.workify;


public class ModelReviewList {


    public ModelReviewList(String reviewer_name, String review_description, float ratingbar_review) {
        this.reviewer_name = reviewer_name;
        this.review_description = review_description;
        this.ratingbar_review = ratingbar_review;
    }

    private  String reviewer_name;
    private  String review_description;
    private  float ratingbar_review;


    public String getReviewer_name() {
        return reviewer_name;
    }

    public void setReviewer_name(String reviewer_name) {
        this.reviewer_name = reviewer_name;
    }

    public String getReview_description() {
        return review_description;
    }

    public void setReview_description(String review_description) {
        this.review_description = review_description;
    }

    public float getRatingbar_review() {
        return ratingbar_review;
    }

    public void setRatingbar_review(float ratingbar_review) {
        this.ratingbar_review = ratingbar_review;
    }


}
