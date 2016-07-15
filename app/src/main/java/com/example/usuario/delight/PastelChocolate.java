package com.example.usuario.delight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Usuario on 6/07/2016.
 */
public class PastelChocolate extends AppCompatActivity {
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasteleschocolate);
    }
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "Para Hacer un Pedido debe Registrarse", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.Pedido"));
    }
}
