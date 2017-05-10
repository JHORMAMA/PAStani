package com.pastani.rifqi.pastani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @OnClick(R.id.profile_button)
    public void profileListener() {
        Log.d("Log", "Login attempt");
            Intent intent = new Intent(HomeActivity.this,ProfileActivity.class);
            startActivity(intent);
        }
}
