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
        MapFragment mapFragment = (MapFragment) fragmentManager
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap map) {

        LatLng Anyang = new LatLng(37.40106561421763, 126.92388921452297);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(Anyang);
        markerOptions.title("안양");
        markerOptions.snippet("얀양 버스");
        map.addMarker(markerOptions);

        LatLng Beomgye = new LatLng(37.3905509157291, 126.94957334132637);

        MarkerOptions BeomgyeOptions = new MarkerOptions();
        BeomgyeOptions.position(Beomgye);
        BeomgyeOptions.title("범계");
        BeomgyeOptions.snippet("범계 버스");
        map.addMarker(BeomgyeOptions);

        LatLng Daelim = new LatLng(37.40248427302206, 126.93047517343723);

        MarkerOptions DaelimOptions = new MarkerOptions();
        DaelimOptions.position(Daelim);
        DaelimOptions.title("대림");
        DaelimOptions.snippet("대림 버스");
        map.addMarker(DaelimOptions);

        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Anyang, 13));
//        map.animateCamera(CameraUpdateFactory.zoomTo(13));
    }

}