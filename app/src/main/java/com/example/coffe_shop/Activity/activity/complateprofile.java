package com.example.coffe_shop.Activity.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.coffe_shop.Activity.Api.ApiInterface;
import com.example.coffe_shop.Activity.Api.ApiServer;
import com.example.coffe_shop.Activity.Model.Login.Login;
import com.example.coffe_shop.Activity.Model.Login.LoginData;
import com.example.coffe_shop.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class complateprofile extends Activity {

    TextView usernamee, passwordd;
    Button btnlogin,btnsignup;
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complateprofile);

        usernamee= findViewById(R.id.username);
        passwordd = findViewById(R.id.pw);
        btnlogin = findViewById(R.id.btn2);
        btnsignup = findViewById(R.id.btn3);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = usernamee.getText().toString();
                password = passwordd.getText().toString();

                if (!username.equals("") && !password.equals("")){
                    login(username,password);
                }else {
                    Toast.makeText(complateprofile.this, "Masukkan Username dan password anda", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private void login(String username1, String Password1){
        apiInterface = ApiServer.getClient().create(ApiInterface.class);
        Call<Login> loginCall = apiInterface.loginResponse(username1,Password1);
        loginCall.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()){

                    sessionManager = new SessionManager(complateprofile.this);
                    LoginData loginData = response.body().getData();
                    sessionManager.createLoginSession(loginData);

                    Toast.makeText(complateprofile.this, "Berhasil Masuk", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(complateprofile.this,HomeActivity.class);
                    startActivity(intent);

                }else {
                    Toast.makeText(complateprofile.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                Toast.makeText(complateprofile.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

            }
        });

        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }

}
