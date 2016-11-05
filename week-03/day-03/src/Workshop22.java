/**
 * Created by ${SzilviaB} on 2016. 11. 05..
 */
import java.util.Scanner;
public class Workshop22 {
    public static void main(String... args) {
        // create a function which prints the input String parameters (can have multiple number of arguments)
        typeIn();

    }
    public static void typeIn(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Give a string:");
        String val = userInput.next();
        System.out.print(val);
    }

}
