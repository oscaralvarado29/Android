package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculosActivity extends AppCompatActivity {

    Button sumatoria;
    Button factorial;
    Button principalOpEs;
    EditText numero1OpEs;
    TextView respuestaOpEs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos);

        sumatoria = findViewById(R.id.sumatoria);
        factorial = findViewById(R.id.factorial);
        principalOpEs = findViewById(R.id.principalOpEs);
        numero1OpEs = findViewById(R.id.numero1OpEs);
        respuestaOpEs = findViewById(R.id.respuestaOpEs);

        //operacion sumatoria
        sumatoria.setOnClickListener(view -> {
            String valor1 = numero1OpEs.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            int suma=0;
            for (int i=1; i<=nro1; i++){
                suma +=i;
            }
            String respuesta = String.valueOf(suma);
            String mensaje = "La sumatoria de "+valor1+ " es: "+ respuesta;
            respuestaOpEs.setText(mensaje);
            Toast.makeText(getApplicationContext(),"Se calculó una sumatoria",Toast.LENGTH_LONG).show();
        });

        //operacion factorial
        sumatoria.setOnClickListener(view -> {
            String valor1 = numero1OpEs.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            int suma=0;
            if (nro1==0){
                suma=1;
            }
            else{
                for (int i=1; i<=nro1; i++){
                    suma *=i;
                }
            }

            String respuesta = String.valueOf(suma);
            String mensaje = "El factorial de "+valor1+ " es: "+ respuesta;
            respuestaOpEs.setText(mensaje);
            Toast.makeText(getApplicationContext(),"Se calculó un factorial",Toast.LENGTH_LONG).show();
        });
    }
}