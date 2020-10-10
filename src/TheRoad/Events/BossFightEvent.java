package TheRoad.Events;

import TheRoad.Locations.BossEnd.RoadBoss;
import TheRoad.Locations.BossEnd.RoadBossDeath;
import TheRoad.Locations.BossEnd.RoadBossWin;
import TheRoad.Locations.Location;

public class BossFightEvent implements Event {

    @Override
    public Location runEvent() {
        boolean outcome;

        String eventInfo = "this is the boss event";
        System.out.println(eventInfo);


        //temp logic for testing the flow of the game
        outcome = false;

        if (outcome) { // giving the id that I want to be the next location
            //if player is able beat the boss
            return new Location(new RoadBossWin());
        } else {
            //player is killed
            return new Location(new RoadBossDeath());
        }

    }
}
