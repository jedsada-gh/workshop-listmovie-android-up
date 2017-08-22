package com.jedsada.listmovieworkshopup.complete.retrofit;

import android.support.annotation.NonNull;

import com.jedsada.listmovieworkshopup.complete.model.MovieDetailModel;
import com.jedsada.listmovieworkshopup.complete.model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieRepository {

    public interface MovieRepositoryCallback {

        void loadMovieSuccess(List<MovieDetailModel> list);

        void loadMovieError(String message);
    }

    public void requestListMovie(final MovieRepositoryCallback callback) {
        if (callback != null) {
            HttpManager.getInstance().getService().getListMovie().enqueue(new Callback<MovieModel>() {
                @Override
                public void onResponse(@NonNull Call<MovieModel> call, @NonNull Response<MovieModel> response) {
                    if (response.isSuccessful()) {
                        callback.loadMovieSuccess(response.body().getResults());
                    } else {
                        callback.loadMovieError(response.message());
                    }
                }

                @Override
                public void onFailure(@NonNull Call<MovieModel> call, @NonNull Throwable t) {
                    callback.loadMovieError(t.getMessage());
                }
            });
        }
    }
}