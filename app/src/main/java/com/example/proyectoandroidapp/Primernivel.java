package com.example.proyectoandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

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

        String viajero = getIntent().getStringExtra("nombre");
        tv_nombre.setText(viajero);



    }
    public void banderas(View view){
























    }

}