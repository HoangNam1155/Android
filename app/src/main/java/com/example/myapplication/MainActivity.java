package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText soA,soB,soC;
    TextView Delta,KetQua,nghiem1,nghiem2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soA=(EditText) findViewById(R.id.nhapA);
        soB=(EditText) findViewById(R.id.nhapB);
        soC=(EditText) findViewById(R.id.nhapC);
        Delta=(TextView)findViewById(R.id.delta);
        KetQua=(TextView)findViewById(R.id.kq);
        nghiem1=(TextView)findViewById(R.id.nghiem1);
        nghiem2=(TextView)findViewById(R.id.nghiem2);
    }
    @SuppressLint("SetTextI18n")
    public void solve (View view)
    {
        Delta.setText("");
        KetQua.setText("");
        nghiem1.setText("");
        nghiem2.setText("");
       int a,b,c;
       double X1,X2;
       int delta;
       a=Integer.parseInt(soA.getText().toString());
       b=Integer.parseInt(soB.getText().toString());
       c=Integer.parseInt(soC.getText().toString());
       delta=b*b-(4*a*c);
       if(delta>0)
       {
           Delta.setText("Delta= "+delta);
           KetQua.setText("Phương trình có hai nghiệm phân biệt");
           X1=(-b+Math.sqrt(delta))/(2*a);
           X2=(-b-Math.sqrt(delta))/(2*a);
           nghiem1.setText("X1= "+X1);
           nghiem2.setText("X2= "+X2);
       }
       else if(delta==0)
       {
           Delta.setText("Delta= "+delta);
           KetQua.setText("Phương trình có một nghiệm kép");
           X1=-b/(2*a);
           nghiem1.setText("X1=X2= "+X1);
       }
       else if(delta<0)
       {
           Delta.setText("Delta= "+delta);
           KetQua.setText("Phương trình có một nghiệm kép");
       }
    }
}
