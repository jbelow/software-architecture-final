package TheRoad;

import TheRoad.Events.Event;
import TheRoad.Events.EventFactory;
import TheRoad.Locations.*;
import TheRoad.Locations.BossEnd.*;
import TheRoad.Locations.SleepChoice.*;
import TheRoad.Locations.WalkChoice.*;
import TheRoad.Events.*;

import java.util.Scanner;

public class Game {

    private final Scanner scanner = new Scanner(System.in);


    public void runGame() {
        Location gameLocation = new Location(new RoadStart());
        int currentLocationId;
        String location;

        //set the first location
        currentLocationId = gameLocation.getLocationId();
        //System.out.println("this is the first location " + currentLocationId);

        //TODO: ask for the name and what class they want to be

        //game loop
        do {
            location = gameLocation.getLocation();
            System.out.println(location);


            //there are some locations that aren't a user choice - first we check if it is a event(an event could be righting or trying to steal) then if it isn't then it goes to choice
            //TODO: I'm not sure if this is the best setup for this
            if (checkEnding(currentLocationId)) {
                //find out what ending it is and run the last text then ask if the player wants to play again
                System.out.println("TEST: this is an ending");

            } else if (checkEvent(currentLocationId)) {
                //find out what event it is and run it
                System.out.println("TEST: this is an event");
                Event newEvent = EventFactory.getEvent(currentLocationId);
                newEvent.runEvent();

            } else {
                userChoice(currentLocationId, gameLocation);
            }
        } while (true);


    }

    public boolean checkEnding(int currentLocationId) {
        //checks to see if the currentLocationId is an ending
        int[] endingLocation = LocationType.getTypeEnding();

        for (int x : endingLocation) {
            if (x == currentLocationId) {
                return true;
            }
        }
        return false;
    }

    public boolean checkEvent(int currentLocationId) {
        //checks to see if the currentLocationId is an event
        int[] eventLocation = LocationType.getTypeEvent();

        for (int x : eventLocation) {
            if (x == currentLocationId) {
                return true;
            }
        }
        return false;
    }

    public int userChoice(int currentLocationId, Location gameLocation) {
        int choice = 0;

        choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
//            System.out.println("Choice test");
            switch (currentLocationId) {

                //the case is to find out what location the player is at with the id
                //aka case = Location ID
                case 0:

                    gameLocation = new Location(new RoadCamp());
                    currentLocationId = gameLocation.getLocationId();
                    System.out.println("it is resetting the current location to 2: " + currentLocationId);

                case 1:
                    gameLocation = new Location(new RoadOtherTravelers());
                    return gameLocation.getLocationId();

                case 2: //TODO: this will not be a choice but instead a random event
                    gameLocation = new Location(new RoadBanditAttack());
                    return gameLocation.getLocationId();

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
        return gameLocation.getLocationId();
        //return 404;
    }

}

