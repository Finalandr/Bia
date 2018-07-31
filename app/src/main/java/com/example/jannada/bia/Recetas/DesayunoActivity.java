package com.example.jannada.bia.Recetas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.jannada.bia.Item;
import com.example.jannada.bia.MainActivity;
import com.example.jannada.bia.R;
import com.example.jannada.bia.adapters.RecetaAdapter;
import com.example.jannada.bia.adapters.SeccionAdapter;

import java.util.ArrayList;

public class DesayunoActivity extends AppCompatActivity {

    private ArrayList<Item> listItem;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);


        //Aca va el código que hará que se visualicen las recetas disponibles
        recyclerView= findViewById(R.id.recyclerDesayuno);

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

        /*final Intent desayuno= new Intent(MainActivity.this, DesayunoActivity.class);
        final Intent cena= new Intent(MainActivity.this, CenaActivity.class);
        final Intent almuerzo= new Intent(MainActivity.this, AlmuerzoActivity.class);
        final Intent ligth= new Intent(MainActivity.this, LigthActivity.class);
        final Intent ensalada= new Intent(MainActivity.this, EnsaladaActivity.class);
        final Intent postre= new Intent(MainActivity.this, PostreActivity.class);
        final Intent bebida= new Intent(MainActivity.this, BebidasActivity.class);
        final Intent rapida= new Intent(MainActivity.this, RapidaActivity.class);*/


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

                //Lo puse aqui

               /* if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Cena"){
                    startActivity(cena);
                }if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Desayuno"){
                    startActivity(desayuno);
                }if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Almuerzo"){
                    startActivity(almuerzo);
                }if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Comida Ligth"){
                    startActivity(ligth);
                }if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Ensalada"){
                    startActivity(ensalada);
                }if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Postre"){
                    startActivity(postre);
                }if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Bebidas"){
                    startActivity(bebida);
                }if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Comida Rapida"){
                    startActivity(rapida);
                }*/

            }
        });

        recyclerView.setAdapter(adapter);

    }

}
