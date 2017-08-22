package com.jedsada.listmovieworkshopup.complete.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.jedsada.listmovieworkshopup.R;
import com.jedsada.listmovieworkshopup.complete.model.MovieDetailModel;
import com.jedsada.listmovieworkshopup.complete.retrofit.MovieRepository;
import com.jedsada.listmovieworkshopup.complete.ui.detail.DetailMovieActivity;
import com.jedsada.listmovieworkshopup.complete.ui.main.adapter.MovieAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.MainView,
        MovieAdapter.MovieAdapterListener {

    private RecyclerView listMovie;
    private View loading;
    private View viewError;
    private MainController mainController;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        setupInstance();
        if (savedInstanceState == null) initialize();
        setupView();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    private void bindView() {
        listMovie = (RecyclerView) findViewById(R.id.list_movie);
        loading = findViewById(R.id.loading);
        viewError = findViewById(R.id.container_error);
    }

    private void setupInstance() {
        mainController = new MainController(new MovieRepository(), this);
        movieAdapter = new MovieAdapter();
        movieAdapter.setListener(this);
    }

    private void initialize() {
        mainController.loadListMovie();
    }

    private void setupView() {
        listMovie.setLayoutManager(new LinearLayoutManager(this));
        listMovie.setHasFixedSize(false);
        listMovie.setAdapter(movieAdapter);
    }

    private void setViewShow(Boolean isShowList) {
        listMovie.setVisibility(isShowList ? View.VISIBLE : View.GONE);
        loading.setVisibility(View.GONE);
        viewError.setVisibility(!isShowList ? View.VISIBLE : View.GONE);
    }

    @Override
    public void loadListMovieSuccess(List<MovieDetailModel> list) {
        setViewShow(true);
        movieAdapter.setListMovie(list);
    }

    @Override
    public void loadListMovieError(String message) {
        setViewShow(false);
        AppCompatTextView tvStatus = viewError.findViewById(R.id.tv_status);
        tvStatus.setText(message);
    }

    @Override
    public void movieItemClick(MovieDetailModel model) {
        Intent intent = new Intent(this, DetailMovieActivity.class);
        intent.putExtra(DetailMovieActivity.KEY_MODEL, model);
        startActivity(intent);
    }
}
