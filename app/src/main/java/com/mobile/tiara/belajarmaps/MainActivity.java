package com.mobile.tiara.belajarmaps;

import android.os.Bundle;
import android.view.View;

import com.mobile.tiara.belajarmaps.helper.MyFunction;

public class MainActivity extends MyFunction {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMap(View view){
        aksesclass(MapsActivity.class);
    }

    public void onPlace(View view){
        aksesclass(PlacePickerActivity.class);
    }
}
