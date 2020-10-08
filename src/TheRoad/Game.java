package TheRoad;

import TheRoad.Events.Event;
import TheRoad.Events.EventFactory;
import TheRoad.Locations.*;
import TheRoad.Locations.BossEnd.*;
import TheRoad.Locations.SleepChoice.*;
import TheRoad.Locations.WalkChoice.*;
import TheRoad.Events.*;
import TheRoad.Writer.*;
import TheRoad.Reader.*;

//TODO: this is going to be temp before the logic is in place for random events
import java.util.Random;

/**
 * NOTE TO THE TEACHER: I haven't added all of the logic yet for the userChoice (besides id: 0 and 2 to make sure it works)
 * or the events (I want to add NPCs aka the traveler, bandits and the boss for the player to interact with)
 * Is it fine that the game will move to the event and run there for everything that will happen? the idea is that the fighting/talking with NPCs will be handled there
 */

public class Game {

    //TODO: this is going to be temp before the logic is in place for random events
    Random rand = new Random();
    //TODO this is also temp as I'm not sure how to deal with the "setting up the game at the RoadStart" #1
    int choice = 0;


    private final Writer consoleOutput = new ConsoleWriter();
    private final Reader playerInput = new KeyboardReader();



    public void runGame() {


        int currentLocationId;
        String location;

        //TODO: ask for the name and what class they want to be

        //setting up the game at the RoadStart
        Location gameLocation = new Location(new RoadStart());

        //setting locationId
        currentLocationId = gameLocation.getLocationId();

        //getting the test for the location
        location = gameLocation.getLocation();
        System.out.println("top of runGame");

        //writing out the location
        consoleOutput.writeln(location);
        //now that it has read it all out and the id is 0 it should pass over all of the ifs and go to the else that sends the player to userChoice
        //TODO right now it is fine here but I will want to move this #1
        choice = playerInput.readln();



        //reading what the user inputs
//        choice = playerInput.readln();


        //game loop
        do {
            System.out.println("the current id is: " + currentLocationId);
//            System.out.println("--------------------------------------- next loop from the do while ---------------------------------------");
            //there are some locations that aren't a user choice - first we check if it is a event(an event could be righting or trying to steal) then if it isn't then it goes to choice
            //TODO: I'm not sure if this is the best setup for this

            if (checkEnding(currentLocationId)) {
                //find out what ending it is and run the last text then ask if the player wants to play again
//                System.out.println("TEST: this is an ending");

            } else if (checkEvent(currentLocationId)) {
                //find out what event it is and run it
//                System.out.println("TEST: this is an event");
                Event newEvent = EventFactory.getEvent(currentLocationId);
                newEvent.runEvent();

            } else {
//                System.out.println("TEST: this is an user choice");
                currentLocationId = userChoice(currentLocationId, location, gameLocation);
            }
        } while (true);

    }

    private boolean checkEnding(int currentLocationId) {
        //checks to see if the currentLocationId is an ending
        int[] endingLocation = LocationType.getTypeEnding();

        for (int x : endingLocation) {
            if (x == currentLocationId) {
                return true;
            }
        }
        return false;
    }

    private boolean checkEvent(int currentLocationId) {
        //checks to see if the currentLocationId is an event
        int[] eventLocation = LocationType.getTypeEvent();
        for (int x : eventLocation) {
            if (x == currentLocationId) {
                return true;
            }
        }
        return false;
    }

    private int userChoice(int currentLocationId, String location, Location gameLocation) {

//        System.out.println("the program got the the userChoice method");
        System.out.println(choice);
        System.out.println(currentLocationId);
        if (choice == 1) {
//            System.out.println("now before the switch if choice == 1");
            switch (currentLocationId) {
                //the case is to find out what location the player is at with the id
                //aka case = Location ID
                case 0:
                    System.out.println("did it get to case 0");
                    gameLocation = new Location(new RoadCamp());
                    System.out.println(gameLocation.getLocationId());

                    return gameLocation.getLocationId();


                case 1:
                    gameLocation = new Location(new RoadOtherTravelers());
                    return gameLocation.getLocationId();

                case 2: //TODO: this will not be a choice but instead a random IF to see if it will get an event (there's a random chance that bandits will attack)


                    //TODO: this is going to be temp before the logic is in place for random events
                    // Generate random integers in range 0 to 2
                    double x = Math.random();

                    do {
                        if (x > 0.5 ) {
                            gameLocation = new Location(new RoadBanditAttack());
//                            return gameLocation.getLocationId();
                            System.out.println("you are getting attacked");

                        } else {
                            System.out.println("some text before you meet the boss");
                            gameLocation = new Location(new RoadBoss());
//                            return gameLocation.getLocationId();

                        }
                    } while (true);



                case 5:
                    gameLocation = new Location(new RoadBossPayOff());
                    return gameLocation.getLocationId();

            }

        } else if (choice == 2) {
            switch (currentLocationId) {
                case 0:
                    gameLocation = new Location(new RoadWalk());
                    return gameLocation.getLocationId();

                case 1:
                    gameLocation = new Location(new RoadSteal());
                    return gameLocation.getLocationId();

                case 2: //TODO: this will not be a choice but instead a random event
                    //TODO: this just sends the player to the boss but need to add some info text about what happened in the night
                    gameLocation = new Location(new RoadBoss());
                    return gameLocation.getLocationId();

                case 5:
                    gameLocation = new Location(new RoadBossFight());
                    return gameLocation.getLocationId();
            }
        }

        System.out.println("at the end of userChoice return: " + gameLocation.getLocationId());
        return gameLocation.getLocationId();

    }

}

