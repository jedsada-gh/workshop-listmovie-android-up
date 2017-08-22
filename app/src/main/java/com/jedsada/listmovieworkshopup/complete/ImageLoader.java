package com.jedsada.listmovieworkshopup.complete;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class ImageLoader {

    public static void loadImageUrl(String path, CustomImageView imageView) {
        RequestOptions requestOptions = new RequestOptions()
                .placeholder(android.R.color.darker_gray)
                .error(android.R.color.darker_gray)
                .diskCacheStrategy(DiskCacheStrategy.ALL);

        Glide.with(imageView.getContext())
                .setDefaultRequestOptions(requestOptions)
                .load(String.format("http://image.tmdb.org/t/p/w780/%s", path))
                .into(imageView);
    }
}
