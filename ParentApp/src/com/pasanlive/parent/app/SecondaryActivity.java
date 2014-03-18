/*
 * (C) Copyright 2012-2014 hSenid Software International (Pvt) Limited.
 * All Rights Reserved.
 *
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Software International (Pvt) Limited.
 *
 * hSenid Software International (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 */
package com.pasanlive.parent.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * User: Pasan Buddhika
 * Date: 3/18/14
 */
public class SecondaryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondary);

        TextView textView = (TextView) findViewById(R.id.welcomeNote);

        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            String user = extra.getString("name");
            textView.setText("Hi " + user);
        }
    }
}
