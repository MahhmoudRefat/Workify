package com.example.workify;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class RvReviewAdapter extends RecyclerView.Adapter<RvReviewAdapter.ReviewViewHolder> {


    private  Context context;
    private  List<ModelReviewList> modelReviewListObject ;

    public RvReviewAdapter(Context context, List<ModelReviewList> modelReviewList) {
        this.context = context;
        this.modelReviewListObject = modelReviewList;
    }

    /* ******************* The View Holder Inner Class ***********************/


    public class ReviewViewHolder extends RecyclerView.ViewHolder {

        TextView reviewer_name;
        TextView review_description;
        RatingBar ratingbar_review;

        public ReviewViewHolder(@NonNull View itemView) {
            super(itemView);
        reviewer_name = itemView.findViewById(R.id.reviewer_name);
        review_description = itemView.findViewById(R.id.review_description);
        ratingbar_review = itemView.findViewById(R.id.ratingbar_review);


        }
    }

    /* ***************************************************************************************/
    @NonNull
    @Override
    public ReviewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem_review,viewGroup,false);

        return new RvReviewAdapter.ReviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewViewHolder reviewViewHolder, int i) {

        final ModelReviewList modelReviewList = modelReviewListObject.get(i);
        reviewViewHolder.reviewer_name.setText(modelReviewList.getReviewer_name());
        reviewViewHolder.review_description.setText(modelReviewList.getReview_description());
        reviewViewHolder.ratingbar_review.setRating(modelReviewList.getRatingbar_review());


    }

    @Override
    public int getItemCount() {
        return modelReviewListObject.size();
    }




}
