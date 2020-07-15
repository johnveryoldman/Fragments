package com.geektech.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        showFragment(MainFragment2.newInstance(), MainFragment2.TAG);
    }

    private void showFragment(Fragment fragment, String tag) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container_main_2, fragment, tag);
        transaction.commit();
    }

    private void returnResult() {
        Intent intent = new Intent();
        setResult(RESULT_OK, intent);
        finish();
    }
}