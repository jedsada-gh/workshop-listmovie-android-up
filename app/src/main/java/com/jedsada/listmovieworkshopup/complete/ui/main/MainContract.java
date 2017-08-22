package com.jedsada.listmovieworkshopup.complete.ui.main;

import com.jedsada.listmovieworkshopup.complete.model.MovieModel;

class MainContract {

    interface MainView {
        void loadListMovieSuccess(MovieModel model);

        void loadListMovieError(String message);
    }

    interface MainControllerable {
        void loadListMovie();
    }
}
