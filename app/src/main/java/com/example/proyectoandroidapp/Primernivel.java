package com.example.proyectoandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class Primernivel extends AppCompatActivity {

    private TextView tv_nombre, tv_score;
    private RadioButton bt_opcion1, bt_opcion2, bt_opcion3;
    private ImageView iv_banderas;

    String botones[] = {"españa", "francia", "alemania"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primernivel);

        tv_nombre = (TextView) findViewById(R.id.tv_nombre);
        bt_opcion1 = (RadioButton) findViewById(R.id.boton_opcion1);
        bt_opcion2 = (RadioButton) findViewById(R.id.bt_opcion2);
        bt_opcion3 = (RadioButton) findViewById(R.id.bt_opcion3);
        iv_banderas = (ImageView) findViewById(R.id.iv_banderas);
// traer el nombre de la activity principal
        String viajero = getIntent().getStringExtra("nombre");
        tv_nombre.setText(viajero);

// hacer muestre imagen aleatoria de banderas


        ArrayList<String> europa = new ArrayList<String>();
        europa.add("España");
        europa.add("Francia");
        europa.add("Alemania");

        int bandera = (int) (Math.random() * 3);
        int opciones= (int) (Math.random() *3+1);
        int bandera2=0;
        int bandera3=0;
        String banderasfalsauno="";
        String banderasfalsados="";
        String banderacorrecta= europa.get(bandera);


        for(int i =1;i <= 3;i++){
            bandera2=(int) (Math.random()*3);
            bandera3=(int) (Math.random()*3);
            if(bandera==bandera2){
                i--;
            }else{
                banderasfalsauno= europa.get(bandera2);
            }
            if (bandera==bandera2 || bandera==bandera3){
                i--;
            }else{
                banderasfalsados=europa.get(bandera3);
            }

        }



        switch (bandera) {
            case 0:
                iv_banderas.setImageResource(R.drawable.activityeuropa);

                switch (opciones) {
                    case 1:
                        bt_opcion1.setText(banderacorrecta);
                        bt_opcion2.setText(banderasfalsauno);
                        bt_opcion3.setText(banderasfalsados);
                        break;
                    case 2:
                        bt_opcion1.setText(banderasfalsauno);
                        bt_opcion2.setText(banderacorrecta);
                        bt_opcion3.setText(banderasfalsados);
                        break;
                    case 3:
                        bt_opcion1.setText(banderasfalsados);
                        bt_opcion2.setText(banderasfalsauno);
                        bt_opcion3.setText(banderacorrecta);

                        break;
                }




                break;
            case 1:
                iv_banderas.setImageResource(R.drawable.activityamerica);
                switch (opciones){
                    case 1:
                        bt_opcion1.setText(banderacorrecta);
                        bt_opcion2.setText(banderasfalsauno);
                        bt_opcion3.setText(banderasfalsados);
                        break;
                    case 2:
                        bt_opcion1.setText(banderasfalsauno);
                        bt_opcion2.setText(banderacorrecta);
                        bt_opcion3.setText(banderasfalsados);
                        break;
                    case 3:
                        bt_opcion1.setText(banderasfalsados);
                        bt_opcion2.setText(banderasfalsauno);
                        bt_opcion3.setText(banderacorrecta);
                        break;
                }
                break;
            case 2:
                iv_banderas.setImageResource(R.drawable.activityafrica);
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


























