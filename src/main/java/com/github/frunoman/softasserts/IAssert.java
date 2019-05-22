package com.github.frunoman.softasserts;

public interface IAssert<T> {
  String getMessage();
  void doAssert();
  T getActual();
  T getExpected();
}
