package TheRoad;

import TheRoad.Reader.KeyboardReader;
import TheRoad.Reader.Reader;
import TheRoad.Writer.ConsoleWriter;
import TheRoad.Writer.Writer;

public class Menu {

    //TODO: don't have Scanner sitting everywhere "do not repeat yourself"

    private final Writer consoleOutput = new ConsoleWriter();
    private final Reader playerIntInput = new KeyboardReader();


    public static void main(String[] args) {

        //NOTE: new Game().runGame(); is here for dev work
        new Game().runGame();

        new Menu().startMenu();


    }

    public void startMenu() {
        Game game = new Game();
        boolean playAgain = false;

        int choice = 0;

        while (playAgain) {
            printMenu();
            choice = Integer.parseInt(playerIntInput.readln());

            switch (choice) {
                case 1:
                    playAgain = game.runGame();
                    break;
                case 2:
                    //get info

                case 3:
                    consoleOutput.writeln("I see you don't want to play anymore... I mean yeah I guess that is fine and doesn't make me sad </3");
                    System.exit(0);
            }

        }

    }


    private void printMenu() {
        //either:

        //start game
        //help/info
        //exit game
        consoleOutput.writeln("\n1) start new game \n2) get help/info \n3) exit game");
        System.out.println("What do you want to do:");

    }

}