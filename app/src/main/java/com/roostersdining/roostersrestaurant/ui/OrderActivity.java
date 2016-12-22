package com.roostersdining.roostersrestaurant.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.roostersdining.roostersrestaurant.R;
import com.roostersdining.roostersrestaurant.models.BreakfastItem;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.breakfast) Button mBreakfastButton;
    @Bind(R.id.lunch) Button mLunchButton;
    @Bind(R.id.dinner) Button mDinnerButton;

    public String mServer;
    public String mTable;
    public ArrayList<BreakfastItem> mBreakfastItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        mServer = intent.getStringExtra("server");
        mTable = intent.getStringExtra("table");
        mBreakfastItems = Parcels.unwrap(getIntent().getParcelableExtra("itemArray"));

        mBreakfastButton.setOnClickListener(this);
        mLunchButton.setOnClickListener(this);
        mDinnerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mBreakfastButton) {
            Intent intent = new Intent(OrderActivity.this, BreakfastItemActivity.class);
            intent.putExtra("server", mServer);
            intent.putExtra("table", mTable);
            intent.putExtra("itemArray", Parcels.wrap(mBreakfastItems));
            startActivity(intent);
        } else if (v == mLunchButton) {
            Toast.makeText(OrderActivity.this, "Feature Coming Soon", Toast.LENGTH_LONG).show();
        } else if (v == mDinnerButton) {
            Toast.makeText(OrderActivity.this, "Feature Coming Soon", Toast.LENGTH_LONG).show();
        }
    }
}
