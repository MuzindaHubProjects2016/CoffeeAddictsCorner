package com.example.vechnet.coffeeaddictscorner;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by vechnet on 2017/03/22.
 */

public class choice1Activity extends AppCompatActivity {
    private Button OrderImageButton;
    private Button CallUsImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice1);



       /* OrderImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startOrder();

            }
        });

        CallUsImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCall();
            }
        });
    }

    private  void startOrder() {

        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);

    }

    private void startCall() {
        Intent intent = new Intent (this,CallActivity.class);
        startActivity(intent);
    }*/
    }


        public void onButtonTap(View v) {

        }

    public void onClickorderImageButton(View view) {
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);

    }
    public void onClickCallUsImageButton(View view) {
        Intent intent = new Intent(this,CallActivity.class);
        startActivity(intent);
    }
}
