package com.example.convmilestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button buttonConvMilestoKm;
    Button buttonConvKmtoMiles;
    EditText miles;
    EditText km;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonConvMilestoKm = findViewById(R.id.button1);
        buttonConvKmtoMiles = findViewById(R.id.button2);
        buttonConvMilestoKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                miles=findViewById(R.id.EditviewMiles);
                km=findViewById(R.id.EditviewKm);

                double vMiles = Double.valueOf(miles.getText().toString());
                double vKm = vMiles/0.62137;
                DecimalFormat df=new DecimalFormat("##.##");
                km.setText(df.format(vKm));
            }
        });
        buttonConvKmtoMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                miles=findViewById(R.id.EditviewMiles);
                km=findViewById(R.id.EditviewKm);

                double vKm = Double.valueOf(km.getText().toString());
                double vMiles = vKm*0.62137;
                DecimalFormat df=new DecimalFormat("##.##");
                miles.setText(df.format(vMiles));
            }
        });
    }
}