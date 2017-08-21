package com.example.root.testapplication.calendarexample;

/**
 * Created by root on 7/22/17.
 */

public interface BaseView<T> {
    public void attachView(T view);
    public void detachView();
}
