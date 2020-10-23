package com.example.medrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewRecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);
        DBHelper dbHelper = new DBHelper(this);
        dbHelper.open();
        dbHelper.createPatient();
        dbHelper.close();
        //i need to work with fragments here.
    }
}