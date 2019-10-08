import java.util.Scanner;

/**
 * CSE3040 HW1
 * Level007.java
 * Purpose: Enter a text and a letter. Print how many indexes contains the letter.
 *
 *
 * @version 1.0 10/09/2019
 * @author Seunghwan Choi
 */

public class Level007 {
    /**
     *main method of level 007
     * User enters a text and a letter. find the number of the letter in the text
     * @param args not used
     */
    public static void main(String []args) {
        int wordCnt=0;
        int i=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = input.nextLine();
        System.out.print("Enter a letter: ");
        Character c = input.next().charAt(0);

        while(i<text.length()){
            if(c.equals(text.charAt(i))){
                wordCnt = wordCnt + 1;
            }
            i = i + 1;
        }
        System.out.println("There are "+wordCnt+ " " + c +"'s in the text.");
    }
}
