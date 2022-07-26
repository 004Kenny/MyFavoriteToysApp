package com.example.myfavoritetoys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ToyBox extends AppCompatActivity {

    TextView toysListTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_toys);
        toysListTextview = findViewById(R.id.toy_names);

        String[] toyNames = myToysClass.getToyNames();

        for (String tonnage : toyNames){
            toysListTextview.append(tonnage + "\n\n\n");
        }

    }
}