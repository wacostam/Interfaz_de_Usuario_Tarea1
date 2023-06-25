package com.example.tarea_interfazdeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        TextView txtResultado = (TextView)findViewById(R.id.txtResultado);
        Bundle bundle = this.getIntent().getExtras();
//Construimos el mensaje a mostrar
        txtResultado.setText("DATOS REGISTRADOS,  " +
                " \n " +
                bundle.getString("CEDULA") +
                " \n " +
                bundle.getString("NOMBRE") +
                " \n " +
                bundle.getString("CALENDARIO") +
                " \n " +
                bundle.getString("CIUDAD")+
                " \n " +
                bundle.getString("GENERO")
                + " \n " +
                bundle.getString("CORREO")
                + " \n " +
                bundle.getString("TELEFONO"));

    }
}