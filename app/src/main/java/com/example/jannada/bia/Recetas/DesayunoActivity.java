package com.example.jannada.bia.Recetas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.View;
import android.widget.Toast;

import com.example.jannada.bia.Comunicador;
import com.example.jannada.bia.Fragments.DetalleFragment;
import com.example.jannada.bia.Item;
import com.example.jannada.bia.MainActivity;
import com.example.jannada.bia.R;
import com.example.jannada.bia.adapters.RecetaAdapter;
import com.example.jannada.bia.adapters.SeccionAdapter;

import java.util.ArrayList;

public class DesayunoActivity extends AppCompatActivity{

    private ArrayList<Item> listItem;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    Activity activity;
    Comunicador comunicador;

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

       final Intent detalle= new Intent(DesayunoActivity.this,Detalle.class);


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

                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Ensaladas"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }
                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Comida Ligth"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }
                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Cena"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }
                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Almuerzo"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }
                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Desayuno"){
                    detalle.putExtra("dat1",R.drawable.mesadetrabajo1);
                    detalle.putExtra("dat2",getString(R.string.detalle));
                    detalle.putExtra("dat3",getString(R.string.pasos));
                    startActivity(detalle);
                }
                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Bebidas"){
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
                }

               // comunicador.enviarInfo(listItem.get(recyclerView.getChildAdapterPosition(v)));


            }
        });

        recyclerView.setAdapter(adapter);

    }

   /* @Override
   /* public void enviarInfo(Item item) {
        DetalleFragment detalle= new DetalleFragment();

        Bundle envio= new Bundle()
    }*/
}
