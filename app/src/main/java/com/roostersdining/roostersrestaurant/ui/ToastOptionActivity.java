package com.roostersdining.roostersrestaurant.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.roostersdining.roostersrestaurant.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ToastOptionActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.toastWW) Button mToastWW;
    @Bind(R.id.toastWhite) Button mToastWhite;
    @Bind(R.id.toastSD) Button mToastSD;
    @Bind(R.id.toastEnglishMuffin) Button mToastEnglishMuffin;
    @Bind(R.id.toastBiscuit) Button mToastBiscuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_option);
        ButterKnife.bind(this);

        mToastWW.setOnClickListener(this);
        mToastWhite.setOnClickListener(this);
        mToastSD.setOnClickListener(this);
        mToastEnglishMuffin.setOnClickListener(this);
        mToastBiscuit.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        if (v == mToastWW) {

        }
        if (v == mToastWhite) {

        }
        if (v == mToastSD) {

        }
        if (v == mToastEnglishMuffin) {

        }
        if (v == mToastBiscuit) {

        }
    }
}
