package service;

/*
 * Created by Jochem Kuus on 17-3-2017.
 */
public class Location {
    private double lat;
    private double lng;
    private int errCode = 0;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }
}
