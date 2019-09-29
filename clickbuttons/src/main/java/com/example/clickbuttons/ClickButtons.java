package com.example.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClickButtons extends AppCompatActivity {

    TextView Textview;
    Button btnOK;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        View.OnClickListener oclBtnOK = new View.OnClickListener(){
            public void onClick(View v){
                Textview.setText("Нажата кнопка ОК");
            }
        };

        View.OnClickListener oclBtnCancel = new View.OnClickListener(){
            public void onClick(View v){
                Textview.setText("Нажата кнопка Cancel");
            }
        };

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_buttons);

        Textview = (TextView) findViewById(R.id.Textview);
        btnOK = (Button) findViewById(R.id.btnOK);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnOK.setOnClickListener(oclBtnOK);
        btnCancel.setOnClickListener(oclBtnCancel);
    }
}
