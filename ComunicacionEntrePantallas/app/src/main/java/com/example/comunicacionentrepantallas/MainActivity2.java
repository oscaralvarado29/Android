package com.example.comunicacionentrepantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView texto1,texto2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        texto1 = findViewById(R.id.texto1);
        texto2 = findViewById(R.id.texto2);

        Bundle datosEntradaPantalla = getIntent().getExtras();
        String usuario = datosEntradaPantalla.getString("usuario");
        int clave = datosEntradaPantalla.getInt("clave");

        texto1.setText(usuario);
        texto2.setText(String.valueOf(clave));
    }
}