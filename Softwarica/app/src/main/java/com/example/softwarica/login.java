package com.example.softwarica;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText name,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name=findViewById(R.id.edittextusername);
        password=findViewById(R.id.edittextpassword);

        login=findViewById(R.id.buttonLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals("") || password.getText().toString().equals("")){
                    Toast.makeText(login.this,"Enter user name and password",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(name.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Intent intent=new Intent(login.this,MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(login.this,"loggged in",Toast.LENGTH_LONG).show();
                }

            }
        });

    }

}
