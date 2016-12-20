package com.roostersdining.roostersrestaurant.models;

/**
 * Created by Shelby Clayton on 12/20/2016.
 */

public class BreakfastItem {
    String name;
    String eggs;
    String toast;
    private String pushId;

    public BreakfastItem() {}

    public BreakfastItem(String name, String eggs, String toast) {
        this.name = name;
        this.eggs = eggs;
        this.toast = toast;
    }

    public String getName() {
        return name;
    }

    public String getEggs() {
        return eggs;
    }

    public String getToast() {
        return toast;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId() {
        this.pushId = pushId;
    }
}
