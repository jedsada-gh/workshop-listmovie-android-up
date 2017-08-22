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
import com.jedsada.listmovieworkshopup.complete.model.MovieModel;
import com.jedsada.listmovieworkshopup.complete.retrofit.MovieRepository;
import com.jedsada.listmovieworkshopup.complete.ui.detail.DetailMovieActivity;
import com.jedsada.listmovieworkshopup.complete.ui.main.adapter.MovieAdapter;

public class MainActivity extends AppCompatActivity implements MainContract.MainView,
        MovieAdapter.MovieAdapterListener {

    private RecyclerView list;
    private View loading;
    private View viewError;
    private MainController mainController;
    private MovieAdapter movieAdapter;
    private MovieModel model = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        setupInstance();
        setupView();
        if (savedInstanceState == null) initialize();
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
        outState.putParcelable("data", movieAdapter.getData());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        model = savedInstanceState.getParcelable("data");
        if (model != null) {
            setViewShow(true);
            movieAdapter.setData(model);
        }
    }

    private void bindView() {
        list = (RecyclerView) findViewById(R.id.list_movie);
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
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setHasFixedSize(false);
        list.setAdapter(movieAdapter);
    }

    private void setViewShow(Boolean isShowList) {
        list.setVisibility(isShowList ? View.VISIBLE : View.GONE);
        loading.setVisibility(View.GONE);
        viewError.setVisibility(!isShowList ? View.VISIBLE : View.GONE);
    }

    @Override
    public void loadListMovieSuccess(MovieModel model) {
        setViewShow(true);
        movieAdapter.setData(model);
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