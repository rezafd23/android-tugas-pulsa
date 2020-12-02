package com.example.android_tugas_pulsa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResponseActivity extends AppCompatActivity {

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.btn_back)
    AppCompatButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);
        ButterKnife.bind(this);
        onClick();
    }

    private void onClick(){
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResponseActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}