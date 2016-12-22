package com.roostersdining.roostersrestaurant.ui;

import android.content.Intent;
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

    public String mServer;
    public String mTable;
    public String mMenuItem;
    public String mEggs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_option);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        mServer = intent.getStringExtra("server");
        mTable = intent.getStringExtra("table");
        mMenuItem = intent.getStringExtra("item");
        mEggs = intent.getStringExtra("eggs");

        mToastWW.setOnClickListener(this);
        mToastWhite.setOnClickListener(this);
        mToastSD.setOnClickListener(this);
        mToastEnglishMuffin.setOnClickListener(this);
        mToastBiscuit.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        if (v == mToastWW) {
            Intent intent = new Intent(ToastOptionActivity.this, MenuActivity.class);
            intent.putExtra("server", mServer);
            intent.putExtra("table", mTable);
            intent.putExtra("item", mMenuItem);
            intent.putExtra("eggs", mEggs);
            intent.putExtra("toast", "Whole Wheat Toast");

            startActivity(intent);

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
