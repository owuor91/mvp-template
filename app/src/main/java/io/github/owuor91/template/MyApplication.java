package io.github.owuor91.template;

import android.app.Application;
import com.crashlytics.android.Crashlytics;
import com.facebook.stetho.Stetho;
import io.fabric.sdk.android.Fabric;
import io.github.owuor91.domain.Constants;
import io.github.owuor91.template.di.activity.ActivityComponent;
import io.github.owuor91.template.di.activity.ActivityModule;
import io.github.owuor91.template.di.app.AndroidModule;
import io.github.owuor91.template.di.app.ApplicationComponent;
import io.github.owuor91.template.di.app.ApplicationModule;
import io.github.owuor91.template.di.app.DaggerApplicationComponent;
import io.github.owuor91.template.ui.activities.BaseActivity;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class MyApplication extends Application {
  private ApplicationComponent applicationComponent;

  @Override public void onCreate() {
    super.onCreate();
    applicationComponent = DaggerApplicationComponent.builder()
        .applicationModule(new ApplicationModule(this))
        .androidModule(new AndroidModule(this))
        .build();
    applicationComponent.inject(this);

    Stetho.initializeWithDefaults(this);

    CalligraphyConfig.initDefault(new CalligraphyConfig.Builder().setDefaultFontPath(Constants.CUSTOM_FONT_ASSET_PATH)
        .setFontAttrId(R.attr.fontPath)
        .build());

    Fabric.with(this, new Crashlytics());
  }

  public ActivityComponent getActivityInjector(BaseActivity baseActivity) {
    return applicationComponent.activityComponentBuilder().activityModule(new ActivityModule(baseActivity)).build();
  }
}
