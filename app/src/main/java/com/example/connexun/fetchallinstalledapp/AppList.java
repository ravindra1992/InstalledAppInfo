package com.example.connexun.fetchallinstalledapp;

import android.graphics.drawable.Drawable;

public class AppList {

    private String name;


    public String getPckagenaname() {
        return pckagenaname;
    }

    private String pckagenaname;
    Drawable icon;

    public AppList(String name,String pckagenaname, Drawable icon) {
        this.name = name;
        this.icon = icon;
        this.pckagenaname=pckagenaname;
    }

    public String getName() {
        return name;
    }



    public Drawable getIcon() {
        return icon;
    }
}
