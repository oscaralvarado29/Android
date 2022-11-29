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

public class FlotanteActivity extends AppCompatActivity {

    Button sumaFlotante;
    Button restaFlotante;
    Button multiplicaFlota;
    Button divicionFlotante;
    Button principalFlota;
    EditText numero1Flotante;
    EditText numero2Flotante;
    TextView respuestaFlota;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flotante);

        sumaFlotante = findViewById(R.id.sumatoria);
        restaFlotante = findViewById(R.id.factorial);
        multiplicaFlota = findViewById(R.id.multiplicaFlota);
        divicionFlotante = findViewById(R.id.divicionFlotante);
        principalFlota = findViewById(R.id.principalOpEs);
        numero1Flotante = findViewById(R.id.numero1OpEs);
        numero2Flotante = findViewById(R.id.numero2Flotante);
        respuestaFlota = findViewById(R.id.respuestaOpEs);

        //operacion suma
        sumaFlotante.setOnClickListener(view -> {
            String valor1 = numero1Flotante.getText().toString();
            String valor2 = numero2Flotante.getText().toString();
            double nro1 = Double.parseDouble(valor1);
            double nro2 = Double.parseDouble(valor2);
            double resultadoSuma = nro1 + nro2;
            String resultado = String.valueOf(resultadoSuma);
            String mensaje = "La suma entre "+valor1+" y "+valor2+ " es: "+ resultado;
            respuestaFlota.setText(mensaje);
            Toast.makeText(getApplicationContext(),"Se realizó una suma",Toast.LENGTH_LONG).show();
        });

        //operacion resta
        restaFlotante.setOnClickListener(view -> {
            String valor1 = numero1Flotante.getText().toString();
            String valor2 = numero2Flotante.getText().toString();
            float nro1 = Float.parseFloat(valor1);
            float nro2 = Float.parseFloat(valor2);
            float resultadoResta = nro1 - nro2;
            String respuesta=Float.toString(resultadoResta);
            String mensaje = "La resta entre "+valor1+" y "+valor2+ " es: " + respuesta;
            respuestaFlota.setText(mensaje);

            Toast.makeText(getApplicationContext(),"Se realizó una resta",Toast.LENGTH_LONG).show();
        });

        // proceso multiplicacion
        multiplicaFlota.setOnClickListener(view -> {
            String valor1 = numero1Flotante.getText().toString();
            String valor2 = numero2Flotante.getText().toString();
            double nro1 = Double.parseDouble(valor1);
            double nro2 = Double.parseDouble(valor2);
            double resultadoMulti = nro1 * nro2;
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder respuesta = stringBuilder.append(resultadoMulti);
            String mensaje = "La multiplicación entre "+valor1+" y "+valor2+ " es: "+ respuesta;
            respuestaFlota.setText(respuesta);
            Toast.makeText(getApplicationContext(),"Se realizó una multiplicación",Toast.LENGTH_LONG).show();
        });

        //proceso divicion
        divicionFlotante.setOnClickListener(view -> {
            String valor1 = numero1Flotante.getText().toString();
            String valor2 = numero2Flotante.getText().toString();
            double nro1 = Double.parseDouble(valor1);
            double nro2 = Double.parseDouble(valor2);
            if (nro2 == 0){
                respuestaFlota.setText("La divición por cero no es permitida");
                Toast.makeText(getApplicationContext(),"No se pudo realizar la divición",Toast.LENGTH_LONG).show();
            }
            else {

                double resultadoDiv= nro1 / nro2;
                String respuesta = String.valueOf(resultadoDiv);
                String mensaje = "La divición entre " + valor1 + " y " + valor2 + " es: " + respuesta;
                respuestaFlota.setText(mensaje);
                Toast.makeText(getApplicationContext(),"Se realizó una divición",Toast.LENGTH_LONG).show();
            }
        });

        //boton para ir al menu principal
        principalFlota.setOnClickListener(view -> {
            Intent principal = new Intent(getApplicationContext(), PrincipalActivity.class);
            startActivity(principal);
        });
    }
    //opciones de menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopcionesflotante,menu);
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
                Intent entero = new Intent(getApplicationContext(), EnteroActivity.class);
                startActivity(entero);
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