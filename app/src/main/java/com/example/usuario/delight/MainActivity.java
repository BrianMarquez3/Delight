package com.example.usuario.delight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button botonCerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonCerrar = (Button) findViewById(R.id.btnCerrar);
        botonCerrar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                finish();
            }
        });
    }

    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "Menu Principal Delicia", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.Menu"));
    }

    public void onClick1(View view) {
        Toast.makeText(getApplicationContext(), "Informacion de la apliccion", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.Info"));
    }
}
