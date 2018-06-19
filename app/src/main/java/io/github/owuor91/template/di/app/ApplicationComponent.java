package io.github.owuor91.template.di.app;

import dagger.Component;
import io.github.owuor91.template.MyApplication;
import io.github.owuor91.template.di.activity.ActivityComponent;
import javax.inject.Singleton;

/**
 * Created by johnowuor on 20/03/2018.
 */

@Singleton @Component(modules = ApplicationModule.class) public interface ApplicationComponent {
  ActivityComponent.Builder activityComponentBuilder();

  void inject(MyApplication myApplication);
}
