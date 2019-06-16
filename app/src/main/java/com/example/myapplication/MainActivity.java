package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Lifecycle.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        Button button2 = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ScrollView.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        Button button3 = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, WebView.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        Button button4 = (Button)findViewById(R.id.button4);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, RatingBar.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        Button button5 = (Button)findViewById(R.id.button5);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SeekBar.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        Button button6 = (Button)findViewById(R.id.button6);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, CompoundButton.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        Button button7 = (Button)findViewById(R.id.button7);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Menus.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        Button button8 = (Button)findViewById(R.id.button8);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Spinner.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }
}
