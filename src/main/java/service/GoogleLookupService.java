package service;

/*
 * Created by Jochem Kuus on 17-3-2017.
 */

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

public class GoogleLookupService {
    public Location lookupPostcode(String postcode) {
        Location loc = new Location();
        if (postcode.matches("[1-9][0-9]{3}[A-Z]{2}")) {

            if (postcode.length() == 6) {
                try {
                    GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyDGMW8VDfx3d8OhBxAT_LNuOrfHXFUPyo4"); // CHANGE THIS
                    GeocodingResult[] results = GeocodingApi.geocode(context, postcode).await();

                    if (results.length > 0) {
                        loc.setLat(results[0].geometry.location.lat);
                        loc.setLng(results[0].geometry.location.lng);
                        loc.setErrCode(2);
                        return loc;
                    } else {
                        loc.setErrCode(1);
                    }
                } catch (Exception e) {
                    loc.setErrCode(1);
                }
            }
            return loc;
        } else {
            loc.setErrCode(0);
            return loc;
        }
    }
}
