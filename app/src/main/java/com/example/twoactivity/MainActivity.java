package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText login, pass;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.editTextEmail);
        pass = (EditText) findViewById(R.id.editTextPassword);

        btn = (Button) findViewById(R.id.buttonLogin);

        btn.setOnClickListener(this);
    }


    public void onClick(View v) {
        if (v.getId() == R.id.buttonLogin){
            if (login.getText().toString().equals("Artem") && pass.getText().toString().equals("qwerty123")){
                Intent intent = new Intent(this, MainActivity2.class);
                String log = login.getText().toString();
                String pw = pass.getText().toString();
                intent.putExtra("login", log);
                intent.putExtra("password", pw);
                startActivity(intent);
            }
        }
    }

}
