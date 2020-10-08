package TheRoad.Reader;

import java.util.Scanner;

public class KeyboardReader implements ReaderStrategy {
    /**
     * Reads characters from the keyboard until a carriage return is entered.
     *
     * @return a String representing one line of input.
     */
    @Override
    public String readln() {
//        System.out.println("Please enter some text, then press return:");

        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
