package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.helloButton);
        final TextView text = findViewById(R.id.helloworld);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //button.setText("Button has been pressed");
                text.setText("Hello World!");
            }
        });
    }
}