package TheRoad.Locations.SleepChoice;

import TheRoad.Locations.LocationStrategy;

public class RoadBanditAttackDeath implements LocationStrategy {
    @Override
    public String getLocation() {
        return "Looks like this is the end of the road you for. You aren't much use when it comes to defending yourself against robbers.";
    }

    @Override
    public int getLocationId() {
        return 4;
    }

}
