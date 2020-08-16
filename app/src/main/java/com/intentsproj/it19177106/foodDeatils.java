package com.intentsproj.it19177106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class foodDeatils extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_deatils);
    }

    public void add(View v){
        Intent intent = new Intent(foodDeatils.this,addFood.class);
        startActivity(intent);
    }

    public void description(View v){
        Intent intent = new Intent(foodDeatils.this,foodDetailsDiscript.class);
        startActivity(intent);
    }

    public void update(View v){
        Intent intent = new Intent(foodDeatils.this,Updatecatogory.class);
        startActivity(intent);
    }

    public void delete(View v){
        Intent intent = new Intent(foodDeatils.this,deleteCategory.class);
        startActivity(intent);
    }
}