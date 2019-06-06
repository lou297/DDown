package com.pingpong.ddown.NaverShoppingClass;

import java.util.ArrayList;
import java.util.Date;

public class NaverShoppingResult {
    private String lastBuildDate;
    private int total;
    private int start;
    private int display;
    private ArrayList<NaverShoppingItem> items;

    public NaverShoppingResult(String lastBuildDate, int total, int start, int display, ArrayList<NaverShoppingItem> items) {
        this.lastBuildDate = lastBuildDate;
        this.total = total;
        this.start = start;
        this.display = display;
        this.items = items;
    }

    public String getLastBuildDate() {
        return lastBuildDate;
    }

    public int getTotal() {
        return total;
    }

    public int getStart() {
        return start;
    }

    public int getDisplay() {
        return display;
    }

    public ArrayList<NaverShoppingItem> getItems() {
        return items;
    }
}
