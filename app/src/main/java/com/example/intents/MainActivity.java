package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =(Button) findViewById(R.id.submit);
        Intent intent=new Intent(this,MainActivity2.class);
        EditText e1=(EditText) findViewById(R.id.num1);
        EditText e2=(EditText) findViewById(R.id.num2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sum=Integer.parseInt(e1.getText().toString())+Integer.parseInt(e2.getText().toString());
           intent.putExtra("ans",sum);startActivity(intent);
        }});


    }
}