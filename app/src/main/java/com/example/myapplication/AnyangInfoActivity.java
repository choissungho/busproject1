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


public class AnyangInfoActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anyang_info);

        FragmentManager fragmentManager = getFragmentManager();
        MapFragment mapFragment = (MapFragment)fragmentManager
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap map) {

        LatLng Anyang = new LatLng(37.40106561421763,  126.92388921452297);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(Anyang);
        markerOptions.title("안양");
        markerOptions.snippet("얀양 버스");
        map.addMarker(markerOptions);

        map.moveCamera(CameraUpdateFactory.newLatLng(Anyang));
        map.animateCamera(CameraUpdateFactory.zoomTo(13));
    }

}