package com.example.lr29;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Sam extends AppCompatActivity {
    Button color;
    private boolean isGreenTheme = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sam);

        color = findViewById(R.id.color);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isGreenTheme){
                    setTheme(R.style.Base_Theme_Lr29);
                    isGreenTheme = false;
                }else{
                    setTheme(R.style.GreenTheme2);
                    isGreenTheme = true;
                }
                recreate();
            }
        });
    }

}
