package com.example.proyectoandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText et_nombre;
    private Button bt_jugar;
    private TextView tv1,tv_nuestro;
    ImageView iv_inicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nombre = (EditText) findViewById(R.id.et_nombre);
        String nombre = et_nombre.getText().toString();
        iv_inicio=(ImageView)findViewById(R.id.iv_inicio);



        for (int i =1; i<=2;i++) {
            int numero = (int) (Math.random() * 2 +1);

            Integer [] imagenes = {R.drawable.image0, R.drawable.image2};


            switch (numero){
                case 1:
                    numero= 0;
                    iv_inicio.setImageResource(imagenes[0]);
                    break;
                case 2:
                    numero= 1;
                    iv_inicio.setImageResource(imagenes[1]);
                    break;

            }
        }



    }


    //metodo boton jugar

    public void jugar(View view){
        String nombre = et_nombre.getText().toString();

        if (nombre.isEmpty()){
            Toast.makeText(this, "debes introducir tu nombre", Toast.LENGTH_SHORT).show();

        }else{
            Intent jugar= new Intent(this, com.example.proyectoandroidapp.Primernivel.class);
            startActivity(jugar);
            Toast.makeText(this, "debes introducir tu nombre", Toast.LENGTH_SHORT).show();


        }
    }


}