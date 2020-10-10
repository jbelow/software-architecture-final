package TheRoad.Events;

import TheRoad.Characters.CharacterStrategy;
import TheRoad.Locations.BossEnd.RoadBoss;
import TheRoad.Locations.Location;
import TheRoad.Locations.WalkChoice.RoadStealFail;

public class StealEvent implements Event {
    @Override
    public Location runEvent(CharacterStrategy playerCharacter, Location gameLocation) {
        boolean outcome;

        String eventInfo = "this is the trying to steal event event";
        System.out.println(eventInfo);


        //temp logic for testing the flow of the game
        outcome = false;

        if (outcome) { // giving the id that I want to be the next location
            //if player is able to get away with stealing
            return new Location(new RoadBoss());
        } else {
            //player is caught
            return new Location(new RoadStealFail());
        }
    }
}
