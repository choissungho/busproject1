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


public class BeomgyeinfoActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beomgye_info);

        FragmentManager fragmentManager = getFragmentManager();
        MapFragment mapFragment = (MapFragment) fragmentManager
                .findFragmentById(R.id.beomgye);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap map) {

        LatLng Beomgye = new LatLng(37.3905509157291, 126.94957334132637);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(Beomgye);
        markerOptions.title("범계");
        markerOptions.snippet("범계 버스");
        map.addMarker(markerOptions);

        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Beomgye, 13));
    }

}