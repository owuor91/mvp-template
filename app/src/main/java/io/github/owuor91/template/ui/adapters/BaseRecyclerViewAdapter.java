package io.github.owuor91.template.ui.adapters;

import androidx.recyclerview.widget.RecyclerView;
import io.github.owuor91.template.di.activity.ActivityComponent;
import io.github.owuor91.template.di.adapter.AdapterComponent;


public abstract class BaseRecyclerViewAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
  private final ActivityComponent activityComponent;

  public BaseRecyclerViewAdapter(ActivityComponent activityComponent) {
    this.activityComponent = activityComponent;
  }

  protected AdapterComponent injector() {
    return activityComponent.adapterBuilder().build();
  }
}
