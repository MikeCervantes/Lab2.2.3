package com.example.kid_d_000.lab223;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.kid_d_000.lab223.utilidades.Utilidades;

import java.util.ArrayList;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {
    public SQLiteDatabase myDB;

    public ConexionSQLiteHelper(Context context) {
        super(context, Utilidades.DBNAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(Utilidades.CREAR_TABLA_USUARIO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        //sqLiteDatabase.execSQL("DROP TABLE IF EXISTS usuarios");
        //onCreate(sqLiteDatabase);
        //db.execSQL("DROP TABLE IF EXISTS USUARIOS");
        //onCreate(db);
    }

    public void openDB(){
        myDB=getWritableDatabase();
    }

    public void closeDB() {
        if (myDB != null && myDB.isOpen()) {
            myDB.close();
        }
    }

    public Cursor getAll(){
        String query="SELECT * FROM "+ Utilidades.TABLA;
        return myDB.rawQuery(query,null);
    }

    public long insert(String clave, String nombre, String sueldo){
        ContentValues cv = new ContentValues();

        cv.put(Utilidades.CLAVE,clave);
        cv.put(Utilidades.NOMBRE,nombre);
        cv.put(Utilidades.SUELDO,sueldo);

        return myDB.insert(Utilidades.TABLA,null,cv);
    }

    public ArrayList<Item> consulta() {
        ArrayList<Item> lista = new ArrayList<>();
        Cursor c = getAll();
        while (c.moveToNext()) {
            lista.add(new Item(c.getString(1), c.getString(2), c.getString(3)));
        }
        c.close();
        return lista;
    }

    public long update(String clave, String nombre, String sueldo){
        ContentValues cv=new ContentValues();

        cv.put(Utilidades.CLAVE,clave);
        cv.put(Utilidades.NOMBRE,nombre);
        cv.put(Utilidades.SUELDO,sueldo);

        return myDB.update(Utilidades.TABLA,cv,Utilidades.CLAVE+"="+clave,null);
    }

    public long delete(String clave){
        return myDB.delete(Utilidades.TABLA,Utilidades.CLAVE+"="+clave,null);
    }
}
