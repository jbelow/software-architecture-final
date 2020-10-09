package TheRoad.Reader;

import java.util.Scanner;

public class IntKeyboardReader implements Reader {
    /**
     * Reads characters from the keyboard until a carriage return is entered.
     *
     * @return a String representing one line of input.
     */
    @Override
    public int readln() {
//        System.out.println("Please enter some text, then press return:");

        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }
}
