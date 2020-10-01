package TheRoad;

import java.util.Scanner;

public class Game {

    private final Scanner scanner = new Scanner(System.in);
    private int currentLocationId;

    public void runGame() {

        //set the first location
        Location gameLocation = new Location(new RoadStart());
        currentLocationId = gameLocation.getLocationId();
//        System.out.println("this is the first location " + currentLocationId);


        System.out.println("your new live has started:");

        //TODO: ask for the name and what class they want to be

        System.out.println("You are currently on the road heading to the infamous city of “lots of golden cool stuffs ” " +
                "Would you like to head on your way to get a head start on all the other travelers or set up camp and prepare before your long journey. " +
                "\n1) set camp \n2) start walking");
        int choice = 0;
        while (choice != 3) {

            choice = scanner.nextInt();
            if (choice == 1) {
                switch (currentLocationId) {

                    //the case is to find out what location the player is at with the id
                    case 1:
                        gameLocation = new Location(new RoadCamp());
                        currentLocationId = gameLocation.getLocationId();
                        System.out.println("it is resetting the current location to 2: " + currentLocationId);

                    case 2:

                    case 3:

                    case 4:

                    case 5:

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
                    case 1:

                    case 2:

                    case 3:

                    case 4:

                    case 5:

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
