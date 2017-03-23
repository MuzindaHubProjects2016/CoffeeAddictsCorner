package com.example.vechnet.coffeeaddictscorner;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by vechnet on 2017/03/22.
 */

public class CallActivity extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_call);


        }

        public void onClickCallUsImageButton(View view) {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:123456789"));

            if (ActivityCompat.checkSelfPermission(CallActivity.this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                return;
            }

            startActivity(intent);
        }

    public void onClickBackToMenu(View view) {
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);

    }


}
