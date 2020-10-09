package TheRoad.Locations.SleepChoice;

import TheRoad.Locations.LocationStrategy;

public class RoadBanditAttack implements LocationStrategy {
    @Override
    public String getLocation() {
        return "Looks like it was a dumb idea to just sleep on the road and now you are getting attacked by some bandits!";
    }

    @Override
    public int getLocationId() {
        return 3;
    }
}
