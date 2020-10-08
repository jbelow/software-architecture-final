package TheRoad.Events;

public class TalkToTravelersEvent implements Event {

    @Override
    public int runEvent() {


        String eventInfo = "this is the talking with travelers event";
        System.out.println(eventInfo);


        // giving the id that I want to be the next location
        //the only outcome it to head to the boss fight
        return 5;
    }
}
