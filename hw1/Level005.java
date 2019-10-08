import java.util.Random;
import java.util.Scanner;

/**
 * CSE3040 HW1
 * Level005.java
 *
 * Purpose: Generates a random integer range of 1 - 100 and takes input until the user gets the answer
 * Level5+ : Additional Requirements
 *  - count how many times the user inputs an answer
 *  - after each wrong answer update the range of numbers the user should guess from in the next prompt.
 * @version 1.0 10/09/2019
 * @author Seunghwan Choi
 */

public class Level005 {
    /**
     *main method of level 005
     * Generator initializes answer. Continues to take user input until user inputs the correct answer
     * @param args not used
     */
    public static void main(String []args){
        Random generator = new Random();
        int answer = generator.nextInt(99) + 1;
        int left = 1;
        int right = 100;
        int testNum=0;
        Scanner input = new Scanner(System.in);
        while(true) {
            testNum = testNum + 1;
            System.out.print("["+testNum+"]"+"Guess a number ("+ left +"-"+right+"): ");
            int inputInt = input.nextInt();
            if (inputInt > answer) {
                System.out.println("Too large!");
                right = inputInt - 1;
            } else if (inputInt < answer) {
                System.out.println("Too small!");
                left = inputInt + 1;
            } else {
                System.out.println("Correct!");
                break;
            }
        }
    }
}
