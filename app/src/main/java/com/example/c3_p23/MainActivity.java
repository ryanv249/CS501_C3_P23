package com.example.c3_p23;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button B;
    private TextView Label;
    private final int visible = 0xffff0000;
    private final int hidden = 0x00ff0000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);

        GridLayout layout = new GridLayout(this);
        layout.setColumnCount(2);
        layout.setRowCount(1);

        B = new Button(this);
        Label = new TextView(this);
        Label.setText("hello world!");
        Label.setTextColor(hidden);
        layout.addView(B, 0);
        layout.addView(Label, 1);

        setContentView(layout);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Label.getCurrentTextColor() == hidden){
                    Label.setTextColor(visible);
                }else {
                    Label.setTextColor(hidden);
                }
            }
        });


    }
}