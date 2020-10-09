package TheRoad.Locations.SleepChoice;


import TheRoad.Locations.LocationStrategy;

public class RoadCamp implements LocationStrategy {


    @Override
    public String getLocation() {
        return "you have decided to make camp for the night before setting off. For your sake I hope it is a peaceful night.";
    }

    @Override
    public int getLocationId() {
        return 2;
    }

}