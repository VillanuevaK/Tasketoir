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

        Button botonAgregar = findViewById(R.id.agregarTarea);
        Button botonMapa = findViewById(R.id.irAlMapa);
        Button botonTareas = findViewById(R.id.irAPendientes);
        Button botonTienda = findViewById(R.id.irATienda);
        Button botonAbout = findViewById(R.id.irAAbout);
        Button botonTiempo = findViewById(R.id.irATiempo);
        Button botonNotas = findViewById(R.id.irANotas);

        botonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAgregarTarea();

            }

        });

        botonMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });

        botonTareas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPendientes();
            }
        });

        botonTienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTienda();
            }
        });

        botonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout();
            }
        });

        botonTiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openTiempo();
            }
        });

        botonNotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotas();
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

    public void openNotas(){
        Intent abrir7 = new Intent(this, notas.class);
        startActivity(abrir7);
    }
}

