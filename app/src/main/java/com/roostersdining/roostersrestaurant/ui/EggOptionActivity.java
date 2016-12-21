package com.roostersdining.roostersrestaurant.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.roostersdining.roostersrestaurant.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class EggOptionActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.eggsOE) Button mEggsOE;
    @Bind(R.id.eggsOM) Button mEggsOM;
    @Bind(R.id.eggsOH) Button mEggsOH;
    @Bind(R.id.eggsScrambled) Button mEggsScrambled;
    @Bind(R.id.eggsPoached) Button mEggsPoached;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg_option);
        ButterKnife.bind(this);

        mEggsOE.setOnClickListener(this);
        mEggsOM.setOnClickListener(this);
        mEggsOH.setOnClickListener(this);
        mEggsScrambled.setOnClickListener(this);
        mEggsPoached.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mEggsOE) {
            Intent intent = new Intent(EggOptionActivity.this, ToastOptionActivity.class);
            startActivity(intent);
        }
        if (v == mEggsOM) {
            Intent intent = new Intent(EggOptionActivity.this, ToastOptionActivity.class);
            startActivity(intent);
        }
        if (v == mEggsOH) {
            Intent intent = new Intent(EggOptionActivity.this, ToastOptionActivity.class);
            startActivity(intent);
        }
        if (v == mEggsScrambled) {
            Intent intent = new Intent(EggOptionActivity.this, ToastOptionActivity.class);
            startActivity(intent);
        }
        if (v == mEggsPoached) {
            Intent intent = new Intent(EggOptionActivity.this, ToastOptionActivity.class);
            startActivity(intent);
        }
    }
}
