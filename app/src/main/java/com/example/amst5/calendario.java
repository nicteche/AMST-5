package com.example.amst5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

public class calendario extends AppCompatActivity {
 private CalendarView calendario;
 private TextView txtCalendario;
 private Button bttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        txtCalendario = (TextView) findViewById(R.id.textView4);
        calendario = (CalendarView) findViewById(R.id.calendarView);
        bttn = (Button) findViewById(R.id.button);

    }
    public void regresar(View view) {
        Intent intent2 = new Intent(this, MenuLogged.class);
        startActivity(intent2);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.button){
        }
    }
}