package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AkhirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhir);

        TextView tvData1 = (TextView) findViewById(R.id.textView11);

        if(getIntent().getExtras()!=null){
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            tvData1.setText(bundle.getString("data1"));
        }else{
            /**
             * Apabila Bundle tidak ada, ambil dari Intent
             */
            tvData1.setText(getIntent().getStringExtra("data1"));
        }
    }
}
