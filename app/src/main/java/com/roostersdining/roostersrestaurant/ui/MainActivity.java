package com.roostersdining.roostersrestaurant.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.roostersdining.roostersrestaurant.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.placeOrderButton) Button mPlaceOrderButton;
    @Bind(R.id.viewOrdersButton) Button mViewOrderButton;
    @Bind(R.id.tableMapButton) Button mTableMapButton;
    @Bind(R.id.waitingListButton) Button mWaitingListButton;
    @Bind(R.id.employeeDirectoryButton) Button mEmployeeDirectoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mPlaceOrderButton.setOnClickListener(this);
        mViewOrderButton.setOnClickListener(this);
        mTableMapButton.setOnClickListener(this);
        mWaitingListButton.setOnClickListener(this);
        mEmployeeDirectoryButton.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        if (v == mPlaceOrderButton) {
            Intent intent = new Intent(MainActivity.this, OrderActivity.class);
            startActivity(intent);
        } else if (v == mViewOrderButton) {
            Toast.makeText(MainActivity.this, "Feature Coming Soon", Toast.LENGTH_LONG).show();
        } else if (v == mTableMapButton) {
            Toast.makeText(MainActivity.this, "Feature Coming Soon", Toast.LENGTH_LONG).show();
        } else if (v == mWaitingListButton) {
            Toast.makeText(MainActivity.this, "Feature Coming Soon", Toast.LENGTH_LONG).show();
        } else if (v == mEmployeeDirectoryButton) {
            Toast.makeText(MainActivity.this, "Feature Coming Soon", Toast.LENGTH_LONG).show();
        }
    }
}
