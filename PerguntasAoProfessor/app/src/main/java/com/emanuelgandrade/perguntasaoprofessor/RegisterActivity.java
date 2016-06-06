package com.emanuelgandrade.perguntasaoprofessor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends Activity implements View.OnClickListener {

    private EditText etName, etMail, etUsername, etPassword1, etPassword2;
    private Button bRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText)findViewById(R.id.etName);
        etMail = (EditText)findViewById(R.id.etMail);
        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword1 = (EditText)findViewById(R.id.etPassword1);
        etPassword2 = (EditText)findViewById(R.id.etPassword2);
        bRegister = (Button)findViewById(R.id.bRegister);

        etName.setOnClickListener(this);
        etMail.setOnClickListener(this);
        etUsername.setOnClickListener(this);
        etPassword1.setOnClickListener(this);
        etPassword2.setOnClickListener(this);
        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bRegister:
                String name = etName.getText().toString();
                String mail = etMail.getText().toString();
                String username = etUsername.getText().toString();
                String password = etPassword1.getText().toString();
                User registeredData = new User(name,mail, username, password);
                break;
        }
    }
}
