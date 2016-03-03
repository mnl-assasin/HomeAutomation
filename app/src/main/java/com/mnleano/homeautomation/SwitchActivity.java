package com.mnleano.homeautomation;

import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class SwitchActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {

    private final Context ctx = SwitchActivity.this;

    private ToggleButton[] toggleButton = new ToggleButton[16];

    private int switchId[] = {R.id.switch01, R.id.switch02, R.id.switch03, R.id.switch04,
            R.id.switch05, R.id.switch06, R.id.switch07, R.id.switch08,
            R.id.switch09, R.id.switch10, R.id.switch11, R.id.switch12,
            R.id.switch13, R.id.switch14, R.id.switch15, R.id.switch16};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        initViews();
        initListener();
        initData();

    }

    @Override
    public void initViews() {

        for (int ctr = 0; ctr < switchId.length; ctr++) {
            toggleButton[ctr] = (ToggleButton) findViewById(switchId[ctr]);
            toggleButton[ctr].setOnCheckedChangeListener(this);
        }

    }

    @Override
    public void initListener() {

//        for (ctr = 0; ctr < switchId.length; ctr++) {
//            toggleButton[ctr].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//                @Override
//                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//                    if (isChecked) {
//                        send("On " + (ctr + 1));
//                    } else {
//                        send("Off " + (ctr + 1));
//                    }
//                }
//            });
//        }
    }

    @Override
    public void initData() {

    }

    public void send(String message) {
        ToastBuilder.createShortToast(ctx, message);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        for (ctr = 0; ctr < switchId.length; ctr++) {
            if (buttonView == toggleButton[ctr]) {
                if (isChecked) {
                    send("On " + (ctr + 1));
                } else {
                    send("Off " + (ctr + 1));
                }
            }
        }
    }
}
