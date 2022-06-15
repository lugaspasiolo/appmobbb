package com.example.coffe_shop.Activity.Api;

import com.example.coffe_shop.Activity.Model.Login.Login;
import com.example.coffe_shop.Activity.Model.SignUp.SignUp;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("login.php")
    Call<Login> loginResponse(
      @Field("username") String username,
      @Field("password") String password
    );

    @FormUrlEncoded
    @POST("signup.php")
    Call<SignUp> signupResponse (
            @Field("nohp") int nohp,
            @Field("username") String username,
            @Field("password") String password
    );

}
