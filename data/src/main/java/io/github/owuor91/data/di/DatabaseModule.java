package io.github.owuor91.data.di;

import dagger.Module;

@Module public class DatabaseModule {
  /*@Provides public AppNameDatabase provideHackerNewsDatabase(@Named(DIConstants.APP) Context context) {
    return Room.databaseBuilder(context, AppNameDatabase.class, "hackernews_db").build();
  }

  @Provides public ItemDao provideItemDao(AppNameDatabase hackerNewsDatabase) {
    return hackerNewsDatabase.itemDao();
  }*/
}
