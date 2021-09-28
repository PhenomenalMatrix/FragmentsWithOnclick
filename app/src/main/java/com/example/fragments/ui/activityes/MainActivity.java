package com.example.fragments.ui.activityes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.ui.fragments.FirstFragment.FirstFragment;
import com.example.fragments.ui.fragments.SecondFragment.SecondFragment;
import com.example.fragments.ui.fragments.ThirdFragment.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragments();
        initView();
        initListeners();
    }

    private void initListeners() {

    }

    private void initView() {

    }

    private void initFragments() {
        getSupportFragmentManager().beginTransaction().add(R.id.container_first, new ThirdFragment()).commit();
    }
}