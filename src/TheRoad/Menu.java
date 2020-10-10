package TheRoad;

import TheRoad.Reader.KeyboardReader;
import TheRoad.Reader.Reader;
import TheRoad.Writer.ConsoleWriter;
import TheRoad.Writer.Writer;

/**
 * TheRoad program is a text adventure game that implement:
 * GRASP / Encapsulation / SOLID
 * The Strategy Pattern
 * The Singleton Pattern
 * The Factory Method
 * Documented with JavaDoc
 * JUnit
 *
 * @startMenu
 *
 * @author Joshua Below
 * @version v1.0
 * @since 2020-10-01
 */

public class Menu {

    private final Writer consoleOutput = new ConsoleWriter();
    private final Reader playerIntInput = new KeyboardReader();
    private boolean playAgain = true;



    public static void main(String[] args) {

        //NOTE: new Game().runGame(); is here for dev work
//        new Game().runGame();

           new Menu().startMenu();

    }

    public void startMenu() {

        Game game = new Game();

        int choice;

        //fun forever loop
        do {
            //playAgain is from runGame and when there is an ending it will return if the player wants to go again
            if (playAgain) {
                printMenu();
                choice = Integer.parseInt(playerIntInput.readln());

                //get info
                switch (choice) {
                    case 1 -> playAgain = game.runGame();
                    case 2 -> gameInfo();
                    case 3 -> {
                        consoleOutput.writeln("I see you don't want to play anymore... I mean yeah I guess that is fine and doesn't make me sad </3");
                        System.exit(0);
                    }
                }
            } else {
                System.exit(0);
            }
        } while (true);

    }


    private void printMenu() {
        //either:
        //start game
        //help/info
        //exit game
        consoleOutput.writeln("\n1) start new game \n2) get help/info \n3) exit game");
        consoleOutput.writeln("What do you want to do:");
    }

    private void gameInfo() {
        consoleOutput.writeln("All you need to do is type in either a word or number and then the game will do it's thing hopefully...");
    }

}