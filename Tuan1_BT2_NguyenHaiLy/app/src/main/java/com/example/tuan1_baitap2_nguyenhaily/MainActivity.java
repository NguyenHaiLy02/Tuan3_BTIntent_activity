package com.example.tuan1_baitap2_nguyenhaily;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpen=(Button)
                findViewById(R.id.btnOpenChildActivity);
        btnOpen.setOnClickListener(new
                                           View.OnClickListener() {
                                               public void onClick(View arg0) {
                                                   doOpenChildActivity();
                                               }
                                           });
    }
    public void doOpenChildActivity()
    {
        Intent myIntent=new Intent(this, activity_profile.class);
        startActivity(myIntent);
    }

}