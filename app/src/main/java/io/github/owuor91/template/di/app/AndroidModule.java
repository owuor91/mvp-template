package io.github.owuor91.template.di.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import dagger.Module;
import dagger.Provides;
import io.github.owuor91.domain.di.DIConstants;
import javax.inject.Named;

@Module public class AndroidModule {
  private final Context context;

  public AndroidModule(Context context) {
    this.context = context;
  }

  //@Provides @Named(DIConstants.APP) public Context provideContext() {
  //  return context;
  //}

  @Provides public SharedPreferences provideSharedPreferences(@Named(DIConstants.APP) Context context) {
    return context.getSharedPreferences("hacker_news_sharedprefs", Context.MODE_PRIVATE);
  }

  @Provides public Resources provideResources(@Named(DIConstants.APP) Context context) {
    return context.getResources();
  }
}
