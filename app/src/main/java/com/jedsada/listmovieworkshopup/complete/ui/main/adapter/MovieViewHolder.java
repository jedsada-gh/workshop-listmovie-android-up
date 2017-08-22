package com.jedsada.listmovieworkshopup.complete.ui.main.adapter;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.jedsada.listmovieworkshopup.R;
import com.jedsada.listmovieworkshopup.complete.CustomImageView;
import com.jedsada.listmovieworkshopup.complete.ImageLoader;
import com.jedsada.listmovieworkshopup.complete.StringUtils;
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

        ImageLoader.loadImageUrl(movieDetailModel.getBackdropPath(), imgCover);
        tvName.setText(movieDetailModel.getTitle());
        tvDes.setText(StringUtils.getStringOverview(movieDetailModel.getOverview()));
    }
}