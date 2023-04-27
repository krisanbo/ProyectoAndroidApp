package com.example.proyectoandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText et_nombre;
    private Button bt_jugar;
    private TextView tv1, tv_nuestro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nombre = (EditText) findViewById(R.id.et_nombre);
        String nombre = et_nombre.getText().toString();


    }
    //metodo boton jugar

    public void jugar(View view) {
        String nombre = et_nombre.getText().toString();

        if (nombre.isEmpty()) {
            Toast.makeText(this, "debes introducir tu nombre", Toast.LENGTH_SHORT).show();

        } else {
            Intent jugar = new Intent(this, com.example.proyectoandroidapp.Primernivel.class);
            jugar.putExtra("nombre", et_nombre.getText().toString());
            startActivity(jugar);


        }
    }
}




