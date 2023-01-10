package com.example.intents;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Bundle extras=getIntent().getExtras();
                int sum=extras.getInt("ans");
        Toast.makeText(this, "the sum is"+sum, Toast.LENGTH_SHORT).show();
        TextView t1=(TextView)findViewById(R.id.v);
        t1.setText("The sum is:"+sum);

    }
}
