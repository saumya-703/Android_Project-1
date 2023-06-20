package com.project.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText i1,i2;
    Button add,sub,mul,div;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        result=findViewById(R.id.result);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                a=Integer.parseInt(i1.getText().toString());
                b=Integer.parseInt(i2.getText().toString());
                c=a+b;
                result.setText("Result = "+c);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                a=Integer.parseInt(i1.getText().toString());
                b=Integer.parseInt(i2.getText().toString());
                c=a-b;
                result.setText("Result = "+c);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                a=Integer.parseInt(i1.getText().toString());
                b=Integer.parseInt(i2.getText().toString());
                c=a*b;
                result.setText("Result = "+c);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                a=Integer.parseInt(i1.getText().toString());
                b=Integer.parseInt(i2.getText().toString());
                c=a/b;
                result.setText("Result = "+c);
            }
        });
    }
}