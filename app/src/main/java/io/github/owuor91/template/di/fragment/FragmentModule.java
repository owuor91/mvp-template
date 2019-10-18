package io.github.owuor91.template.di.fragment;

import dagger.Module;
import io.github.owuor91.template.ui.fragments.BaseFragment;

@Module public class FragmentModule {
  private BaseFragment baseFragment;

  public FragmentModule(BaseFragment baseFragment) {
    this.baseFragment = baseFragment;
  }
}
