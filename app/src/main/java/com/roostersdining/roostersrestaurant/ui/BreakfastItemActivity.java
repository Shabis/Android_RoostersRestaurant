package com.roostersdining.roostersrestaurant.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

public class BreakfastItemActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.theBarnyard) Button mTheBarnyardOmelet;
    @Bind(R.id.veraCruz) Button mVeraCruzOmelet;
    @Bind(R.id.meatCheese) Button mMeatCheeseOmelet;
    @Bind(R.id.spinachMushroom) Button mSpinachMushroomOmelet;
    @Bind(R.id.steakMushroom) Button mSteakMushroomOmelet;

    public String mServer;
    public String mTable;
    public ArrayList<BreakfastItem> mBreakfastItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_item);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        mServer = intent.getStringExtra("server");
        mTable = intent.getStringExtra("table");
        mBreakfastItems = Parcels.unwrap(getIntent().getParcelableExtra("itemArray"));

        mTheBarnyardOmelet.setOnClickListener(this);
        mVeraCruzOmelet.setOnClickListener(this);
        mMeatCheeseOmelet.setOnClickListener(this);
        mSpinachMushroomOmelet.setOnClickListener(this);
        mSteakMushroomOmelet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mTheBarnyardOmelet) {
            Intent intent = new Intent(BreakfastItemActivity.this, EggOptionActivity.class);
            intent.putExtra("server", mServer);
            intent.putExtra("table", mTable);
            intent.putExtra("itemArray", Parcels.wrap(mBreakfastItems));
            intent.putExtra("item", "The Barnyard");
            startActivity(intent);
        }
        if (v == mVeraCruzOmelet) {
            Intent intent = new Intent(BreakfastItemActivity.this, EggOptionActivity.class);
            intent.putExtra("server", mServer);
            intent.putExtra("table", mTable);
            intent.putExtra("itemArray", Parcels.wrap(mBreakfastItems));
            intent.putExtra("item", "Vera Cruz Omelet");
            startActivity(intent);
        }
        if (v == mMeatCheeseOmelet) {
            Intent intent = new Intent(BreakfastItemActivity.this, EggOptionActivity.class);
            intent.putExtra("server", mServer);
            intent.putExtra("table", mTable);
            intent.putExtra("itemArray", Parcels.wrap(mBreakfastItems));
            intent.putExtra("item", "Meat & Cheese Omelet");
            startActivity(intent);
        }
        if (v == mSpinachMushroomOmelet) {
            Intent intent = new Intent(BreakfastItemActivity.this, EggOptionActivity.class);
            intent.putExtra("server", mServer);
            intent.putExtra("table", mTable);
            intent.putExtra("itemArray", Parcels.wrap(mBreakfastItems));
            intent.putExtra("item", "Spinach & Mushroom Omelet");
            startActivity(intent);
        }
        if (v == mSteakMushroomOmelet) {
            Intent intent = new Intent(BreakfastItemActivity.this, EggOptionActivity.class);
            intent.putExtra("server", mServer);
            intent.putExtra("table", mTable);
            intent.putExtra("itemArray", Parcels.wrap(mBreakfastItems));
            intent.putExtra("item", "Steak & Mushroom Omelet");
            startActivity(intent);
        }
    }
}
