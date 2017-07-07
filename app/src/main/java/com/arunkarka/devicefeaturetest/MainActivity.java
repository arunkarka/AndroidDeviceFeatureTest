package com.arunkarka.devicefeaturetest;

import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> featureList = new ArrayList<>();
        featureList.add(PackageManager.FEATURE_LOCATION_GPS);
        PackageManager pm = getPackageManager();
        TextView tv = (TextView) findViewById(R.id.tv);
        for (String feature : featureList) {
            if (!pm.hasSystemFeature(feature)) {
                tv.setText(feature+" is NOT available \n");
            } else {
                tv.setText(feature+" is available \n");
            }
        }
    }
}
