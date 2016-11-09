/**
 * Created by ${SzilviaB} on 2016. 11. 05..
 */
import java.util.Scanner;
public class Workshop22 {
    public static void main(String... args) {
        // create a function which prints the input String parameters (can have multiple number of arguments) nem egy stringet kér be, hanem többet is, akár egy array, de akár int-et is meg tudunk határozni ...-al. A main a parancssor.
//        typeIn();
//        https://www.tutorialspoint.com/javaexamples/method_varargs1.htm
        System.out.println();
        paramprinter(5, "hello", "bello");

    }
    public static void paramprinter(int i, String... x) {
        for(String s : x){
            System.out.println(s + i);
        }

//    public static void typeIn(){
//        Scanner userInput = new Scanner(System.in);
//        System.out.print("Give a string:");
//        String val = userInput.next();
//        System.out.print(val);
    }

}
