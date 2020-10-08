package TheRoad.Writer;

public class ConsoleWriter implements Writer{

    /**
     * Write a line of text to the console.
     *
     * @param line - a String representing one line of text.
     */
    @Override
    public void writeln(String line) {
        System.out.println(line);
    }
}
