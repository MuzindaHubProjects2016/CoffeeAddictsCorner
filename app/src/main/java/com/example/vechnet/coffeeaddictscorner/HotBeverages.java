package com.example.vechnet.coffeeaddictscorner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


/**
 * Created by vechnet on 2017/03/23.
 */

public class HotBeverages extends AppCompatActivity {

    //String[] values = {"Test Text 1", "Test Text 2", "test text 3", "test text 4", "test text 5", "test text 6", "test text 7", "test text 8", "test text 9"};


    // RecyclerView recyclerView;
    // RecyclerView.LayoutManager layoutManager;
    // RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotbevarages_menu);



     /*   recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewAdapter = new RecyclerViewAdapter(this, values);

        recyclerView.setAdapter(recyclerViewAdapter);

    }


    /*private void photos() {
        int[] photoid = new int[]{
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.one,
                R.drawable.two}; */


    }
    public void onClickHotBeverages(View view) {
        Intent intent = new Intent(this,DrinkCategoryActivity.class);
        startActivity(intent);

    }

}

