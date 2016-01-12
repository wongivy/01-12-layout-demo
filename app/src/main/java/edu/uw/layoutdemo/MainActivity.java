package edu.uw.layoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "LAYOUT_DEMO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //A quick method to respond to the button press
    public void buttonClicked(View v){
        Log.v(TAG, "Button was pressed!");


        //in case we want to play with the other activity
        //Intent intent = new Intent(this, SecondActivity.class);
        //startActivity(intent);
    }
}
