package TheRoad;

import java.util.Scanner;

public class Menu {

    //TODO: don't have Scanner sitting everywhere "do not repeat yourself"

    private final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        //NOTE: new Game().runGame(); is here for dev work
        new Game().runGame();

        new Menu().startMenu();
    }

    public void startMenu() {
        int choice = 0;
        while (choice != 3) {
            printMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Starting a new game!");
                    new Game().runGame();
                    break;
                case 2:
                    //get info

                case 3:
                    System.out.println("I see you don't want to play anymore... I mean yeah I guess that is fine and doesn't make me sad </3");
                    System.exit(0);
            }

        }

    }

    private static void printMenu() {
        //either:

        //start game
        //help/info
        //exit game
        System.out.println("\n1) start new game \n2) get help/info \n3) exit game");
        System.out.println("What do you want to do:");

    }

}