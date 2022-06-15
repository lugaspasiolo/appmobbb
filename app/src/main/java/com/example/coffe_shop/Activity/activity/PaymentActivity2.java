package com.example.coffe_shop.Activity.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coffe_shop.R;

public class PaymentActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment2);
    }

    public void Cod(View view) {
        Intent i = new Intent(PaymentActivity2.this, ThanksActivity.class);
        startActivity(i);
    }

    public void cek(View view) {
        Intent i = new Intent(PaymentActivity2.this, ThanksActivity.class);
        startActivity(i);
    }
}