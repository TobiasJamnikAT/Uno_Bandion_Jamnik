package com.example.uno_bandion_jamnik;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Card {
    private String resource = "@drawable/card1_green.png";
    private ImageView imgView;

    public Card(String resource) {
        this.resource = resource;
        imgView.setBackground(Drawable.createFromPath(resource));
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
