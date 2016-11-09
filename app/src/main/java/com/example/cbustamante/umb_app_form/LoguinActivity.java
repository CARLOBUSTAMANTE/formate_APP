package com.example.cbustamante.umb_app_form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.cbustamante.umb_app_form.R.id.etPassword;

public class LoguinActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loguin);
        final EditText etUsername = (EditText) findViewById(R.id.etUserName);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bLoguin = (Button) findViewById(R.id.bLoguin);
        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere);
        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View v){
                Intent registerIntent = new Intent(LoguinActivity.this, RegisterActivity.class);
                LoguinActivity.this.startActivity(registerIntent);
           }
        });

        bLoguin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();
                Intent intent   = new Intent(LoguinActivity.this, UserAreaActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("password",password);
                LoguinActivity.this.startActivity(intent);

            }
        });
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
