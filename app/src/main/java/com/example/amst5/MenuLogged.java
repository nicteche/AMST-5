package com.example.amst5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MenuLogged extends AppCompatActivity {
    private ImageButton imageButton, imageButton2, imageButton3, imageButton4;
    private TextView    textView, textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_logged);
//Referencias a los controles
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
    }
    public void calendario(View view) {
        Intent intent2 = new Intent(this, calendario.class);
        startActivity(intent2);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.imageButton){
        }
    }
}
