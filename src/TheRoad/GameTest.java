package TheRoad;

import TheRoad.Locations.BossEnd.RoadBoss;
import TheRoad.Locations.Location;
import TheRoad.Locations.LocationType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {




    @Test
    void runGame() {
        Location gameLocation = new Location(new RoadBoss());
    }


    @Test
    void checkEnding(){
        Location gameLocation = new Location(new RoadBoss());

    }

    @org.junit.jupiter.api.Test
    void checkEvent() {
        Location gameLocation = new Location(new RoadBoss());


    }



}