package com.roostersdining.roostersrestaurant.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.roostersdining.roostersrestaurant.Constants;
import com.roostersdining.roostersrestaurant.R;
import com.roostersdining.roostersrestaurant.models.BreakfastItem;
import com.roostersdining.roostersrestaurant.models.Order;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener {
    private DatabaseReference mOrderReference;
    @Bind(R.id.breakfast) Button mBreakfastButton;
    @Bind(R.id.lunch) Button mLunchButton;
    @Bind(R.id.dinner) Button mDinnerButton;
    @Bind(R.id.serverNameEditText) EditText mServerNameEditText;
    @Bind(R.id.tableNumberEditText) EditText mTableNumberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ButterKnife.bind(this);

        mBreakfastButton.setOnClickListener(this);
        mLunchButton.setOnClickListener(this);
        mDinnerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mBreakfastButton) {
            String serverName = mServerNameEditText.getText().toString();
            String tableNumber = mTableNumberEditText.getText().toString();
//            ArrayList<BreakfastItem> newOrder = new ArrayList<>();
//            Order order = new Order(serverName, tableNumber, newOrder);
//
//            DatabaseReference restaurantRef = FirebaseDatabase
//                    .getInstance()
//                    .getReference()
//                    .child(Constants.FIREBASE_CHILD_ORDER)
//                    .push();
//            restaurantRef.child("server").setValue(serverName);
//            restaurantRef.child("table").setValue(tableNumber);
            Intent intent = new Intent(OrderActivity.this, BreakfastItemActivity.class);
            intent.putExtra("server", serverName);
            intent.putExtra("table", tableNumber);
//            intent.putExtra("order", Parcels.wrap(order));
            startActivity(intent);
        } else if (v == mLunchButton) {
            Toast.makeText(OrderActivity.this, "Feature Coming Soon", Toast.LENGTH_LONG).show();
        } else if (v == mDinnerButton) {
            Toast.makeText(OrderActivity.this, "Feature Coming Soon", Toast.LENGTH_LONG).show();
        }
    }
}
