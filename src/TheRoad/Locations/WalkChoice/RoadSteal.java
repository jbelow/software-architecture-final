package TheRoad.Locations.WalkChoice;

import TheRoad.Locations.LocationStrategy;

public class RoadSteal implements LocationStrategy {
    @Override
    public String getLocation() {
        return "I see that you would rather try steal from people than just talk...";
    }

    @Override
    public int getLocationId() {
        return 6;
    }
}
