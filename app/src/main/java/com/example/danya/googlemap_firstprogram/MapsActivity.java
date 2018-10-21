package com.example.danya.googlemap_firstprogram;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.CircleOptions;
import android.graphics.Color;

import java.util.TimerTask;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng Sixtythird_steet_Beach = new LatLng(41.78203, -87.5733146);
        LatLng Ohio_Street_Beach = new LatLng(41.8934953, -87.6129454);
        LatLng Montrose_Beach = new LatLng(41.966331, -87.63723329999999);
        LatLng Rainbow_Beach = new LatLng(41.7607473, -87.55071040000001);
        LatLng Calumet_Beach = new LatLng(41.7144037, -87.52830319999998);
        LatLng Osterman_Beach = new LatLng(41.9861856, -87.6519968);

        mMap.addMarker(new MarkerOptions().position(Calumet_Beach));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Calumet_Beach, 17));

        mMap.addCircle((new CircleOptions().center(Calumet_Beach).radius(100).strokeColor(Color.RED).fillColor(Color.BLUE)));


    }



}
