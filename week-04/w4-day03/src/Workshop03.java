
/**************************************************************************************************
 * Workshop: Practice With Exceptions: Arithmetic Overflow
 * Write a routine that catches an arithmetic overflow (that is, larger than the Integer.MAX_VALUE)
 * Note that Integer and int are NOT the same thing; and that Integer offers you properties such as
 * MAX_VALUE.
 * Use the Scanner routine to take the input from the keyboard; if the value is okay then
 * print "Yum", and then 1/2 the value entered.  For example:-
 * INPUT or 0 to end?  12334556677723131
 * Invalid value
 * (and the Java exception messages)
 * INPUT or 0 to end?  12345678
 * Yum 1234
 * INPUT or 0 to end?  123456
 * Yum 123
 * INPUT or 0 to end? 0
 * Bye!
 **************************************************************************************************/

import java.util.*;
import java.util.Scanner; // Library that allows us to capture user input

public class Workshop03 {

    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("INPUT or 0 to end? ");
        int num = checkInputNum();

        if (num != 0) {
            String halfNumber = Integer.toString(num);
            System.out.println("Yum " + halfNumber.substring(0, halfNumber.length()/2));
        }
        else {
            System.out.println("Bye!");
        }

    }
    public static int checkInputNum() {
        try {
            return userInput.nextInt(); /*probalja meg visszaadni a bemeno erteket, ha helyes*/
        } catch (InputMismatchException e) {
            System.out.println("Not valid number or too long\n" + e.getMessage());
            return 0;
        }

    }
} //Workshop03

