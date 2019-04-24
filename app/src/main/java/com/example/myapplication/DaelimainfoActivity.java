package com.example.myapplication;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class DaelimainfoActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daelima_info);

        FragmentManager fragmentManager = getFragmentManager();
        MapFragment mapFragment = (MapFragment) fragmentManager
                .findFragmentById(R.id.daelim);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap map) {

        LatLng Daelim = new LatLng(37.40248427302206, 126.93047517343723);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(Daelim);
        markerOptions.title("대림");
        markerOptions.snippet("대림 버스");
        map.addMarker(markerOptions);

        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Daelim, 13));
    }

}