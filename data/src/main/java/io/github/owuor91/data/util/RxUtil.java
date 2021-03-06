package io.github.owuor91.data.util;

import io.reactivex.disposables.CompositeDisposable;

public class RxUtil {
  public static CompositeDisposable initDisposables(CompositeDisposable compositeDisposable) {
    if (compositeDisposable == null || (compositeDisposable != null && compositeDisposable.isDisposed())) {
      return new CompositeDisposable();
    }

    return compositeDisposable;
  }

  public static void dispose(CompositeDisposable compositeDisposable) {
    if (compositeDisposable != null) {
      compositeDisposable.dispose();
    }
  }
}
