package com.example.inttask1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityView extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        text=(TextView)findViewById(R.id.textView);
        text.setText("Hello.." + getIntent().getStringExtra("TEXT"));
    }
}
