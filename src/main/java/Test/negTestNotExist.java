package Test;

import org.junit.Test;
import service.LocationServiceImpl;

import static org.junit.Assert.assertEquals;

/*
 * Created by Jochem Kuus on 12-3-2017.
 */
public class negTestNotExist {
    // testing with a postcode that doesn't exist
    @Test
    public void classCrashNoLoc(){
        LocationServiceImpl lSI = new LocationServiceImpl();

        String result = lSI.getLatLng("5555RR");
        assertEquals(result, "{\"Errorcode\":404,\"Errormessage\":\"Location not found for postcode: 5555RR\"}");
    }
}
