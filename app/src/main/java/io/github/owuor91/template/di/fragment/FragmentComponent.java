package io.github.owuor91.template.di.fragment;

import dagger.Subcomponent;
import io.github.owuor91.template.ui.fragments.BaseFragment;

@Subcomponent(modules = FragmentModule.class) public interface FragmentComponent {

  void baseInject(BaseFragment baseFragment);
  @Subcomponent.Builder interface Builder{
    Builder fragmentModule(FragmentModule fragmentModule);
    FragmentComponent build();
  }
}
