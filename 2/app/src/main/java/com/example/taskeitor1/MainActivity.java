package com.example.taskeitor1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button primero = findViewById(R.id.agregarTarea);
        Button segundo = findViewById(R.id.irAlMapa);
        Button tercero = findViewById(R.id.irAPendientes);
        Button cuarto = findViewById(R.id.irATienda);
        Button quinto = findViewById(R.id.irAAbout);
        Button sexto = findViewById(R.id.irATiempo);

        primero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAgregarTarea();

            }

        });

        segundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });

        tercero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPendientes();
            }
        });

        cuarto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTienda();
            }
        });

        quinto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout();
            }
        });

        sexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openTiempo();
            }
        });
    }

    public void openAgregarTarea() {
        Intent abrir1 = new Intent(this, agregarTarea.class);
        startActivity(abrir1);
    }

    public void openMap(){
        Intent abrir2 = new Intent(this, map.class);
        startActivity(abrir2);
    }

    public void openPendientes(){
        Intent abrir3 = new Intent(this, tareasPendientes.class);
        startActivity(abrir3);
    }

    public void openTienda(){
        Intent abrir4 = new Intent(this, tienda.class);
        startActivity(abrir4);
    }

    public void openAbout(){
        Intent abrir5 = new Intent(this, desarrolladores.class);
        startActivity(abrir5);
    }

    public void openTiempo(){
        Intent abrir6 = new Intent(this, tiempoLibre.class);
        startActivity(abrir6);
    }
}

