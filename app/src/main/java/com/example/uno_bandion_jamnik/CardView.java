package com.example.uno_bandion_jamnik;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class CardView {
    private String resource;

    public CardView(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
