import java.util.*;
import java.lang.*;

/**
 * CSE3040 HW1
 * Level004.java
 * Purpose: Print ASCII value of an input char.
 *
 * @version 1.0 10/09/2019
 * @author Seunghwan Choi
 */

public class Level004 {
    /**
     *main method of level 004
     * takes a string input and converts it's first character to an integer to print it.
     * @param args not used
     */
    public static void main(String []args){
        System.out.print("ASCII code teller. Enter a letter: ");
        Scanner input = new Scanner(System.in);
        String c = input.nextLine();
        int a = (int)c.charAt(0);
        System.out.println("The ASCII code of C is " + a);
    }
}
