package com.demo.demomvp;

/**
 * Created by ivandro on 3/23/18.
 */

public interface SayHelloContract {

    /*Mewakili tampilan dalam MVP*/
    interface View {
        void showMessage(String message);
        void showError(String error);
    }

    /*Mewakili presenter dalam MVP*/
    interface Presenter {
        void loadMessage();

        void saveName(String firstname, String lastName);
    }
}
