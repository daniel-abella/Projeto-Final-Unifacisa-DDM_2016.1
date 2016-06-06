package com.emanuelgandrade.perguntasaoprofessor;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by emanu on 06/06/2016.
 */
public class UserLocalStore {

    private static final String SP_NAME = "userDetails";
    private SharedPreferences userLocalDataBase;

    public UserLocalStore(Context context) {
        userLocalDataBase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeUserData(User user) {
        SharedPreferences.Editor spEditor = userLocalDataBase.edit();
        spEditor.putString("name", user.getName());
        spEditor.putString("mail", user.getMail());
        spEditor.putString("username", user.getUsername());
        spEditor.putString("password", user.getPassword());
        spEditor.commit();
    }

    public User getLoggedInUser() {
        String name = userLocalDataBase.getString("name", "");
        String mail = userLocalDataBase.getString("mail", "");
        String username = userLocalDataBase.getString("username", "");
        String password = userLocalDataBase.getString("password", "");;

        User storedUser = new User(name, mail, username, password);

        return storedUser;
    }

    public void setUserLoggedIn(boolean loggedIn) {
        SharedPreferences.Editor spEditor = userLocalDataBase.edit();
        spEditor.putBoolean("Loggedid", loggedIn);
        spEditor.commit();
    }

    public void clearUserdata() {
        SharedPreferences.Editor spEditor = userLocalDataBase.edit();
        spEditor.clear();
        spEditor.commit();
    }


}
