package com.example.mirea_first_app;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View v) {
        Button btn = findViewById(R.id.button);
        btn.setText("Hello!!!");
        ConstraintLayout back = findViewById(R.id.root);
        back.setBackgroundColor(Color.parseColor("#cccccc"));
    }
}
