package com.demo.demomvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SayHelloContract.View, View.OnClickListener {

    private SayHelloContract.Presenter mPresenter;

    // UI Properties
    private TextView mMessageView;
    private EditText mFirstnameView;
    private EditText mLastnameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        mPresenter = new SayHelloPresenter(this);
    }

    private void initViews() {

        mMessageView = (TextView) findViewById(R.id.showMessage);
        mFirstnameView = (EditText) findViewById(R.id.firstName);
        mLastnameView = (EditText) findViewById(R.id.lastName);

        findViewById(R.id.update).setOnClickListener(this);
        findViewById(R.id.showMessage).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.update:
                mPresenter.saveName(mFirstnameView.getText().toString(),
                        mLastnameView.getText().toString());
                break;
            case R.id.showMessage:
                mPresenter.loadMessage();
                break;
        }
    }

    @Override
    public void showMessage(String message) {
        mMessageView.setText(message);
    }

    @Override
    public void showError(String error) {

        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_LONG).show();
    }
}
