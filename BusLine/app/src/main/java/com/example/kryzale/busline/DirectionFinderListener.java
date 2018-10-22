package com.example.kryzale.busline;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;
import com.example.kryzale.busline.Route;
/**
 * Created by Kryz Ale on 31/12/2016.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
