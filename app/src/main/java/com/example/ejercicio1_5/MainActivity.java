package com.example.ejercicio1_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen = findViewById(R.id.imagenLogos);
    }


    public void cambiarYahoo(View view) {
        imagen.setImageResource(R.drawable.yahoo);
    }

    public void cambiarGoogle(View view) {
        imagen.setImageResource(R.drawable.google);
    }

    public void cambiarBing(View view) {
        imagen.setImageResource(R.drawable.bing);
    }
}
