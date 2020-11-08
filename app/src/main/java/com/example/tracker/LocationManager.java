package com.example.tracker;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.View;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import static android.content.ContentValues.TAG;

public class LocationManager extends LocationCallback {

    private FusedLocationProviderClient mFusedLocationProvider;


    public LocationManager(Context context) {
        mFusedLocationProvider = LocationServices.getFusedLocationProviderClient(context);
/*
        String str1 = "234";
        String str2 = "123";

        || - OR
        && - AND

        += - ADD
        -= - SUBTRACT

        == - EQUALS
        != - NOT_EQUALS

        boolean isEqual = str1 == str2;*/

        if (ActivityCompat.checkSelfPermission(context, android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(context, android.Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            mFusedLocationProvider.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() {
                @Override
                public void onSuccess(Location location) {

                }
            });
       }

    }



    @Override
    public void onLocationResult(LocationResult locationResult) {
        super.onLocationResult(locationResult);
    }

    @Override
    public void onLocationAvailability(LocationAvailability locationAvailability) {
        super.onLocationAvailability(locationAvailability);
    }
}


