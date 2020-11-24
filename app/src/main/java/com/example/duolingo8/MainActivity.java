package com.example.duolingo8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Category> datos;
    ArrayList<Category> c;
    String[] categories_name;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categories_name = new String[]{"Mascotas", "Paisaje", "Vacaciones", "Comida"};

        @SuppressLint("ResourceType") LinearLayout layout = (LinearLayout) findViewById(R.layout.activity_main);

        recycler = findViewById(R.id.RecyclerId);
        recycler.setLayoutManager(new GridLayoutManager(this, 2));

        datos = new ArrayList<>();

        final Button boton_curs1 = findViewById(R.id.boton1);
        boton_curs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos.clear();
                Category c;
                for (int i = 0; i<categories_name.length; i++){
                    Button b = findViewById(R.id.button);
                    c = new Category(categories_name[i], b);
                    datos.add(c);
                }
                AdapterDatos adapter = new AdapterDatos(datos);
                recycler.setAdapter(adapter);
            }
        });

        final Button boton2 = findViewById(R.id.boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("AAAAAAA", "AAAAAAAAAAAA");
            }
        });



    }


}