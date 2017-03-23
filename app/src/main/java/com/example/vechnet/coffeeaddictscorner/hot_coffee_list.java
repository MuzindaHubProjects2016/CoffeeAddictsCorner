package com.example.vechnet.coffeeaddictscorner;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by vechnet on 2017/03/20.
 */

public class hot_coffee_list extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotbevarages_menu);

        ListView listDrinks = getListView();
        ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<Drinks>(
                this,
                android.R.layout.simple_list_item_1,
                Drinks.Drinks
        );
        listDrinks.setAdapter(listAdapter);
    }
    }
