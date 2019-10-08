import java.util.Random;
import java.util.Scanner;
import java.lang.*;

/**
 * CSE3040 HW1
 * Level006.java
 * Purpose: Generates 7 random integers range of 1 - 45 and takes user inputs. Prints the number of correct numbers.
 *
 *
 * @version 1.0 10/09/2019
 * @author Seunghwan Choi
 */

public class Level006 {
    /**
     *main method of level 006
     * Generator initializes answer. Takes 7 user inputs in range of 1-45. Print how many of it is right
     * @param args not used
     */
    public static void main(String []args){
        Random generator = new Random();
        int lottoNum=0;
        int testNum=0;
        boolean duplicateFlag=false;
        Integer arrLotto[] = new Integer[7];
        Integer arrUser[] = new Integer[7];
        int answerCnt=0;
        Scanner input = new Scanner(System.in);

        /**
         * remove duplicate lotto numbers. do while necessary when utilizing duplicateFlag
         */
        while(lottoNum < 6){
            do {
                duplicateFlag = false;
                arrLotto[lottoNum] = generator.nextInt(44) + 1;
                testNum = 0;
                while(testNum < lottoNum){
                    if(arrLotto[testNum].equals(arrLotto[lottoNum])){
                        duplicateFlag = true;
                    }
                    testNum++;
                }
            }while(duplicateFlag);
            lottoNum = lottoNum + 1;
        }
        testNum=0;
        while(testNum < 6) {
            System.out.print("[Lotto] Enter number #"+(testNum+1)+"(1-45): ");
            arrUser[testNum] = input.nextInt();
            testNum = testNum + 1;
        }
        System.out.print("This week's lotto numbers: ");
        lottoNum = 0;
        while(lottoNum < 6){
            System.out.printf(" %d",arrLotto[lottoNum]);
            testNum = 0;
            while(testNum < 6){
                if(arrLotto[lottoNum].equals(arrUser[testNum])){
                    answerCnt = answerCnt + 1;
                }
                testNum ++;
            }
            lottoNum = lottoNum + 1;
        }
        System.out.println();
        System.out.println("You matched "+answerCnt+" numbers.");
    }
}
