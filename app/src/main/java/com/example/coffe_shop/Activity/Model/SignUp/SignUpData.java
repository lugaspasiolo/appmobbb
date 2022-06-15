package com.example.coffe_shop.Activity.Model.SignUp;
import com.google.gson.annotations.SerializedName;

public class SignUpData {

    @SerializedName("username")
    private String username;

    @SerializedName("nohp")
    private int nohp;

    public void setUsername(String  username){
        this.username = username;
    }

    public String  getUsername(){
        return username;
    }

    public void setNohp(int nohp){
        this.nohp = nohp;
    }

    public int getNohp(){
        return nohp;
    }

}
