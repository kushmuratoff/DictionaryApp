package com.example.samariddin.lugat_base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  boolean onCreateOptionMenu(Menu menu)
    {
        menu.add(0,1,0,"Admin");
        menu.add(0,2,1,"User");
        return true;
    }
}
