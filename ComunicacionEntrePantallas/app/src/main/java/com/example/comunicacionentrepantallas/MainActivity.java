package com.example.comunicacionentrepantallas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText password;
    Button login;
    Intent datosPasarPantalla;
    Toolbar myToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrarToolBar();
        user=findViewById(R.id.user);
        password=findViewById(R.id.password);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datosPasarPantalla = new Intent(getApplicationContext(),MainActivity2.class);
                datosPasarPantalla.putExtra("usuario",user.getText().toString());
                datosPasarPantalla.putExtra("clave",Integer.parseInt(password.getText().toString()));
                startActivity(datosPasarPantalla);
            }
        });

    }

    private void mostrarToolBar() {
        myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }
}