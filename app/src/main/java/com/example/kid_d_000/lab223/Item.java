package com.example.kid_d_000.lab223;

/**
 * Created by kid_d_000 on 12/03/2018.
 */

public class Item {
    private String clave,nombre,sueldo;

    public Item(String clave, String nombre, String sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.sueldo=sueldo;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSueldo() {
        return sueldo;
    }
}
