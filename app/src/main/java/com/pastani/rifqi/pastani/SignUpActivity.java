package com.pastani.rifqi.pastani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import butterknife.OnClick;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    @OnClick(R.id.SignUpButton)
    public void SignUpListener() {
        Log.d("Log", "Login attempt");
        Intent intent = new Intent(SignUpActivity.this,SignInActivity.class);
        startActivity(intent);
    }
}
