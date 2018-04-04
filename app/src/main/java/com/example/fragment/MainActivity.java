package com.example.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Boolean isFirstFragmentShowing = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.am_content_container, new BlankFragment());
        transaction.commit();
    }

    public void changeFragmentClicked(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if (isFirstFragmentShowing) {
            isFirstFragmentShowing = false;
            transaction.replace(R.id.am_content_container, new BlankFragment());
        } else {
            isFirstFragmentShowing = true;
            transaction.replace(R.id.am_content_container, new SecondFragment());
        }

        transaction.commit();
    }
}
