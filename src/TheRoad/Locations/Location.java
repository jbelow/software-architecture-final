package TheRoad.Locations;

public class Location {

    private LocationStrategy location;

    public Location(LocationStrategy location) {
        this.location = location;
    }

    public int getLocationId(){
        return location.getLocationId();
    }
    public String getLocation(){
        return location.getLocation();
    }

}
