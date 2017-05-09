package com.pastani.rifqi.pastani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    private static EditText username;
    private static EditText password;
    private static Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        LoginButton();
    }

    private void LoginButton() {
        username    = (EditText)findViewById(R.id.User);
        password    = (EditText)findViewById(R.id.Pass);
        loginButton = (Button)findViewById(R.id.LoginButton);

        loginButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ( username.getText().toString().equals("farmer") &&
                                password.getText().toString().equals("petani123"))
                        {
                            Toast.makeText(SignInActivity.this,"Username dan Password Benar",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SignInActivity.this,HomeActivity.class);
                            startActivity(intent);
                        }

                        else
                        {
                            Toast.makeText(getApplicationContext(), "Password atau Username Salah", Toast.LENGTH_SHORT).show();
                        }
                    }

                }
        );



    }
}
