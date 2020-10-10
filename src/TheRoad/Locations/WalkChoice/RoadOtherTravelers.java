package TheRoad.Locations.WalkChoice;

import TheRoad.Locations.LocationStrategy;

public class RoadOtherTravelers implements LocationStrategy {
    @Override
    public String getLocation() {
        return "there was going to be something here that would be cool but the dev got really distracted and forgot that he was going to do something cool here. \n" +
                "just pretend there was a cool pattern used here :)";
    }

    @Override
    public int getLocationId() {
        return 7;
    }
}
