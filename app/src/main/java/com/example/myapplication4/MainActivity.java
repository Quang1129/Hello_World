package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;



public class MainActivity extends AppCompatActivity {


    private TextView tvCount;
    private FloatingActionButton btn_add;
    private FloatingActionButton btn_minus;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tv_Count);
        btn_add = findViewById(R.id.btn_Add);
        btn_minus = findViewById(R.id.btn_Minus);



        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count = Integer.parseInt(tvCount.getText().toString());
                count++;
                tvCount.setText(""+  count);
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count = Integer.parseInt(tvCount.getText().toString());
                count--;
                tvCount.setText(String.valueOf(count));
            }
        });

    }
}