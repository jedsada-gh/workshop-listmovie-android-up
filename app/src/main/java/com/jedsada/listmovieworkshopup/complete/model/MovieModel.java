package com.jedsada.listmovieworkshopup.complete.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieModel implements Parcelable{

    @SerializedName("results")
    private List<MovieDetailModel> mMovieDetailModels;

    private MovieModel(Parcel in) {
        mMovieDetailModels = in.createTypedArrayList(MovieDetailModel.CREATOR);
    }

    public static final Creator<MovieModel> CREATOR = new Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel in) {
            return new MovieModel(in);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(mMovieDetailModels);
    }
}
