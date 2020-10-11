package TheRoad;

import TheRoad.Characters.Archer;
import TheRoad.Characters.CharacterStrategy;
import TheRoad.Characters.Knight;
import TheRoad.Characters.Thief;
import TheRoad.Events.BanditAttackEvent;
import TheRoad.Events.Event;
import TheRoad.Events.EventFactory;
import TheRoad.Locations.BossEnd.RoadBoss;
import TheRoad.Locations.BossEnd.RoadBossWin;
import TheRoad.Locations.Location;
import TheRoad.Locations.LocationType;
import TheRoad.Locations.SleepChoice.RoadBanditAttack;
import TheRoad.Locations.SleepChoice.RoadCamp;
import TheRoad.Locations.WalkChoice.RoadOtherTravelers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {


    //testing the characters
    @Test
    void characterKnight() {
        CharacterStrategy character = new Knight();

        Assert.assertEquals("Knight", character.getName());
    }

    @Test
    void characterArcher() {
        CharacterStrategy character = new Archer();

        Assert.assertEquals("Archer", character.getName());
    }

    @Test
    void characterThief() {
        CharacterStrategy character = new Thief();

        Assert.assertEquals("Thief", character.getName());
    }

    //this test if for making sure that the id is what is meant to be for the locaitons
    @Test
    void checkLocationRoadBoss(){
        Location gameLocation = new Location(new RoadBoss());
        Assert.assertEquals(5, gameLocation.getLocationId());
    }

    @Test
    void checkLocationRoadOtherTravelers(){
        Location gameLocation = new Location(new RoadOtherTravelers());
        Assert.assertEquals(7, gameLocation.getLocationId());
    }

    @Test
    void checkLocationRoadBossWin(){
        Location gameLocation = new Location(new RoadBossWin());
        Assert.assertEquals(13, gameLocation.getLocationId());
    }

    @Test
    void checkLocationRoadCamp(){
        Location gameLocation = new Location(new RoadCamp());
        Assert.assertEquals(2, gameLocation.getLocationId());
    }

    @Test
    void checkLocationRoadBanditAttack(){
        Location gameLocation = new Location(new RoadBanditAttack());
        Assert.assertEquals(3, gameLocation.getLocationId());
    }

}