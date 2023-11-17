package hn.uth.ejercicio24;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import hn.uth.ejercicio24.Transacciones.Transacciones;

import hn.uth.ejercicio24.Transacciones.Transacciones;

public class SQLiteConexion extends SQLiteOpenHelper  {

    public SQLiteConexion(Context context, String bddname, SQLiteDatabase.CursorFactory factory, int version){
        super(context, bddname, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Transacciones.CreateTableFirmas);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Transacciones.DropTableFirmas);
        onCreate(db);
    }
}
