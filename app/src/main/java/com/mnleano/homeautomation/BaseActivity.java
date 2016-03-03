package com.mnleano.homeautomation;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by mleano on 2/29/2016.
 */
public abstract class BaseActivity extends AppCompatActivity {

    public abstract void initViews();

    public abstract void initListener();

    public abstract void initData();

    public int ctr;

}
