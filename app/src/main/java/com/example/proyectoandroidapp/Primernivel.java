package com.example.proyectoandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Primernivel extends AppCompatActivity {

    private TextView tv_nombre, tv_score;
    private RadioButton bt_opcion1, bt_opcion2, bt_opcion3;
    private ImageView banderas;

    String botones[] = {"españa", "francia", "alemania"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primernivel);

        tv_nombre = (TextView) findViewById(R.id.tv_nombre);
        bt_opcion1 = (RadioButton) findViewById(R.id.boton_opcion1);
        bt_opcion2 = (RadioButton) findViewById(R.id.bt_opcion2);
        bt_opcion3 = (RadioButton) findViewById(R.id.bt_opcion3);
        banderas = (ImageView) findViewById(R.id.banderas);
// traer el nombre de la activity principal
        String viajero = getIntent().getStringExtra("nombre");
        tv_nombre.setText(viajero);

// hacer muestre imagen aleatoria de banderas


        ArrayList<String> europa = new ArrayList<String>();
        europa.add("España");
        europa.add("Francia");
        europa.add("Alemania");

        int bandera = (int) (Math.random() * 2 + 1);
        int opciones= (int) (Math.random()*3+1);



        switch (bandera) {
            case 0:
                banderas.setImageResource(R.drawable.activityeuropa);

                switch (opciones){
                    case 1:
                        bt_opcion1.setText(europa.get(bandera));
                        break;
                    case 2:
                        bt_opcion2.setText(europa.get(bandera));
                        break;
                    case 3:
                        bt_opcion3.setText(europa.get(bandera));
                        break;
                }




                break;
            case 1:
                banderas.setImageResource(R.drawable.activityamerica);
                switch (opciones){
                    case 1:
                        bt_opcion1.setText(europa.get(bandera));
                        break;
                    case 2:
                        bt_opcion2.setText(europa.get(bandera));
                        break;
                    case 3:
                        bt_opcion3.setText(europa.get(bandera));
                        break;
                }
                break;
            case 2:
                banderas.setImageResource(R.drawable.activityafrica);
                switch (opciones){
                    case 1:
                        bt_opcion1.setText(europa.get(bandera));
                        break;
                    case 2:
                        bt_opcion2.setText(europa.get(bandera));
                        break;
                    case 3:
                        bt_opcion3.setText(europa.get(bandera));
                        break;
                }
                break;


        }

    }
}


























