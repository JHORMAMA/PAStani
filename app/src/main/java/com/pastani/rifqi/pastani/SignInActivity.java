package com.pastani.rifqi.pastani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignInActivity extends AppCompatActivity {

    @BindView(R.id.User) EditText username;
    @BindView(R.id.Pass) EditText password;

    @OnClick(R.id.LoginButton)
    public void loginListener() {
        Log.d("Log", "Login attempt");
        if (JSONRequest.login(username.getText().toString(), password.getText().toString()))
        {
            Log.d("Log", "Login correct");
            Toast.makeText(SignInActivity.this,"Username dan Password Benar",
                    Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignInActivity.this,ProfileActivity.class);
            startActivity(intent);
        }
        else
        {
            Log.d("Log", "Login incorrect");
            Toast.makeText(getApplicationContext(), "Password atau Username Salah", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        ButterKnife.bind(this);
        Log.d("Log", username.getText().toString());
    }
}
