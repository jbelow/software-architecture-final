package TheRoad;

import TheRoad.Locations.*;
import TheRoad.Locations.BossEnd.*;
import TheRoad.Locations.SleepChoice.*;
import TheRoad.Locations.WalkChoice.*;

import java.util.Scanner;

public class Game {

    private final Scanner scanner = new Scanner(System.in);
    private int currentLocationId;
    String location;

    public void runGame() {

        //set the first location
        Location gameLocation = new Location(new RoadStart());
        currentLocationId = gameLocation.getLocationId();
        System.out.println("this is the first location " + currentLocationId);


        System.out.println("your new live has started:");

        //TODO: ask for the name and what class they want to be

        location = gameLocation.getLocation();
        System.out.println(location);




        int choice = 0;
        while (choice != 3) {

            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("Choice test");
                switch (currentLocationId) {

                    //the case is to find out what location the player is at with the id
                    //aka case = Location ID
                    case 0:

                        gameLocation = new Location(new RoadCamp());
                        currentLocationId = gameLocation.getLocationId();
                        System.out.println("it is resetting the current location to 2: " + currentLocationId);

                    case 1:
                        gameLocation = new Location(new RoadOtherTravelers());
                        currentLocationId = gameLocation.getLocationId();

                    case 2: //TODO: this will not be a choice but instead a random event
                        gameLocation = new Location(new RoadAttacked());
                        currentLocationId = gameLocation.getLocationId();

                    case 3:

                    case 4:

                    case 5:
                        gameLocation = new Location(new RoadBossPayOff());
                        currentLocationId = gameLocation.getLocationId();

                    case 6:

                    case 7:

                    case 8:

                    case 9:

                    case 10:

                    case 11:

                    case 12:

                    case 13:

                }

            } else if (choice == 2) {
                switch (currentLocationId) {
                    case 0:
                        gameLocation = new Location(new RoadWalk());
                        currentLocationId = gameLocation.getLocationId();

                    case 1:
                        gameLocation = new Location(new RoadSteal());
                        currentLocationId = gameLocation.getLocationId();

                    case 2: //TODO: this will not be a choice but instead a random event
                        //TODO: this just sends the player to the boss but need to add some info text about what happened in the night
                        gameLocation = new Location(new RoadBoss());
                        currentLocationId = gameLocation.getLocationId();

                    case 3:

                    case 4:

                    case 5:
                        gameLocation = new Location(new RoadBossFight());
                        currentLocationId = gameLocation.getLocationId();

                    case 6:

                    case 7:

                    case 8:

                    case 9:

                    case 10:

                    case 11:

                    case 12:

                    case 13:

                }
            }
        }
    }

}
