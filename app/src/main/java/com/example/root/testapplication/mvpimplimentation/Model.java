package com.example.root.testapplication.mvpimplimentation;

/**
 * Created by root on 7/17/17.
 */

public class Model {

    String name ;
    String age ;


    public Model(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
