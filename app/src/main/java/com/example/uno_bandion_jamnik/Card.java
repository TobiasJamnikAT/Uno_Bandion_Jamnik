package com.example.uno_bandion_jamnik;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Card {
    private String resource;

    public Card(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
