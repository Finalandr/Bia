package com.example.jannada.bia;

public class BaseDatos {

    private String nombrereceta;
    private Integer tiempo;
    private Integer porcion;
    private String ingredientes;
    private String pasos;

    public BaseDatos(String nombrereceta, Integer tiempo, Integer porcion, String ingredientes, String pasos) {
        this.nombrereceta = nombrereceta;
        this.tiempo = tiempo;
        this.porcion = porcion;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
    }

    public String getNombrereceta() {
        return nombrereceta;
    }

    public void setNombrereceta(String nombrereceta) {
        this.nombrereceta = nombrereceta;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public Integer getPorcion() {
        return porcion;
    }

    public void setPorcion(Integer porcion) {
        this.porcion = porcion;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPasos() {
        return pasos;
    }

    public void setPasos(String pasos) {
        this.pasos = pasos;
    }
}
