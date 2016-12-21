package com.roostersdining.roostersrestaurant.models;

import com.google.firebase.database.FirebaseDatabase;
import com.roostersdining.roostersrestaurant.Constants;

import java.util.ArrayList;

/**
 * Created by Shelby Clayton on 12/19/2016.
 */

public class Order {
    String table;
    String server;
    private String pushId;
    ArrayList<String> items = new ArrayList<>();

    public Order() {}

    public Order(String table, String server, ArrayList<String> items) {
        this.table = table;
        this.server = server;
        this.items = items;
    }

    public String getTable() {
        return table;
    }

    public String getServer() {
        return server;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    public String getPushId() {
        return pushId;
    }


}
