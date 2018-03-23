package com.demo.demomvp.model;

/**
 * Created by ivandro on 3/23/18.
 */

public class Person {
    private String mFirstName;
    private String mLastName;

    public Person(){

    }

    public Person (String mFirstName, String mLastName){
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public String getName(){
        return mFirstName + " " + mLastName;
    }
}
