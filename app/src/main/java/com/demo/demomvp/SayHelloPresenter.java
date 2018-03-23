package com.demo.demomvp;

import com.demo.demomvp.model.Person;

/**
 * Created by ivandro on 3/23/18.
 */

public class SayHelloPresenter implements SayHelloContract.Presenter {

    private Person mPerson;
    private SayHelloContract.View mView;

    public SayHelloPresenter(SayHelloContract.View view){
        mPerson = new Person();
        mView = view;
    }

    @Override
    public void loadMessage() {
        if(mPerson.getmFirstName() == null && mPerson.getmLastName() == null){
            mView.showError("Tidak ada nama yang ditemukan.");

            return;
        }

        String message = "Hi " + mPerson.getName() + "!";
        mView.showMessage(message);
    }

    @Override
    public void saveName(String firstName, String lastName) {
        mPerson.setmFirstName(firstName);
        mPerson.setmLastName(lastName);
    }
}
