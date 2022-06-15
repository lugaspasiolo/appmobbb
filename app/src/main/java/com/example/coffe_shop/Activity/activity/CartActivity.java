package com.example.coffe_shop.Activity.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coffe_shop.R;

public class CartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }

    public void NEXT(View view) {
        Intent i = new Intent(CartActivity.this, PaymentActivity2.class);
        startActivity(i);
    }
}