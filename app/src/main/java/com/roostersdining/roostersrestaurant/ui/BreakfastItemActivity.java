package com.roostersdining.roostersrestaurant.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.roostersdining.roostersrestaurant.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BreakfastItemActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.theBarnyard) Button mTheBarnyardOmelet;
    @Bind(R.id.veraCruz) Button mVeraCruzOmelet;
    @Bind(R.id.meatCheese) Button mMeatCheeseOmelet;
    @Bind(R.id.spinachMushroom) Button mSpinachMushroomOmelet;
    @Bind(R.id.steakMushroom) Button mSteakMushroomOmelet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_item);
        ButterKnife.bind(this);

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
            startActivity(intent);
        }
        if (v == mVeraCruzOmelet) {

        }
        if (v == mMeatCheeseOmelet) {

        }
        if (v == mSpinachMushroomOmelet) {

        }
        if (v == mSteakMushroomOmelet) {

        }
    }
}
