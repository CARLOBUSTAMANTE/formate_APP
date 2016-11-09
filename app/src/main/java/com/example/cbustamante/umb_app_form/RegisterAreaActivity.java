package com.example.cbustamante.umb_app_form;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.cbustamante.umb_app_form.R.id.activity_register_area;
import static com.example.cbustamante.umb_app_form.R.id.etMail;

public class RegisterAreaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_area);
        final TextView etName = (TextView) findViewById(R.id.etName);
        final TextView etUserName = (TextView) findViewById(R.id.etUserName);
        final TextView etPassword = (TextView) findViewById(R.id.etPassword);
        final TextView etMail = (TextView) findViewById(R.id.etMail);
        final TextView etPhone = (TextView) findViewById(R.id.etPhone);
        Intent intent = getIntent();
        String name  = intent.getStringExtra("name");
        String username  = intent.getStringExtra("username");
        String password  = intent.getStringExtra("password");
        String email  = intent.getStringExtra("email");
        String phone  = intent.getStringExtra("phone");
        etName.setText(name);
        etUserName.setText(username);
        etPassword.setText(password);
        etMail.setText(email);
        etPhone.setText(phone);

        final Button bExit = (Button) findViewById(R.id.btExit);
        bExit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
           /* Intent intent = new Intent(Intent.ACTION_MAIN);
            /*intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);*/
            /*startActivity(intent);*/
            finish();
            /*    System.runFinalization();*
                System.exit(0);
                /*RegisterActivity.this.finish();*/

            }
        });

    }
}
