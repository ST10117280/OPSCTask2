package com.sanelegwinyai.sblcollections;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);



    Handler h = new Handler();
        h.postDelayed(new Runnable() {
        @Override
        public void run() {
        Intent i = new Intent(getApplicationContext(),Login.class);
        startActivity(i);
        finish();

    }
}, 4000);
}
}
