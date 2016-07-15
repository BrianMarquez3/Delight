package com.example.usuario.delight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Usuario on 9/07/2016.
 */
public class Gracias extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gracias);
    }
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "Su Pedido Llegara pronto a su Casa", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.Menu"));
    }
}

