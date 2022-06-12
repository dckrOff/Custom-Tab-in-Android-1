package com.example.tablayouttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ColorStateList def;
    TextView item1, item2, item3, select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        item1 = findViewById(R.id.item1);
        item2 = findViewById(R.id.item2);
        item3 = findViewById(R.id.item3);

        select = findViewById(R.id.select);
        def = item3.getTextColors();

        item1.setOnClickListener(this);
        item2.setOnClickListener(this);
        item3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.item1) {
            select.animate().x(0).setDuration(100);
            item1.setTextColor(Color.WHITE);
            item2.setTextColor(def);
            item3.setTextColor(def);
        } else if (view.getId() == R.id.item2) {
            item1.setTextColor(def);
            item2.setTextColor(Color.WHITE);
            item3.setTextColor(def);
            int size = item2.getWidth();
            select.animate().x(size).setDuration(100);
        } else if (view.getId() == R.id.item3) {
            item1.setTextColor(def);
            item2.setTextColor(def);
            item3.setTextColor(Color.WHITE);
            int size = item2.getWidth() * 2;
            select.animate().x(size).setDuration(100);
        }
    }
}