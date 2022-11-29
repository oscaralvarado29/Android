package com.example.calculadora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EnteroActivity extends AppCompatActivity {

    Button sumaEntera;
    Button restaEntera;
    Button multiplicaEntera;
    Button divicionEntera;
    Button principalEntera;
    EditText numero1Entero;
    EditText numero2Entero;
    TextView respuestaEntera;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entero);

        sumaEntera = findViewById(R.id.sumaEntera);
        restaEntera = findViewById(R.id.restaEntera);
        multiplicaEntera = findViewById(R.id.multiplicaEntera);
        divicionEntera = findViewById(R.id.divicionEntera);
        principalEntera = findViewById(R.id.principalEntera);
        numero1Entero = findViewById(R.id.numero1Entero);
        numero2Entero = findViewById(R.id.numero2Entero);
        respuestaEntera = findViewById(R.id.respuestaEntera);

        //operacion suma
        sumaEntera.setOnClickListener(view -> {
            String valor1 = numero1Entero.getText().toString();
            String valor2 = numero2Entero.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            int nro2 = Integer.parseInt(valor2);
            int resultadoSuma = nro1 + nro2;
            String respuesta = String.valueOf(resultadoSuma);
            String mensaje = "La suma entre "+valor1+" y "+valor2+ " es: "+ respuesta;
            respuestaEntera.setText(mensaje);
            Toast.makeText(getApplicationContext(),"Se realizó una suma",Toast.LENGTH_LONG).show();
        });

        //operacion resta
        restaEntera.setOnClickListener(view -> {
            String valor1 = numero1Entero.getText().toString();
            String valor2 = numero2Entero.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            int nro2 = Integer.parseInt(valor2);
            int resultadoResta = nro1 - nro2;
            String respuesta = String.valueOf(resultadoResta);
            String mensaje = "La resta entre "+valor1+" y "+valor2+ " es: "+ respuesta;
            respuestaEntera.setText(mensaje);
            Toast.makeText(getApplicationContext(),"Se realizó una resta",Toast.LENGTH_LONG).show();
        });

        // proceso multiplicacion
        multiplicaEntera.setOnClickListener(view -> {
            String valor1 = numero1Entero.getText().toString();
            String valor2 = numero2Entero.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            int nro2 = Integer.parseInt(valor2);
            int resultadoMulti = nro1 * nro2;
            String respuesta = String.valueOf(resultadoMulti);
            String mensaje = "La multiplicación entre "+valor1+" y "+valor2+ " es: "+ respuesta;
            respuestaEntera.setText(mensaje);
            Toast.makeText(getApplicationContext(),"Se realizó una multiplicación",Toast.LENGTH_LONG).show();
        });

        //proceso divicion
        divicionEntera.setOnClickListener(view -> {
            String valor1 = numero1Entero.getText().toString();
            String valor2 = numero2Entero.getText().toString();
            double nro1 = Double.parseDouble(valor1);
            double nro2 = Double.parseDouble(valor2);
            if (nro2 == 0.0){
                respuestaEntera.setText("La divición por cero no es permitida");
                Toast.makeText(getApplicationContext(),"No se pudo realizar la divición",Toast.LENGTH_LONG).show();
            }
            else {

                double resultadoDiv= nro1 / nro2;
                String respuesta = String.valueOf(resultadoDiv);
                String mensaje = "La divición entre " + valor1 + " y " + valor2 + " es: " + respuesta;
                respuestaEntera.setText(mensaje);
                Toast.makeText(getApplicationContext(),"Se realizó una divición",Toast.LENGTH_LONG).show();
            }
        });

        //boton para ir al menu principal
        principalEntera.setOnClickListener(view -> {
            Intent principal = new Intent(getApplicationContext(), PrincipalActivity.class);
            startActivity(principal);
        });
    }
    //opciones de menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopcionesentero,menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.opcion1:
                Intent principal = new Intent(getApplicationContext(), PrincipalActivity.class);
                startActivity(principal);
                break;
            case R.id.opcion2:
                Intent flotante = new Intent(getApplicationContext(), FlotanteActivity.class);
                startActivity(flotante);
                break;
            case R.id.opcion3:
                Intent potrad = new Intent(getApplicationContext(), PotRadActivity.class);
                startActivity(potrad);
                break;
            case R.id.opcion4:
                Intent calculos = new Intent(getApplicationContext(), CalculosActivity.class);
                startActivity(calculos);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}