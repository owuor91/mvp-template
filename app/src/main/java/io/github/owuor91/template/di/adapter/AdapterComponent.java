package io.github.owuor91.template.di.adapter;

import dagger.Subcomponent;

@Subcomponent(modules = { AdapterModule.class }) public interface AdapterComponent {

  @Subcomponent.Builder interface Builder {
    Builder adapterModule(AdapterModule adapterModule);

    AdapterComponent build();
  }
}
