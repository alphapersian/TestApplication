package com.example.root.testapplication.calendarexample;

import android.view.View;

import com.example.root.testapplication.mvpimplimentation.Contract;

/**
 * Created by root on 7/22/17.
 */

public interface PresenterViewContractor {

    public interface ViewInterface {
        public void onFormSubmitted();
        public void onFormFailed();
        public void onUserNameWrongInput();
        public void onPasswordWrongInput();
        public void onWrongUserOrPassword();

    }

    public interface PresenterInterface extends BaseView<ViewInterface>{
        public void requestLogin();
    }

}
