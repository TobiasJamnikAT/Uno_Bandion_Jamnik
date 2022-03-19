package com.example.uno_bandion_jamnik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView hand1;
    private RecyclerView hand2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hand1 = findViewById(R.id.rvHand1);
        hand2 = findViewById(R.id.rvHand2);

        List<Card> cardList = new LinkedList<>();

        hand1.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        hand1.setAdapter(new CardAdapter(cardList));
        hand2.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        hand2.setAdapter(new CardAdapter(cardList));
    }
}