package com.example.coffe_shop.Activity.Model.SignUp;
import com.example.coffe_shop.Activity.Model.Login.LoginData;
import com.google.gson.annotations.SerializedName;

public class SignUp {

    @SerializedName("data")
    private SignUpData signUpData;

    @SerializedName("message")
    private String message;

    @SerializedName("status")
    private Boolean status;

    public void setData(SignUpData signUpData){
        this.signUpData = signUpData;
    }

    public SignUpData getData(){
        return signUpData;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean isStatus(){
        return status;
    }
}
