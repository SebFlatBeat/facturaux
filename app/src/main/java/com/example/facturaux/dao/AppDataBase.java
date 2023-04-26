package com.example.facturaux.dao;
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.facturaux.entity.Client;


@Database(entities = {Client.class}, version = 1,exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {
    public abstract ClientDao clientDao();

    private static AppDataBase INSTANCE;

    public static AppDataBase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDataBase.class, "myapp-database")
                    .build();
        }
        return INSTANCE;
    }
}

