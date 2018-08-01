package com.example.jannada.bia;

public class Utiles {

    //Costantes campos tablas

    public static String TABLA_NRECETA = "nrecetas";
    public static String CAMPO_NOMBRERECETA = "nomreceta";
    public static String CAMPO_TIEMPO = "time";
    public static String CAMPO_PORCION = "porcion";
    public static String CAMPO_INGREDIENTES = "ingredientes";
    public static String CAMPO_PASOS = "pasos";


    public static String CREAR_TABLA_NRECETA="CREATE TABLE "+TABLA_NRECETA+" ("+CAMPO_NOMBRERECETA+" TEXT, "+CAMPO_TIEMPO+" INTEGER, "+CAMPO_PORCION+" INTEGER, "+CAMPO_INGREDIENTES+" TEXT, "+CAMPO_PASOS+" TEXT)";

}
