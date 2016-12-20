package com.roostersdining.roostersrestaurant.models;

import java.util.ArrayList;

/**
 * Created by Shelby Clayton on 12/19/2016.
 */

public class Order {
    int id;
    ArrayList<String> items = new ArrayList<>();

    public Order() {}

    public Order(int id, ArrayList<String> items) {
        this.id = id;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getItems() {
        return items;
    }
}
