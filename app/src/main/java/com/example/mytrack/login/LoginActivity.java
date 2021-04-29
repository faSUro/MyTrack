package com.example.mytrack.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mytrack.R;

public class LoginActivity extends AppCompatActivity {

    private EditText eUsername;
    private EditText ePassword;
    private Button eLogin;
    private Button eRegister;

    public LoginActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eUsername = findViewById(R.id.etUsername);
        ePassword = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);
        eRegister = findViewById(R.id.btnRegister);

        eLogin.setOnClickListener(v -> {
            if (areValidCredentials()) {
                if (isConfirmedEmail()) {
                    if (isFirstLogin())
                        System.out.println("a"); //TODO: goes to first login activity
                    else
                        System.out.println("b"); //TODO: goes to main activity
                } else
                    Toast.makeText(LoginActivity.this, R.string.confirm_email, Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(LoginActivity.this, R.string.wrong_credentials, Toast.LENGTH_SHORT).show();
        });

        eRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFreeEmail()) {
                    registerNewUser();
                    Toast.makeText(LoginActivity.this, R.string.registration_confirmed, Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(LoginActivity.this, R.string.email_taken, Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * This method registers (in database) the new user.
     */
    private void registerNewUser() {
        //TODO
    }

    /**
     * This method checks (in database) whether the email entered is free or not.
     */
    private boolean isFreeEmail() {
        //TODO
        return true;
    }

    /**
     * This method checks (in database) whether this is the first login or not.
     */
    private boolean isFirstLogin() {
        //TODO
        return true;
    }

    /**
     * This method checks (in database) whether the email has been confirmed or not.
     */
    private boolean isConfirmedEmail() {
        //TODO
        return true;
    }

    /**
     * This method checks (in database) whether the credentials are valid or not.
     */
    private boolean areValidCredentials() {
        //TODO
        return true;
    }
}