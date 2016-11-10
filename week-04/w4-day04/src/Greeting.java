import java.util.Scanner;

/**
 * Created by ${SzilviaB} on 2016. 11. 09..
 */
public class Greeting {

    static Scanner name = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello! What is your name? ");


        String yourName = name.next();

        System.out.println("Welcome " + yourName + "! It is nice meeting you!");



    }

}
