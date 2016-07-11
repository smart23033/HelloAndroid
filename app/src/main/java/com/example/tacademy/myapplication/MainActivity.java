package com.example.tacademy.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.HttpURLConnection;

public class MainActivity extends AppCompatActivity {
    EditText inputView;
    TextView messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputView = (EditText)findViewById(R.id.edit_input);
        messageView = (TextView)findViewById(R.id.text_message);

        Button btn = (Button)findViewById(R.id.btn_send);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = inputView.getText().toString();
                messageView.setText(text);
            }
        });

        btn = (Button)findViewById(R.id.btn_toast);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.toast_message,Toast.LENGTH_LONG).show();
            }
        });

        btn = (Button)findViewById(R.id.btn_google);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.com"));

                startActivity(intent);
            }
        });

        btn = (Button)findViewById(R.id.btn_dial);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:010-1234-5678"));

                startActivity(intent);
            }
        });

        btn = (Button)findViewById(R.id.btn_my);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MyActivity.class);

                startActivity(intent);
            }
        });
    }
}