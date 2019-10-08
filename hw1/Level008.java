import java.util.*;
import java.lang.*;
/**
 * CSE3040 HW1
 * Level008.java
 * Purpose: Enter a text and a string. Print how many such strings exist in a text
 *
 *
 * @version 1.0 10/09/2019
 * @author Seunghwan Choi
 */
public class Level008 {

    /**
     *main method of level 008
     * User enters a text and a string. find the occerence of the input string
     * @param args not used
     */
    public static void main(String []args){
        Integer firstIndex=0;
        Integer matches=0;
        Integer i=0;
        Character temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.nextLine();
        System.out.print("Enter a String: ");
        String string = input.nextLine();
        while((firstIndex = text.indexOf(string.charAt(0),firstIndex)) != -1){
            i=0;
            while(i<string.length()){
                temp = string.charAt(i);
                if(!temp.equals(text.charAt(firstIndex+i))){
                    break;
                }
                else{
                    i++;
                }
            }
            if(i == string.length()){
                matches++;
            }
            firstIndex+=i;
        }
        System.out.println("I have found " + matches + " instances of \""+string+"\".");
    }
}
