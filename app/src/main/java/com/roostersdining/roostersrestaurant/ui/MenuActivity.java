package com.roostersdining.roostersrestaurant.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.roostersdining.roostersrestaurant.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.newItem) Button mNewItem;
    @Bind(R.id.finishOrder) Button mFinishOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);

        mNewItem.setOnClickListener(this);
        mFinishOrder.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mNewItem) {

        }
        if (v == mFinishOrder) {

        }
    }
}
