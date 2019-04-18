package com.idea.idc.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AlmostThereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this,VerifyActivity.class);
        startActivity(intent);
    }
}
