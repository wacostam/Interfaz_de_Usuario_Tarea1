package com.example.tarea_interfazdeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.RadioButton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btEnviar (View view) {
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtCédula = (EditText)findViewById(R.id.txtCédula);
        EditText txtCiudad = (EditText)findViewById(R.id.txtCiudad);
        RadioButton rbMasculino = (RadioButton) findViewById(R.id.rbMasculino);
        RadioButton rbFemenino = (RadioButton) findViewById(R.id.rbFemenino);
        EditText txtCorreo = (EditText)findViewById(R.id.txtCorreo);
        EditText txtTeléfono = (EditText)findViewById(R.id.txtTeléfono);
        CalendarView cvCalendario = (CalendarView) findViewById(R.id.cvCalendario);
        String nombre, cédula, ciudad, género, correo, teléfono;
        long Calendario = cvCalendario.getDate();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String calendario = formatoFecha.format(new Date());
        if (rbMasculino.isChecked())
            género = "Estimado";
        else
            género = "Estimada";
        nombre=txtNombre.getText().toString();
        cédula=txtCédula.getText().toString();
        ciudad=txtCiudad.getText().toString();
        correo=txtCorreo.getText().toString();
        teléfono=txtTeléfono.getText().toString();
        Intent intent = new Intent(MainActivity.this, actividad2.class);
        Bundle b = new Bundle();
        //para enviar la informacion a la otra actividad
        b.putString("CEDULA", cédula);
        b.putString("NOMBRE", nombre);
        b.putString("CALENDARIO", calendario);
        b.putString("CIUDAD", ciudad);
        b.putString("CORREO", correo);
        b.putString("GENERO", género);
        b.putString("TELEFONO", teléfono);
        intent.putExtras(b);
        startActivity(intent);
    }
    public void btLimpiar (View view){
            EditText txtCédula = findViewById(R.id.txtCédula);
            EditText txtNombre = findViewById(R.id.txtNombre);
            CalendarView txtfecha = findViewById(R.id.cvCalendario);
            EditText txtCiudad = findViewById(R.id.txtCiudad);
            RadioButton rbMasculino = findViewById(R.id.rbMasculino);
            RadioButton rbFemenino = findViewById(R.id.rbFemenino);
            EditText txtCorreo = findViewById(R.id.txtCorreo);
            EditText txtTelefono = findViewById(R.id.txtTeléfono);
            txtCédula.setText("");
            txtNombre.setText("");
            txtfecha.setDate(System.currentTimeMillis());
            txtCiudad.setText("");
            rbMasculino.setChecked(false);
            rbFemenino.setChecked(false);
            txtCorreo.setText("");
            txtTelefono.setText("");
    }
}