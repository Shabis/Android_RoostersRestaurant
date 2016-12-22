package com.roostersdining.roostersrestaurant.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.roostersdining.roostersrestaurant.Constants;
import com.roostersdining.roostersrestaurant.R;
import com.roostersdining.roostersrestaurant.models.BreakfastItem;
import com.roostersdining.roostersrestaurant.models.Order;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.newItem) Button mNewItem;
    @Bind(R.id.finishOrder) Button mFinishOrder;

    public String mServer;
    public String mTable;
    public String mMenuItem;
    public String mEggs;
    public String mToast;
    public ArrayList<BreakfastItem> mBreakfastItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        mServer = intent.getStringExtra("server");
        mTable = intent.getStringExtra("table");
        mMenuItem = intent.getStringExtra("item");
        mEggs = intent.getStringExtra("eggs");
        mToast = intent.getStringExtra("toast");

        BreakfastItem breakfastItem = new BreakfastItem(mMenuItem, mEggs, mToast);
        mBreakfastItems.add(breakfastItem);


        mNewItem.setOnClickListener(this);
        mFinishOrder.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mNewItem) {
            Intent intent = new Intent(MenuActivity.this, OrderActivity.class);
            intent.putExtra("server", mServer);
            intent.putExtra("table", mTable);
            intent.putExtra("itemArray", Parcels.wrap(mBreakfastItems));
            startActivity(intent);
        }
        if (v == mFinishOrder) {
            Order newOrder = new Order(mServer, mTable, mBreakfastItems);

            DatabaseReference restaurantRef = FirebaseDatabase
                    .getInstance()
                    .getReference()
                    .child(Constants.FIREBASE_CHILD_ORDER)
                    .push();
            restaurantRef.child("server").setValue(mServer);
            restaurantRef.child("table").setValue(mTable);
            restaurantRef.child("item").setValue(mBreakfastItems);
            Intent intent = new Intent(MenuActivity.this, OrderCompleteActivity.class);
            startActivity(intent);
        }
    }
}
