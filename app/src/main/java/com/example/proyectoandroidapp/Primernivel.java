package com.example.proyectoandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Primernivel extends AppCompatActivity {

    private TextView tv_nombre, tv_score;
    private RadioButton bt_opcion1, bt_opcion2, bt_opcion3;
    private ImageView banderas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primernivel);

        tv_nombre = (TextView) findViewById(R.id.tv_nombre);
        bt_opcion1=(RadioButton)findViewById(R.id.boton_opcion1);
        bt_opcion2=(RadioButton)findViewById(R.id.bt_opcion2);
        bt_opcion3=(RadioButton)findViewById(R.id.bt_opcion3) ;
        banderas=(ImageView)findViewById(R.id.banderas);
// traer el nombre de la activity principal
        String viajero = getIntent().getStringExtra("nombre");
        tv_nombre.setText(viajero);
// hacer muestre imagen aleatoria de banderas

        int bandera= (int) (Math.random()*3);
        if (bandera==0)  {
            banderas.setImageResource(R.drawable.activityafrica);
        }
        if (bandera==1) {
            banderas.setImageResource(R.drawable.activityamerica);
        }
        if (bandera==2) {
            banderas.setImageResource(R.drawable.activityeuropa);
        }

   //hacer botones radiobutton aleatorios

        int opciones= (int) (Math.random()*3);

        if (opciones==0){
            bt_opcion1.setText("españa");
            bt_opcion2.setText("alemania");
            bt_opcion3.setText("francia");
        }
        if (opciones==1) {
            bt_opcion1.setText("alemania");
            bt_opcion2.setText("españa");
            bt_opcion3.setText("francia");
        }
        if (opciones==2){
            bt_opcion1.setText("francia");
            bt_opcion2.setText("alemania");
            bt_opcion3.setText("españa");
        }
        // unir los 2




    }
}