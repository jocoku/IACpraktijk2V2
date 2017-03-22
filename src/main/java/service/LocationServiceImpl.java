package service;

/*
 * Created by Jochem Kuus on 17-3-2017.
 */

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;

@Path("/location")
public class LocationServiceImpl {

    @GET
    @Path("/lookup/{postcode}")
    public String getLatLng(@PathParam("postcode") String postcode) {
        GoogleLookupService gls = new GoogleLookupService();
        Location loc = gls.lookupPostcode(postcode);

        JsonObjectBuilder job = Json.createObjectBuilder();
        if (loc.getErrCode() == 2) {

            job.add("latitude", loc.getLat());
            job.add("longitude", loc.getLng());

        } else if (loc.getErrCode() == 0) {

            job.add("Errorcode", 500);
            job.add("Errormessage", "Postcode (" + postcode + "} does not follow the standard: 1234AB");

        } else if (loc.getErrCode() == 1) {

            job.add("Errorcode", 404);
            job.add("Errormessage", "Location not found for postcode: " + postcode);

        }
        return job.build().toString();


    }
}
