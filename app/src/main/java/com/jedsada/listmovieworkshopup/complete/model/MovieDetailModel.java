package com.jedsada.listmovieworkshopup.complete.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieDetailModel {

    @SerializedName("adult")
    private Boolean mAdult;
    @SerializedName("backdrop_path")
    private String mBackdropPath;
    @SerializedName("genre_ids")
    private List<Long> mGenreIds;
    @SerializedName("id")
    private Long mId;
    @SerializedName("original_language")
    private String mOriginalLanguage;
    @SerializedName("original_title")
    private String mOriginalTitle;
    @SerializedName("overview")
    private String mOverview;
    @SerializedName("popularity")
    private Double mPopularity;
    @SerializedName("poster_path")
    private String mPosterPath;
    @SerializedName("release_date")
    private String mReleaseDate;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("video")
    private Boolean mVideo;
    @SerializedName("vote_average")
    private Double mVoteAverage;
    @SerializedName("vote_count")
    private Long mVoteCount;

    public Boolean getAdult() {
        return mAdult;
    }

    public void setAdult(Boolean adult) {
        mAdult = adult;
    }

    public String getBackdropPath() {
        return mBackdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        mBackdropPath = backdropPath;
    }

    public List<Long> getGenreIds() {
        return mGenreIds;
    }

    public void setGenreIds(List<Long> genreIds) {
        mGenreIds = genreIds;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getOriginalLanguage() {
        return mOriginalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        mOriginalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return mOriginalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        mOriginalTitle = originalTitle;
    }

    public String getOverview() {
        return mOverview;
    }

    public void setOverview(String overview) {
        mOverview = overview;
    }

    public Double getPopularity() {
        return mPopularity;
    }

    public void setPopularity(Double popularity) {
        mPopularity = popularity;
    }

    public String getPosterPath() {
        return mPosterPath;
    }

    public void setPosterPath(String posterPath) {
        mPosterPath = posterPath;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Boolean getVideo() {
        return mVideo;
    }

    public void setVideo(Boolean video) {
        mVideo = video;
    }

    public Double getVoteAverage() {
        return mVoteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        mVoteAverage = voteAverage;
    }

    public Long getVoteCount() {
        return mVoteCount;
    }

    public void setVoteCount(Long voteCount) {
        mVoteCount = voteCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieDetailModel movieDetailModel = (MovieDetailModel) o;

        if (mAdult != null ? !mAdult.equals(movieDetailModel.mAdult) : movieDetailModel.mAdult != null) return false;
        if (mBackdropPath != null ? !mBackdropPath.equals(movieDetailModel.mBackdropPath) : movieDetailModel.mBackdropPath != null)
            return false;
        if (mGenreIds != null ? !mGenreIds.equals(movieDetailModel.mGenreIds) : movieDetailModel.mGenreIds != null)
            return false;
        if (mId != null ? !mId.equals(movieDetailModel.mId) : movieDetailModel.mId != null) return false;
        if (mOriginalLanguage != null ? !mOriginalLanguage.equals(movieDetailModel.mOriginalLanguage) : movieDetailModel.mOriginalLanguage != null)
            return false;
        if (mOriginalTitle != null ? !mOriginalTitle.equals(movieDetailModel.mOriginalTitle) : movieDetailModel.mOriginalTitle != null)
            return false;
        if (mOverview != null ? !mOverview.equals(movieDetailModel.mOverview) : movieDetailModel.mOverview != null)
            return false;
        if (mPopularity != null ? !mPopularity.equals(movieDetailModel.mPopularity) : movieDetailModel.mPopularity != null)
            return false;
        if (mPosterPath != null ? !mPosterPath.equals(movieDetailModel.mPosterPath) : movieDetailModel.mPosterPath != null)
            return false;
        if (mReleaseDate != null ? !mReleaseDate.equals(movieDetailModel.mReleaseDate) : movieDetailModel.mReleaseDate != null)
            return false;
        if (mTitle != null ? !mTitle.equals(movieDetailModel.mTitle) : movieDetailModel.mTitle != null) return false;
        if (mVideo != null ? !mVideo.equals(movieDetailModel.mVideo) : movieDetailModel.mVideo != null) return false;
        if (mVoteAverage != null ? !mVoteAverage.equals(movieDetailModel.mVoteAverage) : movieDetailModel.mVoteAverage != null)
            return false;
        return mVoteCount != null ? mVoteCount.equals(movieDetailModel.mVoteCount) : movieDetailModel.mVoteCount == null;

    }

    @Override
    public int hashCode() {
        int result = mAdult != null ? mAdult.hashCode() : 0;
        result = 31 * result + (mBackdropPath != null ? mBackdropPath.hashCode() : 0);
        result = 31 * result + (mGenreIds != null ? mGenreIds.hashCode() : 0);
        result = 31 * result + (mId != null ? mId.hashCode() : 0);
        result = 31 * result + (mOriginalLanguage != null ? mOriginalLanguage.hashCode() : 0);
        result = 31 * result + (mOriginalTitle != null ? mOriginalTitle.hashCode() : 0);
        result = 31 * result + (mOverview != null ? mOverview.hashCode() : 0);
        result = 31 * result + (mPopularity != null ? mPopularity.hashCode() : 0);
        result = 31 * result + (mPosterPath != null ? mPosterPath.hashCode() : 0);
        result = 31 * result + (mReleaseDate != null ? mReleaseDate.hashCode() : 0);
        result = 31 * result + (mTitle != null ? mTitle.hashCode() : 0);
        result = 31 * result + (mVideo != null ? mVideo.hashCode() : 0);
        result = 31 * result + (mVoteAverage != null ? mVoteAverage.hashCode() : 0);
        result = 31 * result + (mVoteCount != null ? mVoteCount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MovieDetailModel{" +
                "mAdult=" + mAdult +
                ", mBackdropPath='" + mBackdropPath + '\'' +
                ", mGenreIds=" + mGenreIds +
                ", mId=" + mId +
                ", mOriginalLanguage='" + mOriginalLanguage + '\'' +
                ", mOriginalTitle='" + mOriginalTitle + '\'' +
                ", mOverview='" + mOverview + '\'' +
                ", mPopularity=" + mPopularity +
                ", mPosterPath='" + mPosterPath + '\'' +
                ", mReleaseDate='" + mReleaseDate + '\'' +
                ", mTitle='" + mTitle + '\'' +
                ", mVideo=" + mVideo +
                ", mVoteAverage=" + mVoteAverage +
                ", mVoteCount=" + mVoteCount +
                '}';
    }
}
