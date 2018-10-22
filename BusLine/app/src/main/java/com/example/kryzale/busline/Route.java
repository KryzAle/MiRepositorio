package com.example.kryzale.busline;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

/**
 * Created by Kryz Ale on 31/12/2016.
 */

public class Route {
    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;

    public List<LatLng> points;
}
