package com.example.uno_bandion_jamnik;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewHolder> {
    List<CardView> cardViewList;

    public CardViewAdapter(List<CardView> cardViewList) {
        this.cardViewList = cardViewList;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        CardViewHolder holder = new CardViewHolder(view, view.findViewById(R.id.imageView));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        CardView cardView = cardViewList.get(position);
        holder.getImgCard().setBackground(Drawable.createFromPath(cardView.getResource()));
    }

    @Override
    public int getItemCount() {
        return cardViewList.size();
    }
}
