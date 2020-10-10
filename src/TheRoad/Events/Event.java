package TheRoad.Events;

import TheRoad.Locations.Location;

public interface Event {

    //when the event is done it will give back the next location for runGame
    Location runEvent();

}
