import java.util.Scanner;

/**
 * Created by ${SzilviaB} on 2016. 11. 10..
 */
public class GuessRandomly {

    static Scanner inputNum = new Scanner(System.in);

    static int yourTopNumber;

    static int randomNumber;

    public static void main(String[] args) {

        System.out.println("Enter a top number in the range, or 0? ");

        int yourTopNum = inputNum.nextInt();

        System.out.println("Okay, I've got a number. You should be able to figure that out in 6 goes, let's begin. \n" +
                "Guess? ");

        int yourGuess = inputNum.nextInt();
        int max = 6;
        for (int i = 0; i < max; i++) {
            if (yourGuess < randomNumber) {
                System.out.println("Nope, you're high. You've got " + max-- + " guesses left.  Guess?");
            } else if (yourGuess > randomNumber) {
                System.out.println("Nope, you're low. You've got " + max-- + " guesses left.  Guess?");
            } else {
                System.out.println("Yippee, I was running out of insults.");
            }
            System.out.println("It was fun playing. Bye!");

        }


    }

    public static int getRandomNum() {
        // Creates a random number between 0 and 50
        // Since randomNumber is a class variable you don't have to declare, or define its type
        // If int randomNumber was declared in this method it wouldn't effect the global variable named randomNumber

        randomNumber = (int) (Math.random() * yourTopNumber + 1);
        return randomNumber;

    }

}
