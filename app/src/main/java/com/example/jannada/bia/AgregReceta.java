package com.example.jannada.bia;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgregReceta extends AppCompatActivity {

    EditText campoTiempo, campoPorcion, campoIngredientes, campoPasos;
    Button btnInsertar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agreg_receta);

        campoTiempo= findViewById(R.id.txttiempo);
        campoPorcion=findViewById(R.id.txtporciones);
        campoIngredientes=findViewById(R.id.txtingredientes);
        campoPasos=findViewById(R.id.txtpasos);
        btnInsertar=findViewById(R.id.btn_agregar);


    }
    public void onClick(View v){
        btnInsertar.setOnClickListener((View.OnClickListener) this);
        switch (v.getId()){
            case R.id.btn_agregar:
                insertar();
                break;
    }

}

    private void insertar() {
        conexiondb conexiondb = new conexiondb(this, "db nrecetas", null,1);
        SQLiteDatabase db = conexiondb.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Utiles.CAMPO_TIEMPO,campoTiempo.getText().toString());
        values.put(Utiles.CAMPO_PORCION,campoPorcion.getText().toString());
        values.put(Utiles.CAMPO_INGREDIENTES,campoIngredientes.getText().toString());
        values.put(Utiles.CAMPO_PASOS,campoPasos.getText().toString());

        Long recetaIng = db.insert(Utiles.TABLA_NRECETA, Utiles.CAMPO_NOMBRERECETA,values);
        Toast.makeText(getApplicationContext(),"La receta: "+recetaIng,Toast.LENGTH_SHORT).show();
        db.close();
    }

}
