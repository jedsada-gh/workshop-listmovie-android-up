package com.jedsada.listmovieworkshopup.complete.ui.main.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.jedsada.listmovieworkshopup.R;
import com.jedsada.listmovieworkshopup.complete.model.MovieDetailModel;
import com.jedsada.listmovieworkshopup.complete.model.MovieModel;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> implements MovieViewHolder.MovieItemListener {

    public interface MovieAdapterListener {
        void movieItemClick(MovieDetailModel model);
    }

    private MovieAdapterListener listener;
    private MovieModel model = null;

    public void setData(MovieModel model) {
        this.model = model;
        notifyDataSetChanged();
    }

    public MovieModel getData() {
        return model;
    }

    public void setListener(MovieAdapterListener listener) {
        this.listener = listener;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MovieViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_item, parent, false));
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.onBindData(model.getResults().get(position), this);
    }

    @Override
    public int getItemCount() {
        return model == null ? 0 : model.getResults().size();
    }

    @Override
    public void movieItemClick(int position) {
        if (listener != null) listener.movieItemClick(model.getResults().get(position));
    }
}
