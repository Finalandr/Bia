package com.example.jannada.bia.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jannada.bia.Item;
import com.example.jannada.bia.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class RecetaAdapter extends RecyclerView.Adapter<RecetaAdapter.RecetasViewHolder> implements View.OnClickListener {

    ArrayList<Item> listitem;
    private View.OnClickListener listener;

    public RecetaAdapter(ArrayList<Item> itemlist) {
        this.listitem = itemlist;
    }

    @NonNull
    @Override
    public RecetasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_platillo,null);
        view.setOnClickListener(this);
        return new RecetasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecetasViewHolder holder, int position) {
        Item item= listitem.get(position);
        RecetasViewHolder holderr= (RecetasViewHolder) holder;
        holderr.nombre.setText(listitem.get(position).getTitulo());
        holderr.imagen.setImageResource(listitem.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener= listener;

    }

    @Override
    public void onClick(View v) {

        if (listener!=null){
            listener.onClick(v);
        }

    }

    public class RecetasViewHolder extends RecyclerView.ViewHolder {

        TextView nombre;
        ImageView imagen;

        public RecetasViewHolder(View itemView) {
            super(itemView);

            nombre= itemView.findViewById(R.id.platillo_nombre);
            imagen=itemView.findViewById(R.id.platillo_imagen);
        }
    }
}
