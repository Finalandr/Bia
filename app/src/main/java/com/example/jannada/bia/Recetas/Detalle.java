package com.example.jannada.bia.Recetas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jannada.bia.R;

public class Detalle extends AppCompatActivity {

    TextView pasos,ingrediente;
    ImageView imagen;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recetas);

        pasos=findViewById(R.id.TextStep);
        ingrediente=findViewById(R.id.ingredientes);
        imagen=findViewById(R.id.pasosimagen);

        Bundle extra= getIntent().getExtras();
        int imagenes=extra.getInt("dat1");
        String ingredientes= extra.getString("dat2");
        String paso= extra.getString("dat3");

        ingrediente.setText(ingredientes);
        pasos.setText(paso);
        imagen.setImageResource(imagenes);



    }


}