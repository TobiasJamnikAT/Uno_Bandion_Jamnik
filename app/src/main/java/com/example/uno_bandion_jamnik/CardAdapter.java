package com.example.uno_bandion_jamnik;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardHolder> {
    List<Card> cardList;

    public CardAdapter(List<Card> cardList) {
        this.cardList = cardList;
    }

    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        CardHolder holder = new CardHolder(view, view.findViewById(R.id.imageView));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardHolder holder, int position) {
        Card card = cardList.get(position);
        holder.getImgCard().setBackground(Drawable.createFromPath(card.getResource()));
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }
}
