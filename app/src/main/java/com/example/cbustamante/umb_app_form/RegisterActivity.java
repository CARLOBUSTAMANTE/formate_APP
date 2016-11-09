package com.example.cbustamante.umb_app_form;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.cbustamante.umb_app_form.R.id.bLoguin;

public class RegisterActivity extends AppCompatActivity {
    String[] modalidad={"Modalidad", "Virtual", "Presencial"};
    String[] programa={"Programa Académico","Ing. Software", "Ing. Civil", "Medicina"};
    Spinner spMod, spProgram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        spMod = (Spinner) findViewById(R.id.spMod);
        spProgram  = (Spinner) findViewById(R.id.spProgram);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etUserName = (EditText) findViewById(R.id.etUserName);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etMail = (EditText) findViewById(R.id.etMail);
        final EditText etPhone = (EditText) findViewById(R.id.etPhone);
        final Button bRegister = (Button) findViewById(R.id.bRegister);
        cargamodalidades();
        cargaprogramas();
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = etName.getText().toString();
                final String username = etUserName.getText().toString();
                final String password = etPassword.getText().toString();
                final String email = etMail.getText().toString();
                final String phone = etPhone.getText().toString();
                Intent intent   = new Intent(RegisterActivity.this, RegisterAreaActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("username",username);
                intent.putExtra("password",password);
                intent.putExtra("email",email);
                intent.putExtra("phone",phone);
                RegisterActivity.this.startActivity(intent);
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
        public void cargamodalidades(){
            ArrayAdapter<String> adaptador1 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,modalidad);
            spMod.setAdapter(adaptador1);
        }
        public void cargaprogramas(){
            ArrayAdapter<String> adaptador2 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,programa);
            spProgram.setAdapter(adaptador2);
    }


}






