package service;


public class ServiceProvider {
    private static LocationServiceImpl locationService = new LocationServiceImpl();
    public static LocationServiceImpl getLocationService() {
        return locationService;
    }
}