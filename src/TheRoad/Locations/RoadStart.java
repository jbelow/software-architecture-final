package TheRoad.Locations;

public class RoadStart implements LocationStrategy {


    @Override
    public String getLocation() {
        return "You are currently on the road heading to the infamous city of “lots of gold and cool stuffs!” \n" +
                "Would you like to head on your way to get a head start on all the other travelers or set up camp and prepare before your long journey.\n" +
                "1) set camp \n" +
                "2) start walking";
    }

    @Override
    public int getLocationId() {
        return 0;
    }
}
