package com.roostersdining.roostersrestaurant.models;

import java.util.ArrayList;

/**
 * Created by Shelby Clayton on 12/19/2016.
 */

public class Order {
    private String pushId;
    ArrayList<String> items = new ArrayList<>();

    public Order() {}

    public Order(int id, ArrayList<String> items) {
        this.items = items;
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
