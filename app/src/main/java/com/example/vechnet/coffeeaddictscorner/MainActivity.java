package com.example.vechnet.coffeeaddictscorner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotbevarages_menu);
      ;
        ListView listView = (ListView) findViewById(R.id.list_options);
        ListView listDrinks = getListView();
        ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<Drinks>(
                this,
                android.R.layout.simple_list_item_1,
                Drinks.Drinks);
        listDrinks.setAdapter(listAdapter);
    }

    private ListView getListView() {
        return listView;
    }

    public void onListItemClick(ListView listView,
                                View itemView,
                                int position,
                                long id) {
        Intent intent = new Intent(this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }

    // listView.setOnItemClickListener(itemClickListener);


        //  AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        // @Override
        // public void onItemClick(AdapterView<?> listView ,
        //   View itemView ,
        //   int position,
        //  long id ) {

        //if (position == 0) {
        // Intent intent = new Intent (MainActivity.this,hot_coffee_list.class);
        //  startActivity(intent);

    }




      // ListView listView = (ListView) findViewById(R.id.list_options);
       //listView.setOnItemClickListener(itemClickListener);











