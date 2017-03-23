package com.example.vechnet.coffeeaddictscorner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by vechnet on 2017/03/22.
 */

public class MenuActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void onClickHotBeverages(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }

    public void onClickIcedBeverages(View view) {
        Intent intent = new Intent(this,IcedBeverages.class);
        startActivity(intent);

    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this,choice1Activity.class);
        startActivity(intent);

    }
}
