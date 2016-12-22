package com.roostersdining.roostersrestaurant.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.roostersdining.roostersrestaurant.R;
import com.roostersdining.roostersrestaurant.models.Order;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NewOrderActivity extends AppCompatActivity implements View.OnClickListener {
    private DatabaseReference mOrderReference;
    @Bind(R.id.enterButton) Button mEnterButton;
    @Bind(R.id.serverNameEditText) EditText mServerNameEditText;
    @Bind(R.id.tableNumberEditText) EditText mTableNumberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);
        ButterKnife.bind(this);

        mEnterButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mEnterButton) {
            String serverName = mServerNameEditText.getText().toString();
            String tableNumber = mTableNumberEditText.getText().toString();
            Intent intent = new Intent(NewOrderActivity.this, OrderActivity.class);
            intent.putExtra("server", serverName);
            intent.putExtra("table", tableNumber);
            startActivity(intent);
        }
    }
}
