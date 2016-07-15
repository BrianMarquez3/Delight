package com.example.usuario.delight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Usuario on 9/07/2016.
 */
public class Pedido extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pedido);

        final Button boton = (Button) findViewById(R.id.ingresar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = ((EditText)findViewById(R.id.txtusuario)).getText().toString();
                String contraseña = ((EditText)findViewById(R.id.txtcontrasena)).getText().toString();
                if (usuario.equals("admin")&& contraseña.equals("admin"))
                {
                    Intent nuevoform = new Intent(Pedido.this,Gracias.class);
                    startActivity(nuevoform);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_LONG).show();;
                }
            }
        });
    }
}