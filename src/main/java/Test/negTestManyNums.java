package Test;

import org.junit.Test;
import service.LocationServiceImpl;

import static org.junit.Assert.assertEquals;

/*
 * Created by Jochem Kuus on 12-3-2017.
 */
public class negTestManyNums {

    // testing with a postcode that is incorrect
    @Test
    public void classCrashMoreNums(){
        LocationServiceImpl lSI = new LocationServiceImpl();

        String result = lSI.getLatLng("37317X"); // this postcode has 5 numbers and 1 letter instead of 4 numbers and 2 letters
        assertEquals(result, "{\"Errorcode\":500,\"Errormessage\":\"Postcode (37317X} does not follow the standard: 1234AB\"}");

    }
}
