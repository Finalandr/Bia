package com.example.jannada.bia;

import java.io.Serializable;

public class Item implements Serializable{

    private int foto;
    private String titulo;
    private String descripcion;
    private String pasos;
    private int fotoDtalle;

    public Item(int foto, String titulo) {
        this.foto = foto;
        this.titulo = titulo;

    }

    public Item(int foto, String titulo, String descripcion, String pasos, int fotoDtalle) {
        this.foto = foto;
        this.titulo = titulo;
        this.descripcion= descripcion;
        this.fotoDtalle=fotoDtalle;
        this.pasos=pasos;

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
