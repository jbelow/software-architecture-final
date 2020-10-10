package TheRoad.Events;

import TheRoad.Locations.BossEnd.RoadBoss;
import TheRoad.Locations.Location;
import TheRoad.Locations.SleepChoice.RoadBanditAttackDeath;

public class BanditAttackEvent implements Event {

    @Override
    public Location runEvent() {

        boolean outcome;
        String eventInfo = "this is the getting attacked by bandits event";

        System.out.println(eventInfo);


        //temp logic for testing the flow of the game
        outcome = false;


        if (outcome) { // giving the id that I want to be the next location
            //if player beats the bandits
            return new Location(new RoadBoss());

        } else {
            //player dies
            return new Location(new RoadBanditAttackDeath());
        }


    }
}
