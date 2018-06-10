package io.github.owuor91.data.di;

import dagger.Module;

/**
 * Created by johnowuor on 20/03/2018.
 */

@Module public class RepositoryModule {
  /*@Provides @Named(DIConstants.API) ItemRepository provideItemsApiRepository(ItemsApi itemsApi,
      @Named(DIConstants.DB) ItemRepository itemDbRepository) {
    return new ItemApiRepository(itemsApi, itemDbRepository);
  }

  @Provides @Named(DIConstants.DB) ItemRepository provideItemsDbRepository(ItemDao itemDao) {
    return new ItemDbRepository(itemDao);
  }*/
}
