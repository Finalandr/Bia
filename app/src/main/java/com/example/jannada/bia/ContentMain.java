package com.example.jannada.bia;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jannada.bia.adapters.SeccionAdapter;

import java.util.ArrayList;

public class ContentMain extends Activity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        recyclerView= findViewById(R.id.recyclerView);

        try {
            layoutManager= new GridLayoutManager(this,2);
            recyclerView.setLayoutManager(layoutManager);

            adapter= new SeccionAdapter(this,getListItem());

            recyclerView.setAdapter(adapter);
        }catch (Exception e){
            alerta("algo pasa "+e);
        }
}

    private ArrayList<Item> getListItem(){
        ArrayList<Item> listItem= new ArrayList<>();

        try {
            listItem.add(new Item(R.drawable.ensalada6, "Ensaladas"));
            listItem.add(new Item(R.drawable.comidaligth2, "Ensaladas"));
            listItem.add(new Item(R.drawable.desayuno5, "Ensaladas"));
            listItem.add(new Item(R.drawable.almuerzo4, "Ensaladas"));
            listItem.add(new Item(R.drawable.cena, "Ensaladas"));
            listItem.add(new Item(R.drawable.postre7, "Ensaladas"));
            listItem.add(new Item(R.drawable.comidarapidaencasa5, "Ensaladas"));
            listItem.add(new Item(R.drawable.bebida, "Ensaladas"));
        }catch (Exception e){
            alerta("algo pasa"+ e);
        }

        return listItem;

    }

    public void alerta( String a){

        AlertDialog.Builder alerta= new AlertDialog.Builder(this);
        alerta.setMessage(a);
        alerta.setTitle("Alerta");
        alerta.setNeutralButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog = alerta.create();
        dialog.show();
    }
}
