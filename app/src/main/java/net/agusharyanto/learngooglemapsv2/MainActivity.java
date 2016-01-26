package net.agusharyanto.learngooglemapsv2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends FragmentActivity  {

    private GoogleMap gMap;

    static final LatLng Post1 = new LatLng(2.922961, 101.661912);
    static final LatLng Post2 = new LatLng(2.927269,101.656859);
    static final LatLng Post3 = new LatLng(2.927440,101.644328);
    static final LatLng Post4 = new LatLng(2.918097,101.650722);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMap();
    }

    public void initMap(){
        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        gMap = mapFragment.getMap();
        gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Post1, 14));
        addMarker();
//        addPolyGon();
        addPolyLine();

    }

    public void addMarker(){

        Marker tamanmini = gMap.addMarker(new MarkerOptions()
                .position(Post1)
                .title("TimeTecCloud")
                .snippet("FingerTec Research & Development Centre")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        Marker post2 = gMap.addMarker(new MarkerOptions()
                .position(Post2)
                .title("T-System")
                .snippet("FingerTec Research & Development Centre")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        Marker post3 = gMap.addMarker(new MarkerOptions()
                .position(Post3)
                .title("MMU Univ")
                .snippet("FingerTec Research & Development Centre")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        Marker post4 = gMap.addMarker(new MarkerOptions()
                .position(Post4)
                .title("Shopping Mall")
                .snippet("FingerTec Research & Development Centre")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
    }

    public void addPolyLine(){

        Polyline polyline = gMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(2.922961,101.661912),
                                new LatLng(2.927269,101.656859),
                                new LatLng(2.927440,101.644328),
                                new LatLng(2.918097,101.650722)
//                                new LatLng(-6.307301,106.899054),
//                                new LatLng(-6.306831,106.900105)
                        ).width(5).color(Color.RED)
        );

    }


    //============= DRAW POLYGON METHOD ================
//    public void addPolyGon(){
//        Polygon polygon = gMap.addPolygon(new PolygonOptions()
//                .add(new LatLng(-6.305296,106.898432),
//                        new LatLng(-6.306831,106.898239),
//                        new LatLng(-6.306981,106.899762),
//                        new LatLng(-6.305509,106.900706)).strokeWidth(5)
//                .strokeColor(Color.BLUE).fillColor(Color.RED));
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}