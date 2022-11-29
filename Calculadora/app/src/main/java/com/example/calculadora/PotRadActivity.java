package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PotRadActivity extends AppCompatActivity {

    Button potencia;
    Button radica;
    Button principalPodRad;
    EditText numero1PodRad;
    EditText numero2PodRad;
    TextView respuestaPodRad;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pot_rad);

        potencia = findViewById(R.id.sumatoria);
        radica = findViewById(R.id.factorial);
        principalPodRad = findViewById(R.id.principalOpEs);
        numero1PodRad = findViewById(R.id.numero1OpEs);
        numero2PodRad = findViewById(R.id.numero2Flotante);
        respuestaPodRad = findViewById(R.id.respuestaOpEs);

        //operacion potenciación
        potencia.setOnClickListener(view ->{
            String valor1 = numero1PodRad.getText().toString();
            String valor2 = numero2PodRad.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            int nro2 = Integer.parseInt(valor2);
            int resultadoPot = (int) Math.pow(nro1,nro2);
            String respuesta = String.valueOf(resultadoPot);
            String mensaje = valor1+" elevado a la "+valor2+ " es: "+ respuesta;
            respuestaPodRad.setText(mensaje);
            Toast.makeText(getApplicationContext(),"Se calculó una potencia",Toast.LENGTH_LONG).show();
        });

        // operacion radicacion
        //operacion potenciación
        radica.setOnClickListener(view ->{
            String valor1 = numero1PodRad.getText().toString();
            String valor2 = numero2PodRad.getText().toString();
            double nro1 = Integer.parseInt(valor1);
            double nro2 = Integer.parseInt(valor2);
            double resultadoPot = Math.pow(nro1,1.0/nro2);
            String respuesta = String.valueOf(resultadoPot);
            String mensaje = "La raiz "+valor2+" de "+valor1+ " es: "+ respuesta;
            respuestaPodRad.setText(mensaje);
            Toast.makeText(getApplicationContext(),"Se calculó una raiz",Toast.LENGTH_LONG).show();
        });
    }
}