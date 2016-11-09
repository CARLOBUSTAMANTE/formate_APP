package com.example.cbustamante.umb_app_form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
        final EditText etUsername = (EditText) findViewById(R.id.etUserName);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);
        Intent intent  = getIntent();
        String username  = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");
        String message  = username + " : Bienvenido a nuestros Programas de Formacion Académica";
        welcomeMessage.setText(message);
        etUsername.setText(username);
        etPassword.setText(password);

        final Button bExit = (Button) findViewById(R.id.btExit);
        bExit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                System.runFinalization();
                System.exit(0);
    }
        });
    }
}
