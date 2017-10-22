package edu.uw.notifysettingdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String TAG = "SecondActivity";

    public static final String EXTRA_MESSAGE = "edu.uw.notifysetting.message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //action bar "back"
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String message = extras.getString(EXTRA_MESSAGE);
            TextView subtitle = (TextView) findViewById(R.id.txt_second);
            subtitle.setText("Received: " + message);
        }

    }
}
