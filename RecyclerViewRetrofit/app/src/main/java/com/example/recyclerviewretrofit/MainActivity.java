package com.example.recyclerviewretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button fruits,vegitables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruits = findViewById(R.id.fruits);
        vegitables = findViewById(R.id.vegitables);

        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                intent.putExtra("type","fruit");
                startActivity(intent);

            }
        });

        vegitables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                intent.putExtra("type","vegitables");
                startActivity(intent);

            }
        });
    }
}
