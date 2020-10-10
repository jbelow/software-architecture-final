package TheRoad.Events;

public class EventFactory {

    //use getEvent method to get object of type event
    public static Event getEvent(int currentLocationId) {

        if (currentLocationId == 3) {
            return new BanditAttackEvent();

        } else if (currentLocationId == 6) {
            return new StealEvent();

        } else if (currentLocationId == 11) {
            return new BossFightEvent();
        }

        return null;
    }


}
