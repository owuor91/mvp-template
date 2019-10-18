package io.github.owuor91.template.di.activity;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentManager;
import dagger.Module;
import dagger.Provides;
import io.github.owuor91.domain.di.DIConstants;
import io.github.owuor91.presentation.di.PresenterModule;
import io.github.owuor91.template.di.adapter.AdapterComponent;
import io.github.owuor91.template.ui.activities.BaseActivity;
import javax.inject.Named;

@Module(includes = PresenterModule.class, subcomponents = { AdapterComponent.class })
public class ActivityModule {
  private final BaseActivity baseActivity;
  public ActivityModule(BaseActivity baseActivity) {
    this.baseActivity = baseActivity;
  }

  @Provides @Named(DIConstants.ACTIVITY) public Context provideActivityContext() {
    return baseActivity;
  }

  @Provides public BaseActivity provideActivity() {
    return baseActivity;
  }

  @Provides public LayoutInflater provideLayoutInflater(@Named(DIConstants.ACTIVITY) Context context) {
    return LayoutInflater.from(context);
  }

  @Provides public FragmentManager provideFragmentManager(BaseActivity activity) {
    return activity.getSupportFragmentManager();
  }
}
