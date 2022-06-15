package com.example.coffe_shop.Activity.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coffe_shop.R;

public class MenuActivity extends Activity {
    
    int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void NEXT(View view) {
        Intent i = new Intent(MenuActivity.this, CartActivity.class);
        startActivity(i);
    }
}