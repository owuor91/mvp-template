package io.github.owuor91.presentation;

public interface BasePresenter {

  void dispose();

  interface View {
    void handleError(Throwable throwable);
  }
}
