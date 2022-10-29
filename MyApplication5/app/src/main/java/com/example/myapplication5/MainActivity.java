package com.example.myapplication5;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nametext = findViewById(R.id.name);
        EditText agetext = findViewById(R.id.age);
        Button go = findViewById(R.id.button);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name,age;
                name = nametext.getText().toString();
                age  = agetext.getText().toString();

                Intent intent = new Intent( MainActivity.this, secondactivity.class);
                intent.putExtra( "n", name);
                intent.putExtra("a", age);
                startActivity(intent);

            }
        });
    }
}