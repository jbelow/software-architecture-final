package TheRoad.Locations.WalkChoice;

import TheRoad.Locations.LocationStrategy;

public class RoadStealFail implements LocationStrategy {
    @Override
    public String getLocation() {
        return "You failed when trying to steal from the poor people... I guess that is what you get for trying something like that. \n" +
                "They decided that they will turn you in to the next road cops that they find.";
    }

    @Override
    public int getLocationId() {
        return 9;
    }
}
