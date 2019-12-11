package com.example.contraintandgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void satu(View view){
        Intent i = new Intent(Main4Activity.this,Main2Activity.class);
        startActivity(i);
    }

    public void dua(View view){
        Intent i = new Intent(Main4Activity.this,Main3Activity.class);
        startActivity(i);
    }

    public void tiga(View view){
        Intent i = new Intent(Main4Activity.this,MainActivity.class);
        startActivity(i);
    }
}
