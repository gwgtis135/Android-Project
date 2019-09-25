package com.example.mynewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText idd,pww;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

         idd = findViewById(R.id.userid);
         pww = findViewById(R.id.userpw);

         btn = findViewById(R.id.btn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idd.getText().toString().equals("1234") && pww.getText().toString().equals("3333")){

                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(Main2Activity.this, "아이디 혹은 비번 입력 오류",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

        }

