package TheRoad.Events;

public class BossFightEvent implements Event {

    @Override
    public int runEvent() {
        boolean outcome;

        String eventInfo = "this is the boss event";
        System.out.println(eventInfo);


        //temp logic for testing the flow of the game
        outcome = false;

        if (outcome) { // giving the id that I want to be the next location
            //if player is able beat the boss
            return 13;
        } else {
            //player is killed
            return 12;
        }

    }
}
