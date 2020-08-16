package com.intentsproj.it19177106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void burger(View v){
        Intent intent = new Intent(MainActivity.this,foodDeatils.class);
                startActivity(intent);
    }

    public void add(View v){
        Intent intent = new Intent(MainActivity.this,addNewCatogory.class);
        startActivity(intent);
    }
}