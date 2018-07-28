package com.example.jannada.bia.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.jannada.bia.Item;
import com.example.jannada.bia.R;

import java.util.ArrayList;

public class SeccionAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<Item> Itemlist;


    public SeccionAdapter(Context context, ArrayList<Item> itemlist) {
        this.context = context;
        this.Itemlist = itemlist;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.seccion_view,null);
        return new Holder(contentView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Item item= Itemlist.get(position);
        Holder holderr= (Holder) holder;
        holderr.im.setImageResource(item.getFoto());
        holderr.tv.setText(item.getTitulo());

    }

    @Override
    public int getItemCount() {
        return Itemlist.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        ImageButton im;
        TextView tv;

        public Holder(View itemView) {
            super(itemView);

            im= (ImageButton) itemView.findViewById(R.id.imageButtonseccion);
            tv= (TextView) itemView.findViewById(R.id.textseccion);
        }
    }
}
