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

public class SeccionAdapter extends RecyclerView.Adapter<SeccionAdapter.Holder> implements View.OnClickListener {

    private ArrayList<Item> Itemlist;
    private ImageView button;
    private View.OnClickListener listener;


    public SeccionAdapter(ArrayList<Item> itemlist) {
        this.Itemlist = itemlist;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.seccion_view,null);

        contentView.setOnClickListener(this);
        return new Holder(contentView);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        Item item= Itemlist.get(position);
        Holder holderr= (Holder) holder;
        holderr.im.setImageResource(item.getFoto());
        holderr.tv.setText(item.getTitulo());

    }

    @Override
    public int getItemCount() {
        return Itemlist.size();
    }

    public void setOnClickListener(View.OnClickListener listener){

        this.listener= listener;

    }

    @Override
    public void onClick(View v) {

        if(listener!=null){
            listener.onClick(v);
        }

    }

    public class Holder extends RecyclerView.ViewHolder {

        ImageView im;
        TextView tv;

        public Holder(View itemView) {
            super(itemView);

            im= (ImageView) itemView.findViewById(R.id.imageseccion);
            tv= (TextView) itemView.findViewById(R.id.textseccion);
        }
    }
}
