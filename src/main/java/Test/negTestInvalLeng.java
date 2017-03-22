package Test;

import org.junit.Test;
import service.LocationServiceImpl;

import static org.junit.Assert.assertEquals;

/*
 * Created by Jochem Kuus on 12-3-2017.
 */
public class negTestInvalLeng {
    // testing with a postcode of an invalid length
    @Test
    public void classCrashLen(){
        LocationServiceImpl lSI = new LocationServiceImpl();

        String result = lSI.getLatLng("33731XC"); // this postcode has 5 numbers and 2 letter instead of 4 numbers and 2 letters
        assertEquals(result, "{\"Errorcode\":500,\"Errormessage\":\"Postcode (33731XC} does not follow the standard: 1234AB\"}");
    }
}
