package com.facci.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login, guardar, buscar, PasarParametro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaramos el elemento boton
        login = (Button)findViewById(R.id.buttonLogin);
        guardar = (Button)findViewById(R.id.buttonGuardar);
        buscar = (Button)findViewById(R.id.buttonBuscar);
        PasarParametro = (Button)findViewById(R.id.buttonPasarParametros);

        // A dicho elemento se le agrega un evento clic
        PasarParametro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Declaramos un evento intent que sirve para enlazar con otra actividad
                Intent intent = new Intent(MainActivity.this,PasarParametroActivity.class);
                //Llamamos al dicho evento con el metodo startActivity
                startActivity(intent);
            }
        });
    }
}
