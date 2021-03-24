package com.androidapp.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    TextView mtextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button)findViewById(R.id.button1);
        mtextView1 = (TextView)findViewById(R.id.textView1);

        mButton1.setOnClickListener(new MyOnClickListener(this)); // 버너튼이 클릭이 되는지 감지해주는 리스너, this는 버튼이 있는 화면

    }
}