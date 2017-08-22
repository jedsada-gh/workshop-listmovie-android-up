package com.jedsada.listmovieworkshopup.complete.ui.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;

import com.jedsada.listmovieworkshopup.R;
import com.jedsada.listmovieworkshopup.complete.CustomImageView;
import com.jedsada.listmovieworkshopup.complete.ImageLoader;
import com.jedsada.listmovieworkshopup.complete.StringUtils;
import com.jedsada.listmovieworkshopup.complete.model.MovieDetailModel;

public class DetailMovieActivity extends AppCompatActivity {

    public static final String KEY_MODEL = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        MovieDetailModel model = getIntent().getParcelableExtra(KEY_MODEL);
        ((AppCompatTextView) findViewById(R.id.tv_title)).setText(model.getTitle());
        ((AppCompatTextView) findViewById(R.id.tv_des)).setText(StringUtils.getStringOverview(model.getOverview()));
        ImageLoader.loadImageUrl(model.getBackdropPath(), ((CustomImageView) findViewById(R.id.img_detail)));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
