package com.example.root.testapplication.mvpimplimentation;

/**
 * Created by root on 7/17/17.
 */

public interface Contract {
    public interface View{
        public void updateList();
    }
    public interface presenter {
        public void loadData();
    }
}
