package com.example.taskeitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class addTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        //obteniendo la resolución de la pantalla del dispositivo:
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        //el tamaño del layout será el 80% de la pantalla del dispositivo
        //en alto y ancho
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width*.8), (int) (height*.8));

        Button addDateButton = findViewById(R.id.addDateButton);

        addDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalendar();
            }
        });
    }

    public void openCalendar(){
        Intent openingCalendar = new Intent(this, calendar.class);
        startActivity(openingCalendar);
    }
}
