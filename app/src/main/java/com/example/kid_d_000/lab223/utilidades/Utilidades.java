package com.example.kid_d_000.lab223.utilidades;

/**
 * Created by lenovo on 27/02/2018.
 */

public class Utilidades {
    public static String ID="id_Usuario";
    public static String TABLA="Usuario";
    public static String CLAVE="Clave";
    public static String NOMBRE="Nombre";
    public static String SUELDO="Sueldo";

    public static final String CREAR_TABLA_USUARIO="CREATE TABLE "+TABLA+" ("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+CLAVE+" TEXT NOT NULL, "+NOMBRE+" TEXT, "+SUELDO+" TEXT)";

    public static final String DBNAME="Usuarios";

    /*public static String CREAR_TABLA="CREATE TABLE "+TABLA+"("+
            ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            CLAVE+" TEXT NOT NULL, "+
            NOMBRE+" TEXT, " +
            SUELDO+" TEXT)";
*/

}
