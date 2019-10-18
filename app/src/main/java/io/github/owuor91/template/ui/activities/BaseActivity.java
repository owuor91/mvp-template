package io.github.owuor91.template.ui.activities;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import io.github.owuor91.data.util.RxUtil;
import io.github.owuor91.template.MyApplication;
import io.github.owuor91.template.di.activity.ActivityComponent;
import io.reactivex.disposables.CompositeDisposable;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class BaseActivity extends AppCompatActivity{
  protected CompositeDisposable compositeDisposable;

  @Override public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    injector().baseInject(this);
  }

  public ActivityComponent injector(){
    return ((MyApplication) getApplicationContext()).getActivityInjector(this);
  }

  public void handleError(Throwable throwable) {
    Toast.makeText(getBaseContext(), throwable.getMessage(),Toast.LENGTH_LONG).show();
  }

  @Override protected void onStart() {
    super.onStart();
    compositeDisposable = RxUtil.initDisposables(compositeDisposable);
  }

  @Override protected void attachBaseContext(Context base) {
    super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
  }

  protected void dispose() {
    RxUtil.dispose(compositeDisposable);
  }
}
