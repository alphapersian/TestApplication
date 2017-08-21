package com.example.root.testapplication.mvpimplimentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.root.testapplication.R;

public class MainActivity extends AppCompatActivity implements Contract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



    }

    @Override
    public void updateList() {

    }
}
