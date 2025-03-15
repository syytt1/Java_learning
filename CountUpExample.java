/**
 * This is my first properly documented piece java code.
 * When the javadoc tool is run over this code, it will 
 * create an HTML maintenance manual.
 * @author Laurissa Tokarchuk
 * @version 1.0
 * @author Paula Fonseca
 * @version 1.1
 */
public class CountUpExample {

    /**
     * This method counts down from a specified number
     * to zero. It will print its progress to the 
     * command line.
     * @param count  The number to count from.
     */
    public void countUp(int count) {
        /* Note: If there are no brackets after a for
         * loop, only the sentence that immediately
         * follows it will be part of the loop.
         */
        for (int i=1; i <= count; i++)
            System.out.println(i);

        System.out.println("\nAll done!");
    }

    /**
     * Main now only creates a new instance of my 
     * program and calls the program's method.
     * @param args  The program does not use this parameter.
     */
    public static void main (String[] args) {
        CountUpExample counter = new CountUpExample();
        counter.countUp(5);
    }
}