package Test;


import org.junit.Test;
import service.LocationServiceImpl;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/*
 * Created by Jochem Kuus on 12-3-2017.
 */
public class posTest {
    // test in which the result will be correct, postcode found and lat/long are matching
    @Test
    public void classWorks(){
        LocationServiceImpl lSI = new LocationServiceImpl();

        String result = lSI.getLatLng("3731XC");

        assertEquals(result, "{\"latitude\":52.1113981,\"longitude\":5.1796013}");

    }
}
