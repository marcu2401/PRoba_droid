package com.example.intent_gyak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button gomb1 =findViewById(R.id.button1);
        EditText info1 =findViewById(R.id.edit1);

        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, NewActivity.class );

                i.putExtra("uzenet",info1.getText().toString());
                i.putExtra("key","value");



                startActivity(i);



            }
        });



    }
}