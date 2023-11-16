package generics;

import java.util.HashMap;
import java.util.Map;


class Location {
    private String name;
    private double latitude;
    private double longitude;

    public Location(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    Location() {
    }

    @Override
    public String toString() {
        return name + " (" + latitude + ", " + longitude + ")";
    }
}

class RestaurantLocation extends Location{
    private String name;
    private double latitude;
    private double longitude;

    private double starRating;

    public RestaurantLocation(String name, double latitude, double longitude, double starRating) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this. starRating = starRating;
    }

    public RestaurantLocation(String name, double latitude, double longitude){
        super( name,  latitude,  longitude);
    }

    @Override
    public String toString() {
        return name + " (" + latitude + ", " + longitude + ")";
    }
}

// Generic interface
interface MapService<K, V> {
    void addLocation(K key, V location);

    V getLocation(K key);
}

class MapsApp<T> implements MapService<String, T> {
    private Map<String, T> locationMap;

    public MapsApp() {
        this.locationMap = new HashMap<>();
    }

    @Override
    public void addLocation(String key, T location) {
        locationMap.put(key, location);
    }

    @Override
    public T getLocation(String key) {
        return locationMap.get(key);
    }
}

public class GenericMapsExample {
    public static void main(String[] args) {
        MapsApp mapsApp = new MapsApp();

        mapsApp.addLocation("Home", new Location("Home", 37.7749, -122.4194));
        mapsApp.addLocation("Work", new Location("Work", 37.3861, -122.0838));
        mapsApp.addLocation("School", new Location("School", 37.4275, -122.1697));
        mapsApp.addLocation("Favourite Restaurant", new RestaurantLocation("ACME Corp Restaurant",0.123,1.324,5.0));

        System.out.println("Home Location: " + mapsApp.getLocation("Home"));
        System.out.println("Work Location: " + mapsApp.getLocation("Work"));
        System.out.println("School Location: " + mapsApp.getLocation("School"));
        System.out.println("Restaurant Location: " + mapsApp.getLocation("Favourite Restaurant"));
    }
}
