package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    final String name = "Артём Кудашкин";
    TextView tvName, login, pass;

    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle arguments = getIntent().getExtras();

        tvName = (TextView) findViewById(R.id.textViewName);
        login = (TextView) findViewById(R.id.textViewLogin);
        pass = (TextView) findViewById(R.id.textViewPassword);

        exit = (Button) findViewById(R.id.buttonExit);

        tvName.setText(name);
        login.setText(arguments.getString("login"));
        pass.setText(arguments.getString("password"));

        exit.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.buttonLogin){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}