package TheRoad.Events;

public class BanditAttackEvent implements Event {

    @Override
    public int runEvent() {


        boolean outcome;
        String eventInfo = "this is the getting attacked by bandits event";

        System.out.println(eventInfo);


        //temp logic for testing the flow of the game
        outcome = true;


        if (outcome) { // giving the id that I want to be the next location

            //if player beats the bandits
            return 5;
        } else {
            //player dies
            return 4;
        }


    }
}
