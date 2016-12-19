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
    @Bind(R.id.placeOrderButton) Button placeOrderButton;
    @Bind(R.id.viewOrdersButton) Button viewOrderButton;
    @Bind(R.id.tableMapButton) Button tableMapButton;
    @Bind(R.id.waitingListButton) Button waitingListButton;
    @Bind(R.id.employeeDirectoryButton) Button employeeDirectoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        placeOrderButton.setOnClickListener(this);
        viewOrderButton.setOnClickListener(this);
        tableMapButton.setOnClickListener(this);
        waitingListButton.setOnClickListener(this);
        employeeDirectoryButton.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        if (v == placeOrderButton) {
            Intent intent = new Intent(MainActivity.this, OrderActivity.class);
            startActivity(intent);
        } else if (v == viewOrderButton) {
            Toast.makeText(MainActivity.this, "Feature Coming Soon", Toast.LENGTH_LONG).show();
        } else if (v == tableMapButton) {
            Toast.makeText(MainActivity.this, "Feature Coming Soon", Toast.LENGTH_LONG).show();
        } else if (v == waitingListButton) {
            Toast.makeText(MainActivity.this, "Feature Coming Soon", Toast.LENGTH_LONG).show();
        } else if (v == employeeDirectoryButton) {
            Toast.makeText(MainActivity.this, "Feature Coming Soon", Toast.LENGTH_LONG).show();
        }
    }
}
