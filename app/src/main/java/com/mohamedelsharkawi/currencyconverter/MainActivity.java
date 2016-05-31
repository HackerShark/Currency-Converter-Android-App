package com.mohamedelsharkawi.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollar = (EditText) findViewById(R.id.dollarField);

        Double currentPrice = Double.parseDouble(dollar.getText().toString());

        Double pound = currentPrice * 0.68;

        Toast.makeText(getApplicationContext(), pound.toString(), Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
