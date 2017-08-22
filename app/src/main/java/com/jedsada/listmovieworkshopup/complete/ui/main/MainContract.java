package com.jedsada.listmovieworkshopup.complete.ui.main;

import com.jedsada.listmovieworkshopup.complete.model.MovieDetailModel;

import java.util.List;

class MainContract {

    interface MainView {
        void loadListMovieSuccess(List<MovieDetailModel> list);

        void loadListMovieError(String message);
    }

    interface MainControllerable {
        void loadListMovie();
    }
}
