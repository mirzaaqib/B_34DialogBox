package com.pallefire.b_34dialogbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt,bt1,bt2,bt3,bt4;
    TextView tv,tv1;
    public void catchData(String date){
        tv.setText("SELECTED :"+date);
    }
    public void catchData1(String time) {


        tv1.setText("selected:" +time);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.bt1);
        bt1 = (Button) findViewById(R.id.bt2);
        bt2= (Button) findViewById(R.id.bt3);
        tv = (TextView) findViewById(R.id.tv3);
        tv1 = (TextView) findViewById(R.id.tv4);
        bt3 = (Button) findViewById(R.id.bt4);
        bt4 = (Button) findViewById(R.id.bt5);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomDialog myCustomDialog=new MyCustomDialog();
                myCustomDialog.show(getSupportFragmentManager(),null);

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyTimePicker myTimePicker=new MyTimePicker();
              myTimePicker.show(getSupportFragmentManager(),null);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatePicker myDatePicker=new MyDatePicker();
                myDatePicker.show(getSupportFragmentManager(),null);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyprogessDialog myprogessDialog=new MyprogessDialog();
                myprogessDialog.show(getSupportFragmentManager(),null);
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragment firstFragment=new FirstFragment();
                firstFragment.show(getSupportFragmentManager(),null);

            }
        });

    }
}
