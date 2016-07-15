package com.example.usuario.delight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Usuario on 6/07/2016.
 */
public class Dulces extends AppCompatActivity {
    private Button botonCerrar2;
    Spinner lista;
    String[] datos = {"Seleccione el pastel que le Guste",
            "Caramelo"
                };
    private Button botonCerrar1;

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dulces);

        botonCerrar2 = (Button) findViewById(R.id.btn);
        botonCerrar2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
            }
        });

       lista = (Spinner)findViewById(R.id.opciones_view);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datos);
        lista.setAdapter(adaptador);
        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub

                switch (arg2) {
                    case 1:
                        Intent in = new Intent(Dulces.this, Caramelo.class);
                        startActivity(in);
                        Toast to = Toast.makeText(getApplicationContext(), datos[arg2], Toast.LENGTH_LONG);
                        to.show();
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


