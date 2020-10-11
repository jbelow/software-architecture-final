package TheRoad.Locations.BossEnd;

import TheRoad.Locations.LocationStrategy;

public class RoadBossPass implements LocationStrategy {
    @Override
    public String getLocation() {
        return "I'm glad that you don't want to fight me. You would have lost anyways...";
    }

    @Override
    public int getLocationId() {
        return 10;
    }
}
