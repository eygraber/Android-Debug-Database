package com.amitshekhar.debug.encrypt.sqlite;

import android.content.Context;

import com.amitshekhar.sqlite.DBFactory;
import com.amitshekhar.sqlite.SQLiteDB;
import com.getkeepsafe.relinker.ReLinker;

import net.sqlcipher.database.SQLiteDatabase;

public class DebugDBEncryptFactory implements DBFactory {

    @Override
    public SQLiteDB create(final Context context, String path, String password) {
        SQLiteDatabase.loadLibs(context, new SQLiteDatabase.LibraryLoader() {
            @Override public void loadLibraries(String... libNames) {
                for (String libName : libNames) {
                    ReLinker.loadLibrary(context, libName);
                }
            }
        });
        return new DebugEncryptSQLiteDB(SQLiteDatabase.openOrCreateDatabase(path, password, null));
    }

}
