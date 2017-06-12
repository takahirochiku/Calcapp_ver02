package com.example.takahirochiku.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.takahirochiku.calcapp.R.id.editText1;
import static com.example.takahirochiku.calcapp.R.id.editText2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(editText1);
        mEditText2 = (EditText) findViewById(editText2);
        int result;
    }

    @Override

    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            result.setText(String.valueOf(editText1 + editText2));
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("VALUE1", result);
            startActivity(intent);
        }
    }
}
