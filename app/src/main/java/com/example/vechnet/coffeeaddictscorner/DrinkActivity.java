package com.example.vechnet.coffeeaddictscorner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vechnet on 2017/03/20.
 */

public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINKNO = "drinkNo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
//Get the drink from the intent
        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);
        Drinks drinks = Drinks.Drinks[drinkNo];
//Populate the drink image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drinks.getImageResourceId());
        photo.setContentDescription(drinks.getName());
//Populate the drink name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drinks.getName());

//Populate the drink description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(drinks.getDescription());
    }
}