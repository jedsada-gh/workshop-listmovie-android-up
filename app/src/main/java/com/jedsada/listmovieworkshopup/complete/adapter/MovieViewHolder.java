package com.jedsada.listmovieworkshopup.complete.adapter;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.jedsada.listmovieworkshopup.R;
import com.jedsada.listmovieworkshopup.complete.CustomImageView;
import com.jedsada.listmovieworkshopup.complete.model.MovieDetailModel;

class MovieViewHolder extends RecyclerView.ViewHolder {

    private CustomImageView imgCover;
    private AppCompatTextView tvName;
    private AppCompatTextView tvDes;

    interface MovieItemListener {

        void movieItemClick(int position);
    }

    MovieViewHolder(View itemView) {
        super(itemView);
        imgCover = itemView.findViewById(R.id.img_cover);
        tvName = itemView.findViewById(R.id.tv_name);
        tvDes = itemView.findViewById(R.id.tv_des);
    }

    void onBindData(MovieDetailModel movieDetailModel, final MovieItemListener listener) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getAdapterPosition() != RecyclerView.NO_POSITION)
                    listener.movieItemClick(getAdapterPosition());
            }
        });

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(android.R.color.darker_gray)
                .error(android.R.color.darker_gray)
                .diskCacheStrategy(DiskCacheStrategy.ALL);

        Glide.with(itemView.getContext())
                .setDefaultRequestOptions(requestOptions)
                .load(String.format("http://image.tmdb.org/t/p/w780/%s", movieDetailModel.getBackdropPath()))
                .into(imgCover);

        tvName.setText(movieDetailModel.getTitle());
        tvDes.setText(String.format("Overview : %s", movieDetailModel.getOverview()));
    }
}