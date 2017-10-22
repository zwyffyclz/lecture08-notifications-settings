package edu.uw.notifysettingdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //to handle the launch button
    public void launchActivity(View v){
        startActivity(new Intent(this, SecondActivity.class)); //quick launch
    }

    //to handle the notification button
    public void showNotification(View v){
        Log.d(TAG, "Notify button pressed");

    }

    //to handle the alert button
    public void showAlert(View v){
        Log.d(TAG, "Alert button pressed");

    }


    /* Menu handling */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_item_settings:
                Log.d(TAG, "Settings menu pressed");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
