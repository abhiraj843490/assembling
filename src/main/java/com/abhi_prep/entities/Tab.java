package com.abhi_prep.entities;

public class Tab  {
    private String title;
    private int id;

    public Tab(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
}
