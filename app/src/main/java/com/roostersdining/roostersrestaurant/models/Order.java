package com.roostersdining.roostersrestaurant.models;

import org.parceler.Parcel;
import java.util.ArrayList;

/**
 * Created by Shelby Clayton on 12/19/2016.
 */
@Parcel
public class Order {
    String table;
    String server;
    private String pushId;
    ArrayList<BreakfastItem> items = new ArrayList<>();

    public Order() {}

    public Order(String table, String server, ArrayList<BreakfastItem> items) {
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

    public ArrayList<BreakfastItem> getItems() {
        return items;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    public String getPushId() {
        return pushId;
    }


}
