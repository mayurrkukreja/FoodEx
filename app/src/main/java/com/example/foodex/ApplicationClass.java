package com.example.foodex;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<ItemList> item;
    @Override
    public void onCreate() {
        super.onCreate();
        item=new ArrayList<ItemList>();
        item.add(new ItemList("Shahi Paneer","180","paneer"));
        item.add(new ItemList("Chole Bhature","120","cholebhature"));
        item.add(new ItemList("Noodles","80","noodles"));
        item.add(new ItemList("Pav Bhaji","120","pavbhaji"));
        item.add(new ItemList("Fried Rice","120","rice"));
        item.add(new ItemList("Samosa","60","samosa"));
    }
}
