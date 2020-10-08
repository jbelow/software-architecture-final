package TheRoad.Events;

public class StealEvent implements Event {
    @Override
    public int runEvent() {
        boolean outcome;

        String eventInfo = "this is the trying to steal event event";
        System.out.println(eventInfo);


        //temp logic for testing the flow of the game
        outcome = false;

        if (outcome) { // giving the id that I want to be the next location
            //if player is able to get away with stealing
            return 5;
        } else {
            //player is caught
            return 9;
        }
    }
}
