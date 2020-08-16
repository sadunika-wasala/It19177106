package com.intentsproj.it19177106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class foodDetailsDiscript extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details_discript);
    }

    public void add(View v){
        Intent intent = new Intent(foodDetailsDiscript.this, addFood.class);
        startActivity(intent);
    }

    public void update(View v){
        Intent intent = new Intent(foodDetailsDiscript.this,UpdateFoodDetails.class);
        startActivity(intent);
    }

    public void delete(View v){
        Intent intent = new Intent(foodDetailsDiscript.this,deleteFood.class);
        startActivity(intent);
    }


}