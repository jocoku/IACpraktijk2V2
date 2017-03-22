package Test;

import org.junit.Test;
import service.LocationServiceImpl;

import static org.junit.Assert.assertEquals;


/*
 * Created by Jochem Kuus on 12-3-2017.
 */
public class negTestInvalChar {
    // testing with a postcode that is incorrect
    @Test
    public void classCrashInvalidChar(){
        LocationServiceImpl lSI = new LocationServiceImpl();

        String result = lSI.getLatLng("3731@X"); // this postcode has a @ which is an illegal character
        assertEquals(result, "{\"Errorcode\":500,\"Errormessage\":\"Postcode (3731@X} does not follow the standard: 1234AB\"}");
    }
}
