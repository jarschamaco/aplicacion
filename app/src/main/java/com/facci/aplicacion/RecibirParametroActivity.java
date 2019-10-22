package com.facci.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecibirParametroActivity extends AppCompatActivity {

    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_parametro);
        //Declaramos los elementos necesarios
        texto = (TextView)findViewById(R.id.lblParametro);
        //Recibimos los parametos definidos en el objeto bundle
        Bundle bundle = this.getIntent().getExtras();
        //Enviamos el parametro recibo al label
        texto.setText(bundle.getString("parametro"));
    }
}
