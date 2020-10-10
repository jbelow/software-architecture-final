package TheRoad;

import TheRoad.Events.Event;
import TheRoad.Events.EventFactory;
import TheRoad.Locations.*;
import TheRoad.Locations.BossEnd.*;
import TheRoad.Locations.SleepChoice.*;
import TheRoad.Locations.WalkChoice.*;
import TheRoad.Writer.*;
import TheRoad.Reader.*;
import TheRoad.Characters.*;

//TODO: this is going to be temp before the logic is in place for random events

/**
 * NOTE TO THE TEACHER: I haven't added all of the logic yet for the userChoice (besides id: 0 and 2 to make sure it works)
 * or the events (I want to add NPCs aka the traveler, bandits and the boss for the player to interact with)
 * Is it fine that the game will move to the event and run there for everything that will happen? the idea is that the fighting/talking with NPCs will be handled there
 * <p>
 * right now the game will just looping a broken away but all the necessary classes should be in place to prevent that when I reconstruct all the locations are all connected fully
 * <p>
 * Any System.out.println are temp and meant for debugging
 */

public class Game {

    //TODO: this is going to be temp before the logic is in place for random events
    int choice = 0;

    private final Writer consoleOutput = new ConsoleWriter();
    private final Reader playerInput = new KeyboardReader();

    public boolean runGame() {
        int currentLocationId;
//        String location;
        String playerCharacterChoice;

        CharacterStrategy display;

        consoleOutput.writeln("Before you begin please pick a class:");
        for (int i = 0; i < 3 ; i++) {

            switch (i) {
                case 0:
                    display = new Knight();
                    break;

                case 1:
                    display = new Archer();
                    break;

                case 2:
                    display = new Thief();
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + i);
            }
            consoleOutput.writeln("Name: " + display.name());
            consoleOutput.writeln("Discretion: " + display.discretion());
            consoleOutput.writeln("Health: " + String.valueOf(display.health()));
            consoleOutput.writeln("Damage: " + String.valueOf(display.damage()));
            consoleOutput.writeln("Speed: " + String.valueOf(display.speed()));
            consoleOutput.writeln("--------------------------------------------");

        }
        consoleOutput.writeln(">");
        playerCharacterChoice = playerInput.readln();

        if (playerCharacterChoice.equals("Knight")) {
            CharacterStrategy playerCharacter = new Knight();

        } else if (playerCharacterChoice.equals("Archer")) {
            CharacterStrategy playerCharacter = new Archer();

        } else if (playerCharacterChoice.equals("Thief")) {
            CharacterStrategy playerCharacter = new Thief();

        } else {
            CharacterStrategy playerCharacter = new Knight();
            consoleOutput.writeln("It seems like you didn't pick an option the game gave so you get: " + playerCharacter.name());
        }


        consoleOutput.writeln("Loading game...");
        //setting up the game at the RoadStart
        Location gameLocation = new Location(new RoadStart());

        //setting locationId
        currentLocationId = gameLocation.getLocationId();

        //getting the test for the location
        //TODO I don't need to be passing this around if I can just call gameLocation
//        location = gameLocation.getLocation();

        consoleOutput.writeln("Game loaded :)");


        //game loop
        do {
//            System.out.println("--------------------------------------- next loop from the do while ---------------------------------------");
            //there are some locations that aren't a user choice - first we check if it is a event(an event could be righting or trying to steal) then if it isn't then it goes to choice
            //TODO: I'm not sure if this is the best setup for this

            if (checkEnding(currentLocationId)) {
                String wantsToPlayAgain;

                //find out what ending it is and run the last text then ask if the player wants to play again
                consoleOutput.writeln(gameLocation.getLocation());

                consoleOutput.writeln("Do you want to play again? Y : N");
                wantsToPlayAgain = playerInput.readln().toLowerCase();

                if (wantsToPlayAgain.equals("y")){
                    consoleOutput.writeln("Sending player back to the menu");
                    return true;

                }else {
                    consoleOutput.writeln("Understandable, have a great day!");
                    System.exit(0);

                }

            } else if (checkEvent(currentLocationId)) {
                //find out what event it is and run it
//                System.out.println("TEST: this is an event");
                Event newEvent = EventFactory.getEvent(currentLocationId);
                currentLocationId = newEvent.runEvent();

            } else {
//                System.out.println("TEST: this is an user choice");
                currentLocationId = userChoice(currentLocationId, gameLocation);
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

    private int userChoice(int currentLocationId, Location gameLocation) {

        Location choiceOne;
        Location choiceTwo;

        switch (currentLocationId) {
            //the case is to find out what location the player is at with the id
            //aka case = Location ID
            case 0:
                //writing out the location
//                consoleOutput.writeln(location);
                //now that it has read it all out and the id is 0 it should pass over all of the ifs and go to the else that sends the player to userChoice

                consoleOutput.writeln(gameLocation.getLocation());
                choice = Integer.parseInt(playerInput.readln());

                choiceOne = new Location(new RoadCamp());
                choiceTwo = new Location(new RoadWalk());
                gameLocation = ifChoice(choiceOne, choiceTwo);

//                location = gameLocation.getLocation();
                return gameLocation.getLocationId();

            case 1:

                choiceOne = new Location(new RoadOtherTravelers());
                choiceTwo = new Location(new RoadSteal());
                gameLocation = ifChoice(choiceOne, choiceTwo);

//                location = gameLocation.getLocation();
                return gameLocation.getLocationId();

            case 2:
                //this is random because they might attack or they might not
                double x = Math.random();
                if (x > 0.4) {
                    gameLocation = new Location(new RoadBanditAttack());


                } else {
                    consoleOutput.writeln("You are all rested up, but it looks like that means you are send right to the boss of this game...");
                    gameLocation = new Location(new RoadBoss());

                }

//                location = gameLocation.getLocation();
                return gameLocation.getLocationId();

            case 5:

                consoleOutput.writeln(gameLocation.getLocation());
                choice = Integer.parseInt(playerInput.readln());

                choiceOne = new Location(new RoadBossPayOff());
                choiceTwo = new Location(new RoadBossFight());
                gameLocation = ifChoice(choiceOne, choiceTwo);

//                location = gameLocation.getLocation();
                return gameLocation.getLocationId();
        }

        //it should never be able to get here
        System.out.println("at the end of userChoice return: " + gameLocation.getLocationId());

//        location = gameLocation.getLocation();
        return gameLocation.getLocationId();
    }

    //I don't want to have to repeat myself with if else (I think this is a good idea?)
    //it is meant as a way to have the code be less redundant
    private Location ifChoice(Location ChoiceOne, Location ChoiceTwo) {
        if (choice == 1) {
            return ChoiceOne;
        } else if (choice == 2) {
            return ChoiceTwo;
        } else { //TODO this will be an error later
            return null;
        }
    }

}

