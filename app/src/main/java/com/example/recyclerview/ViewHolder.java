package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private TextView genre;
    private TextView year;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.movieName);
        genre = itemView.findViewById(R.id.movieGenre);
        year = itemView.findViewById(R.id.movieYear);
    }

    public TextView getName() {
        return name;
    }

    public TextView getGenre() {
        return genre;
    }

    public TextView getYear() {
        return year;
    }

    public void setName(String name) {
        this.name.setText(name);
    }

    public void setGenre(String genre) {
        this.genre.setText(genre);
    }

    public void setYear(String year) {
        this.year.setText(year);
    }
}