package com.example.uno_bandion_jamnik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.uno_bandion_jamnik.CardView;
import com.example.uno_bandion_jamnik.CardViewAdapter;
import com.example.uno_bandion_jamnik.R;

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

        List<CardView> cardViewList = new LinkedList<>();

        CardView cardView1 = new CardView("");
        CardView cardView2 = new CardView("");
        CardView cardView3 = new CardView("");
        CardView cardView4 = new CardView("");

        cardViewList.add(cardView1);
        cardViewList.add(cardView2);
        cardViewList.add(cardView3);
        cardViewList.add(cardView4);

        hand1.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        hand1.setAdapter(new CardViewAdapter(cardViewList));
        hand2.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        hand2.setAdapter(new CardViewAdapter(cardViewList));


    }
}