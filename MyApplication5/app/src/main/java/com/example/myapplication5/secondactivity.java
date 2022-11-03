package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        TextView Nameplain = findViewById(R.id.Name);
        TextView Ageplain = findViewById(R.id.Age);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("n");
        String  age = bundle.getString("a");

        Nameplain.setText(name);
        Ageplain.setText(age);


    }
}