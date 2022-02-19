package com.techpro.pdfbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView Btn_annual2020, Btn_annual2021, Btn_quater2022;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn_annual2020 = findViewById(R.id.annual2020);
        Btn_annual2021 = findViewById(R.id.annual2021);
        Btn_quater2022 = findViewById(R.id.quater2022);

        Btn_annual2020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Annual2020pdf_Activity.class));
            }
        });

        Btn_annual2021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Annual2021pdf_Activity.class));
            }
        });

        Btn_quater2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, quater2022pdf_Activity.class));
            }
        });




    }
}