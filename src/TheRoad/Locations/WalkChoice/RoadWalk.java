package TheRoad.Locations.WalkChoice;

import TheRoad.Locations.LocationStrategy;

public class RoadWalk implements LocationStrategy {


    @Override
    public String getLocation() {
        return "I'm sure there is some really interesting story behide all of this but this isn't a writing class and you are just walking on a road. You come up on some other travels what should you do? \n" +
                "1) have a nice chat with them \n" +
                "2) try to steal their money";
    }

    @Override
    public int getLocationId() {
        return 1;
    }
}
