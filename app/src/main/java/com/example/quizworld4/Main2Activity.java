package com.example.quizworld4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TabLayout tabLayout = findViewById(R.id.tabBar);
        TabItem tabQuestions = findViewById(R.id.tabQuestions);
        TabItem tabAnswers = findViewById(R.id.tabAnswers);
        TabItem tabHelp = findViewById(R.id.tabHelp);
        ViewPager viewPager = findViewById(R.id.viewPager);
    }
}
