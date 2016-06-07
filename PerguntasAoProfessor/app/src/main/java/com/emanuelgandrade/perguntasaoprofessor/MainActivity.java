package com.emanuelgandrade.perguntasaoprofessor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {

    private EditText etUsername, etName;
    private Button bLogout;

    private UserLocalStore userLocalStore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = (EditText)findViewById(R.id.etUsername);
        etName = (EditText)findViewById(R.id.etName);

        bLogout = (Button)findViewById(R.id.bLogout);

        bLogout.setOnClickListener(this);

        userLocalStore = new UserLocalStore(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (authenticate() == true) {
            displayUserDetails();
        }
    }

    private boolean authenticate() {
        return userLocalStore.getUserLoggedIn();

    }

    private void displayUserDetails() {
        User user = userLocalStore.getLoggedInUser();

        etUsername.setText(user.getUsername());
        etName.setText(user.getName());

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bLogout:
                userLocalStore.clearUserdata();
                userLocalStore.setUserLoggedIn(false);
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }
    }
}
