package TheRoad;

public class Location {

    private LocationStrategy location;



    public Location(LocationStrategy location) {
        this.location = location;
    }

    public LocationStrategy getLocation() {
        return location;
    }

    public void setLocation(LocationStrategy location) {
        this.location = location;
    }

    //TODO: get current location


    public int getLocationId(){
        return location.getLocationId();
    }




}
