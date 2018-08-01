package com.example.jannada.bia;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jannada.bia.Recetas.AlmuerzoActivity;
import com.example.jannada.bia.Recetas.BebidasActivity;
import com.example.jannada.bia.Recetas.CenaActivity;
import com.example.jannada.bia.Recetas.DesayunoActivity;
import com.example.jannada.bia.Recetas.EnsaladaActivity;
import com.example.jannada.bia.Recetas.LigthActivity;
import com.example.jannada.bia.Recetas.PostreActivity;
import com.example.jannada.bia.Recetas.RapidaActivity;
import com.example.jannada.bia.adapters.SeccionAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ArrayList<Item> listItem;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //aqui se le agrega contenido dinamicamente al recycler view

        final Intent miIntent = new Intent(MainActivity.this,AgregReceta.class);

        recyclerView= findViewById(R.id.recyclerView);

        layoutManager= new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);

        recyclerEvent();


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Acá el botón de agregar recetas

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Toast.makeText(getApplicationContext(),"Nueva Receta",Toast.LENGTH_LONG).show();
                startActivity(miIntent);



            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //Aquí la base de datos
        //Aquí la base de datos
        // Aquí la base de datos
        //Aquí la base de datos
        //Aquí la base de datos
        //Aquí la base de datos

        conexiondb conexiondb = new conexiondb(this, "db nrecetas", null,1);


    }

    private ArrayList<Item> getListItem(){
        listItem= new ArrayList<>();

        listItem.add(new Item(R.drawable.ensalada6y, "Ensalada"));
        listItem.add(new Item(R.drawable.comidaligth2y, "Comida Ligth"));
        listItem.add(new Item(R.drawable.desayunoy, "Desayuno"));
        listItem.add(new Item(R.drawable.almuerzo4y, "Almuerzo"));
        listItem.add(new Item(R.drawable.comidalight3y, "Cena"));
        listItem.add(new Item(R.drawable.postre7y, "Postre"));
        listItem.add(new Item(R.drawable.comidarapidaencasaf, "Comida Rapida"));
        listItem.add(new Item(R.drawable.bebiday, "Bebidas"));
        return listItem;

    }

    public void recyclerEvent(){

        final Intent desayuno= new Intent(MainActivity.this, DesayunoActivity.class);
        final Intent cena= new Intent(MainActivity.this, CenaActivity.class);
        final Intent almuerzo= new Intent(MainActivity.this, AlmuerzoActivity.class);
        final Intent ligth= new Intent(MainActivity.this, LigthActivity.class);
        final Intent ensalada= new Intent(MainActivity.this, EnsaladaActivity.class);
        final Intent postre= new Intent(MainActivity.this, PostreActivity.class);
        final Intent bebida= new Intent(MainActivity.this, BebidasActivity.class);
        final Intent rapida= new Intent(MainActivity.this, RapidaActivity.class);


        //Por esta parte se abre en otro

        //startActivity(receta);

        listItem = new ArrayList<>();

        getListItem();

        SeccionAdapter adapter= new SeccionAdapter(listItem);

        //Lo tenías aquí

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Toast.makeText(getApplicationContext(),listItem.get(recyclerView.getChildAdapterPosition(v))
                        .getTitulo(),Toast.LENGTH_SHORT).show();

               //Lo puse aqui

                if(listItem.get(recyclerView.getChildAdapterPosition(v)).getTitulo()=="Cena"){
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
                }

            }
        });

        recyclerView.setAdapter(adapter);

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
