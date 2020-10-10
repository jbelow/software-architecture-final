package TheRoad.Events;

import TheRoad.Locations.BossEnd.RoadBoss;
import TheRoad.Locations.Location;

public class TalkToTravelersEvent implements Event {

    @Override
    public Location runEvent() {


        String eventInfo = "this is the talking with travelers event";
        System.out.println(eventInfo);


        // giving the id that I want to be the next location
        //the only outcome it to head to the boss fight
        return new Location(new RoadBoss());
    }
}
