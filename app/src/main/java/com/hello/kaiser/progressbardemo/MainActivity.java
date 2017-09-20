package com.hello.kaiser.progressbardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ProgressBar mProgressBar;
    private TextView mPercentage;

    private int progress = 0;//變化參數

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initSet();

    }

    private void initView() {
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
        mPercentage = (TextView) findViewById(R.id.progress_tv);
    }

    private void initSet() {
        mProgressBar.setMax(100);
    }


    public void increasing(View view) {
        progress += 10;
        if (progress <= 100)
            mPercentage.setText(progress + "%");
        else
            Toast.makeText(this, "已經跑完囉", Toast.LENGTH_SHORT).show();

        mProgressBar.setProgress(progress);
    }
}
