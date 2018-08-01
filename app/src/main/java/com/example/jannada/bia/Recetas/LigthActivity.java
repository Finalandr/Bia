package com.example.jannada.bia.Recetas;

import android.content.Intent;
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

public class LigthActivity extends AppCompatActivity {


    private ArrayList<Item> listItem;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligth);
        recyclerView= findViewById(R.id.recyclerLight);

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

        listItem.add(new Item("1"));
        listItem.add(new Item("2"));
        listItem.add(new Item("3"));
        listItem.add(new Item("4"));
        listItem.add(new Item("5"));
        listItem.add(new Item("6"));
        listItem.add(new Item("7"));
        listItem.add(new Item("8"));
        return listItem;


    }

    public void recyclerEvent(){

        final Intent detalle= new Intent(LigthActivity.this,Detalle.class);


        //Por esta parte se abre en otro



        listItem = new ArrayList<>();

        getListItem();

        RecetaAdapter adapter= new RecetaAdapter(listItem);

        //Lo tenías aquí

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Seleccion: "+listItem.get(recyclerView.getChildAdapterPosition(v))
                        .getTitulo(),Toast.LENGTH_SHORT).show();

                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="1"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }
                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="2"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }
                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="3"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }
                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="4"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }
                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="5"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }
               /* if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Bebidas"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }
                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Postre"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }
                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Comida Rapida"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }*/

                // comunicador.enviarInfo(listItem.get(recyclerView.getChildAdapterPosition(v)));


            }
        });

        recyclerView.setAdapter(adapter);

    }
}
