package com.roostersdining.roostersrestaurant.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.roostersdining.roostersrestaurant.R;
import com.roostersdining.roostersrestaurant.models.BreakfastItem;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ToastOptionActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.toastWW) Button mToastWW;
    @Bind(R.id.toastWhite) Button mToastWhite;
    @Bind(R.id.toastSD) Button mToastSD;
    @Bind(R.id.toastEnglishMuffin) Button mToastEnglishMuffin;
    @Bind(R.id.toastBiscuit) Button mToastBiscuit;

    public ArrayList<BreakfastItem> mBreakfastItems = new ArrayList<>();
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
        mBreakfastItems = Parcels.unwrap(getIntent().getParcelableExtra("itemArray"));

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
            intent.putExtra("itemArray", Parcels.wrap(mBreakfastItems));
            intent.putExtra("toast", "Whole Wheat Toast");
            startActivity(intent);
        }
        if (v == mToastWhite) {
            Intent intent = new Intent(ToastOptionActivity.this, MenuActivity.class);
            intent.putExtra("server", mServer);
            intent.putExtra("table", mTable);
            intent.putExtra("item", mMenuItem);
            intent.putExtra("eggs", mEggs);
            intent.putExtra("itemArray", Parcels.wrap(mBreakfastItems));
            intent.putExtra("toast", "White Toast");
            startActivity(intent);
        }
        if (v == mToastSD) {
            Intent intent = new Intent(ToastOptionActivity.this, MenuActivity.class);
            intent.putExtra("server", mServer);
            intent.putExtra("table", mTable);
            intent.putExtra("item", mMenuItem);
            intent.putExtra("eggs", mEggs);
            intent.putExtra("itemArray", Parcels.wrap(mBreakfastItems));
            intent.putExtra("toast", "Sourdough Toast");
            startActivity(intent);
        }
        if (v == mToastEnglishMuffin) {
            Intent intent = new Intent(ToastOptionActivity.this, MenuActivity.class);
            intent.putExtra("server", mServer);
            intent.putExtra("table", mTable);
            intent.putExtra("item", mMenuItem);
            intent.putExtra("eggs", mEggs);
            intent.putExtra("itemArray", Parcels.wrap(mBreakfastItems));
            intent.putExtra("toast", "English Muffin");
            startActivity(intent);
        }
        if (v == mToastBiscuit) {
            Intent intent = new Intent(ToastOptionActivity.this, MenuActivity.class);
            intent.putExtra("server", mServer);
            intent.putExtra("table", mTable);
            intent.putExtra("item", mMenuItem);
            intent.putExtra("eggs", mEggs);
            intent.putExtra("itemArray", Parcels.wrap(mBreakfastItems));
            intent.putExtra("toast", "Biscuit");
            startActivity(intent);
        }
    }
}
