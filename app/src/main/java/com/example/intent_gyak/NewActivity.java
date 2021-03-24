package com.example.intent_gyak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        TextView textnew=findViewById(R.id.textnew);

        Bundle extras =getIntent().getExtras();

        if(extras!=null){
            textnew.setText(extras.getString("uzenet")+" "+extras.getString("key"));

        }



    }
}