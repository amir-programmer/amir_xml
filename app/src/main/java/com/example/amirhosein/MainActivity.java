package com.example.amirhosein;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CustomLayout layout=new CustomLayout(getApplicationContext());
        setContentView(layout);

        TextView text=findViewById(R.id.txt1);
    }
}