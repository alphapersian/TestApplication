package com.example.root.testapplication.calendarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.root.testapplication.R;
import com.example.root.testapplication.mvpimplimentation.Contract;

public class Main3Activity extends AppCompatActivity implements PresenterViewContractor.ViewInterface ,View.OnClickListener{

    private PresenterViewContractor.PresenterInterface presenterInterface;
    private EditText userNameEdt ;
    private EditText passwordEdt ;
    private Button login;
    private ProgressBar progressBar;
    private TextView usernameErr, passErr, networkErr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        presenterInterface = new LoginPresenter();
        presenterInterface.attachView(this);
        loadView();
    }

    public void loadView(){
        userNameEdt = (EditText) findViewById(R.id.editText);
        passwordEdt = (EditText) findViewById(R.id.editText2);
        login = (Button) findViewById(R.id.button);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        usernameErr = (TextView) findViewById(R.id.textView);
        passErr = (TextView) findViewById(R.id.textView2);
        networkErr = (TextView) findViewById(R.id.textView3);
        login.setOnClickListener(this);
    }

    @Override
    public void onFormSubmitted() {
        progressBar.setVisibility(View.GONE);
        Toast.makeText(this, "move to next activty", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFormFailed() {
        networkErr.setVisibility(View.VISIBLE);
        networkErr.setText("networkError");
    }

    @Override
    public void onUserNameWrongInput() {

    }

    @Override
    public void onPasswordWrongInput() {

    }

    @Override
    public void onWrongUserOrPassword() {

    }


    @Override
    public void onClick(View view) {
        progressBar.setVisibility(View.VISIBLE);
        presenterInterface.requestLogin();
    }
}
