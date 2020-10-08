package TheRoad.Locations.SleepChoice;

import TheRoad.Locations.LocationStrategy;

public class RoadAttackedDeath implements LocationStrategy {
    @Override
    public String getLocation() {
        return "Looks like this is the end of the road you for. It looks like you aren't much use when it comes to defending yourself against robbers.";
    }

    @Override
    public int getLocationId() {
        return 4;
    }

}
