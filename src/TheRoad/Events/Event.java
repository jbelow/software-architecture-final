package TheRoad.Events;

import TheRoad.Characters.CharacterStrategy;
import TheRoad.Locations.Location;

public interface Event {

    //when the event is done it will give back the next location for runGame
    Location runEvent(CharacterStrategy playerCharacter, Location gameLocation);

}
