package com.jedsada.listmovieworkshopup.complete.ui.main;

import com.jedsada.listmovieworkshopup.complete.model.MovieDetailModel;
import com.jedsada.listmovieworkshopup.complete.model.MovieModel;
import com.jedsada.listmovieworkshopup.complete.retrofit.MovieRepository;

import java.util.List;

class MainController implements MainContract.MainControllerable {

    private MainContract.MainView view;
    private MovieRepository movieRepository;

    MainController(MovieRepository movieRepository, MainContract.MainView view) {
        this.view = view;
        this.movieRepository = movieRepository;
    }

    @Override
    public void loadListMovie() {
        movieRepository.requestListMovie(new MovieRepository.MovieRepositoryCallback() {
            @Override
            public void loadMovieSuccess(MovieModel model) {
                view.loadListMovieSuccess(model);
            }

            @Override
            public void loadMovieError(String message) {
                view.loadListMovieError(message);
            }
        });
    }
}
