package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BtnClick (View view) {
        TextView NtxtHello = findViewById(R.id.txtHello);
        EditText edtTxtName = findViewById(R.id.Name);
        NtxtHello.setText("Hello " + edtTxtName.getText().toString());
    }
}