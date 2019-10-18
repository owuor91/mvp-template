package io.github.owuor91.template.di.activity;

import dagger.Subcomponent;
import io.github.owuor91.template.di.adapter.AdapterComponent;
import io.github.owuor91.template.di.fragment.FragmentComponent;
import io.github.owuor91.template.ui.activities.BaseActivity;

@ActivityScope @Subcomponent(modules = { ActivityModule.class })
public interface ActivityComponent {
  FragmentComponent.Builder fragmentBuilder();

  AdapterComponent.Builder adapterBuilder();

  void baseInject(BaseActivity baseActivity);

  @Subcomponent.Builder interface Builder {
    Builder activityModule(ActivityModule activityModule);

    ActivityComponent build();
  }
}
