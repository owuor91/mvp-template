package io.github.owuor91.data.sql;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by johnowuor on 22/03/2018.
 */

/*@Database(entities = { ItemDbModel.class, StoryDbModel.class }, version = 1)*/ public abstract class AppNameDatabase
    extends RoomDatabase {
  //public abstract ItemDao itemDao();
}
