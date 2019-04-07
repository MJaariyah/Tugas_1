package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        final EditText etData1 = (EditText) findViewById(R.id.textView_nama);
        Button btSubmitIntent = (Button) findViewById(R.id.button2);

        btSubmitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BiodataActivity.this, AkhirActivity.class);
                intent.putExtra("data1", etData1.getText().toString());
                startActivity(intent);
            }
        });
    }
}
