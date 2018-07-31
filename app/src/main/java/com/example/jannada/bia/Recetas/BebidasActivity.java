package com.example.jannada.bia.Recetas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.jannada.bia.Item;
import com.example.jannada.bia.R;
import com.example.jannada.bia.adapters.RecetaAdapter;

import java.util.ArrayList;

public class BebidasActivity extends AppCompatActivity {

    private ArrayList<Item> listItem;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);
        recyclerView= findViewById(R.id.recyclerBebida);

        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerEvent();

    }


    private ArrayList<Item> getListItem(){
        listItem= new ArrayList<>();

       /* listItem.add(new Item(R.drawable.ensalada6y, "Ensaladas"));
        listItem.add(new Item(R.drawable.comidaligth2y, "Comida Ligth"));
        listItem.add(new Item(R.drawable.desayunoy, "Desayuno"));
        listItem.add(new Item(R.drawable.almuerzo4y, "Almuerzo"));
        listItem.add(new Item(R.drawable.comidalight3y, "Cena"));
        listItem.add(new Item(R.drawable.postre7y, "Postre"));
        listItem.add(new Item(R.drawable.comidarapidaencasaf, "Comida Rapida"));
        listItem.add(new Item(R.drawable.bebiday, "Bebidas"));*/

        listItem.add(new Item("Ensaladas"));
        listItem.add(new Item("Comida Ligth"));
        listItem.add(new Item("Desayuno"));
        listItem.add(new Item("Almuerzo"));
        listItem.add(new Item("Cena"));
        listItem.add(new Item("Postre"));
        listItem.add(new Item("Comida Rapida"));
        listItem.add(new Item("Bebidas"));
        return listItem;

    }

    public void recyclerEvent(){

        //Por esta parte se abre en otro

        //startActivity(receta);

        listItem = new ArrayList<>();

        getListItem();

        RecetaAdapter adapter= new RecetaAdapter(listItem);

        //Lo tenías aquí

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Toast.makeText(getApplicationContext(),"Seleccion: "+listItem.get(recyclerView.getChildAdapterPosition(v))
                        .getTitulo(),Toast.LENGTH_SHORT).show();


            }
        });

        recyclerView.setAdapter(adapter);

    }
}
