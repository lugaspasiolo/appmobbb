package com.example.coffe_shop.Activity.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.coffe_shop.Activity.Model.Login.LoginData;

import java.util.HashMap;

public class SessionManager {

    private Context _context;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private static final String IsLoggedIn = "isLoggedIn";
    private static final String nohp = "nohp";
    private static final String username = "username";

    public SessionManager(Context context){
        this._context = context;
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        editor = sharedPreferences.edit();
    }

    public void createLoginSession(LoginData user){
        editor.putBoolean(IsLoggedIn,true);
        editor.putInt(nohp,user.getNohp());
        editor.putString(username,user.getUsername());
    }

    public HashMap<String,String > getUserDetail(){
        HashMap<String ,String > user = new HashMap<>();
        user.put(nohp,sharedPreferences.getString(nohp,null));
        user.put(username,sharedPreferences.getString(username,null));
        return user;
    }

    public void logOutSession(){
        editor.clear();
        editor.commit();
    }

    public boolean isLoggedin(){
        return sharedPreferences.getBoolean(IsLoggedIn,false);
    }

}
