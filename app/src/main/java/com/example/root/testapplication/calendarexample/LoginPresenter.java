package com.example.root.testapplication.calendarexample;

/**
 * Created by root on 7/22/17.
 */

public class LoginPresenter implements PresenterViewContractor.PresenterInterface {

    PresenterViewContractor.ViewInterface viewInterface ;

    @Override
    public void requestLogin() {

    }

    @Override
    public void attachView(PresenterViewContractor.ViewInterface view) {
        this.viewInterface  = view;
    }

    @Override
    public void detachView() {
        viewInterface = null;
    }
}
