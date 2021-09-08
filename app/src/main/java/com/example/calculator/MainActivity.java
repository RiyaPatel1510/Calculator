package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            buttonplus,buttonminus,buttonmultiply,buttondivide,buttonbackspace,buttonpercent,buttonclear,buttondot,buttonequal;
     private TextView t1,t2;
     private double first,second,result;
     private String operation;
     private String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t1=findViewById(R.id.textview1);
        t2=findViewById(R.id.textview2);

        button0=findViewById(R.id.button0);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        buttonpercent=findViewById(R.id.buttonpercent);
        buttonplus=findViewById(R.id.buttonplus);
        buttonmultiply=findViewById(R.id.buttonmultiply);
        buttonminus=findViewById(R.id.buttonminus);
        buttondivide=findViewById(R.id.buttondivide);
        buttonbackspace=findViewById(R.id.buttonbackspace);
        buttondot=findViewById(R.id.buttondot);
        buttonclear=findViewById(R.id.buttonclear);
        buttonequal=findViewById(R.id.buttonequal);


        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(null);
                t2.setText(null);
            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=t2.getText().toString()+button0.getText().toString();
                t2.setText(text);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=t2.getText().toString()+button1.getText().toString();
                t2.setText(text);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=t2.getText().toString()+button2.getText().toString();
                t2.setText(text);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=t2.getText().toString()+button3.getText().toString();
                t2.setText(text);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=t2.getText().toString()+button4.getText().toString();
                t2.setText(text);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=t2.getText().toString()+button5.getText().toString();
                t2.setText(text);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=t2.getText().toString()+button6.getText().toString();
                t2.setText(text);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=t2.getText().toString()+button7.getText().toString();
                t2.setText(text);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=t2.getText().toString()+button8.getText().toString();
                t2.setText(text);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=t2.getText().toString()+button9.getText().toString();
                t2.setText(text);
            }
        });

        buttonbackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String backspace=null;
                if(t2.getText().toString().length()>0)
                {
                    StringBuffer stringBuffer=new StringBuffer(t2.getText());
                    stringBuffer.deleteCharAt(t2.getText().length()-1);
                    backspace=stringBuffer.toString();
                    t2.setText(backspace);
                }
            }
        });


        // code for operator

        buttonpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) t2.getText());
                primary=String.format("%.2f",first);
                t1.setText(primary);
                t2.setText("");
                operation="%";
            }
        });

        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) t2.getText());
                primary=String.format("%.2f",first);
                t1.setText(primary);
                t2.setText("");
                operation="-";
            }
        });

        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) t2.getText());
                primary=String.format("%.2f",first);
                t1.setText(primary);
                t2.setText("");
                operation="+";
            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) t2.getText());
                primary=String.format("%.2f",first);
                t1.setText(primary);
                t2.setText("");
                operation="/";
            }
        });

        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) t2.getText());
                primary=String.format("%.2f",first);
                t1.setText(primary);
                t2.setText("");
                operation="*";
            }
        });

        //equal start from here

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second=Double.parseDouble((String)t2.getText());
                if(operation=="+")
                {
                    result=first+second;
                    answer=String.format("%.2f",result);
                    t2.setText(answer);
                    t1.setText(null);
                }
                if(operation=="+")
                {
                    result=first+second;
                    answer=String.format("%.2f",result);
                    t2.setText(answer);
                    t1.setText(null);
                }
                if(operation=="-")
                {
                    result=first-second;
                    answer=String.format("%.2f",result);
                    t2.setText(answer);
                    t1.setText(null);
                }
                if(operation=="*")
                {
                    result=first*second;
                    answer=String.format("%.2f",result);
                    t2.setText(answer);
                    t1.setText(null);
                }
                if(operation=="/")
                {
                    result=first/second;
                    answer=String.format("%.2f",result);
                    t2.setText(answer);
                    t1.setText(null);
                }
                if(operation=="%")
                {
                    result=first%second;
                    answer=String.format("%.2f",result);
                    t2.setText(answer);
                    t1.setText(null);
                }
            }
        });
    }
}