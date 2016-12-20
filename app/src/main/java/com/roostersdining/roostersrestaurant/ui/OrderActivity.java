package com.roostersdining.roostersrestaurant.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.roostersdining.roostersrestaurant.Constants;
import com.roostersdining.roostersrestaurant.R;
import com.roostersdining.roostersrestaurant.models.Order;

import butterknife.Bind;

public class OrderActivity extends AppCompatActivity {
    private DatabaseReference mOrderReference;
    private String mDatabaseSize;
    @Bind(R.id.orderInfoTextView) TextView mOrderInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        mOrderReference = FirebaseDatabase
                .getInstance()
                .getReference()
                .child(Constants.FIREBASE_CHILD_ORDER);    }

    public void saveOrderToFirebase(int orderNumber) {
        mOrderReference.push().setValue(orderNumber);
    }
}
