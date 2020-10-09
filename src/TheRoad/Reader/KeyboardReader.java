package TheRoad.Reader;

import java.util.Scanner;

public class KeyboardReader implements Reader {
    /**
     * Reads characters from the keyboard until a carriage return is entered.
     *
     * @return a String representing one line of input.
     */

    @Override
    public String readln() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
