package com.jedsada.listmovieworkshopup.complete.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieModel {

    @SerializedName("results")
    private List<MovieDetailModel> mMovieDetailModels;

    public List<MovieDetailModel> getResults() {
        return mMovieDetailModels;
    }

    public void setResults(List<MovieDetailModel> movieDetailModels) {
        mMovieDetailModels = movieDetailModels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieModel that = (MovieModel) o;

        return mMovieDetailModels != null ? mMovieDetailModels.equals(that.mMovieDetailModels) : that.mMovieDetailModels == null;

    }

    @Override
    public int hashCode() {
        return mMovieDetailModels != null ? mMovieDetailModels.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "MovieModel{" +
                "mMovieDetailModels=" + mMovieDetailModels +
                '}';
    }
}
