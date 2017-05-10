package com.pastani.rifqi.pastani;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileActivity extends AppCompatActivity {

    @BindView(R.id.Username) TextView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);
        setContent();
    }

    private void setContent() {
        HashMap<String, Object> data = JSONRequest.getUserProfile();
        String username = data.get("username").toString();
        user.setText(username);
//        ((TextView) findViewById(R.id.Username)).setText(data.get("username").toString());

    }
}
