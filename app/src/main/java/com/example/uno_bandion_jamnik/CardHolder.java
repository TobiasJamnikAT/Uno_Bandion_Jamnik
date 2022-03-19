package com.example.uno_bandion_jamnik;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardHolder extends RecyclerView.ViewHolder {
    private ImageView imgCard;

    public CardHolder(@NonNull View itemView, ImageView imgCard) {
        super(itemView);
        this.imgCard = imgCard;
    }

    public ImageView getImgCard() {
        return imgCard;
    }

    public void setImgCard(ImageView imgCard) {
        this.imgCard = imgCard;
    }
}
