package com.example.jannada.bia;

import java.io.Serializable;

public class Item implements Serializable{

    private int foto;
    private String titulo;


    public Item(int foto, String titulo) {
        this.foto = foto;
        this.titulo = titulo;

    }

    public Item (String titulo){
        this.titulo=titulo;
    }

    public int getFoto() {
        return foto;
    }

    public String getTitulo() {
        return titulo;
    }
}
