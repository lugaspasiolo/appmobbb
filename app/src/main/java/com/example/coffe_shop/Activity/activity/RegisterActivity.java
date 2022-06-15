package com.example.coffe_shop.Activity.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coffe_shop.R;

public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void CREATE(View view) {
        Intent i = new Intent(RegisterActivity.this, complateprofile.class);
        startActivity(i);
    }
}