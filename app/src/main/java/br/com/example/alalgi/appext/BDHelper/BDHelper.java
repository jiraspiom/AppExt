package br.com.example.alalgi.appext.BDHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Gilmar on 19/07/2016.
 */
public class BDHelper extends SQLiteOpenHelper {
    private static final String DB_NOME = meubanco;
    private static final int BD_VERSAO = 1;

    public BDHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NOME, null, BD_VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
