package com.example.usuario.delight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Usuario on 5/07/2016.
 */
public class Menu extends AppCompatActivity {
    private Button botonCerrar2;
    Spinner lista;
    String[] datos = {"Seleccione Una Opcion",
            "Pasteles",
            "Chocolates",
            "Dulces",

    };
    private Button botonCerrar1;
    @Override

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        botonCerrar2 = (Button) findViewById(R.id.btn);
        botonCerrar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
        lista = (Spinner)findViewById(R.id.sabores_view);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datos);
        lista.setAdapter(adaptador);
        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub

                switch (arg2) {
                    case 1:
                        Intent in = new Intent(Menu.this, Pasteles.class);
                        startActivity(in);
                        Toast to = Toast.makeText(getApplicationContext(), datos[arg2], Toast.LENGTH_LONG);
                        to.show();
                        break;
                    case 2:
                        Intent in1 = new Intent(Menu.this, Chocolates.class);
                        startActivity(in1);
                        Toast to1 = Toast.makeText(getApplicationContext(), datos[arg2], Toast.LENGTH_LONG);
                        to1.show();
                        break;
                    case 3:
                        Intent in2 = new Intent(Menu.this, Dulces.class);
                        startActivity(in2);
                        Toast to2 = Toast.makeText(getApplicationContext(), datos[arg2], Toast.LENGTH_LONG);
                        to2.show();
                        break;
                    }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }


        });
    }
}