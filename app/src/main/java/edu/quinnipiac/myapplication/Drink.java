package edu.quinnipiac.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk",R.drawable.latte),
            new Drink("Cappuccino", "Espresso, steamed milk",R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted",R.drawable.filter)

    };




    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getimageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }




}
