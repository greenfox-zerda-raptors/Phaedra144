import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ${SzilviaB} on 2016. 11. 10..
 */
public class GuessRandomly {

    static Scanner inputNum = new Scanner(System.in);

    static ArrayList<Integer> guesses = new ArrayList<Integer>();

    static int randomNumber;

    public static void main(String[] args) {

        boolean playing = true;
        int counter = 0;
        System.out.println("Enter a top number in the range, or 0? ");

        int yourTopNum = inputNum.nextInt();
        while (playing == true) {


            System.out.println("Okay, I've got a number. You should be able to figure that out in 6 goes, let's begin. \n" +
                    "Guess? ");

            getRandomNum(yourTopNum);

            int max = 5;
            while (guesses.size() < 6) {

                int yourGuess = inputNum.nextInt();

                if (guesses.contains(yourGuess)) {

                    System.out.println("You wrote the same number again. I am so generous I give you another chance, you numskull. ");
                    continue;
                } else {
                    guesses.add(yourGuess);
                }

                if (yourGuess > randomNumber) {
                    System.out.println("Nope, you're high. You've got " + max-- + " guesses left.");
                } else if (yourGuess < randomNumber) {
                    System.out.println("Nope, you're low. You've got " + max-- + " guesses left.");
                } else {
                    if (guesses.size() == 1 || guesses.size() == 2 || guesses.size() == 3 )
                        System.out.println("Congratulation, you guessed it in " + guesses.size() + " go!");

                    else System.out.println("Yippee, I was running out of insults.");
                    break;
                }

                // ide csak akkor ér el a kód, ha az előző if első két ágába futott bele
                if (guesses.size() == 4) {
                    System.out.println("You know, you seem like you are getting more desperate, running out of guesses soon. Next?");
                }
                if (guesses.size() == 5) {
                    System.out.println("I hope you are not planning a fortune teller career! Next?");
                }
                else if (guesses.size() == 6) {
                    System.out.println("Finally you couldn't figure out my number, mazbe next time, my slow friend.");
                }
            }


            System.out.println("Try again?  Enter a top number in the range, or 0?");
            int nextGame = inputNum.nextInt();
            if (nextGame != 0) {
                playing = true;
            } else {
                playing = false;
                System.out.println("It was fun playing. Bye!");
            }

        }

    }

    public static int getRandomNum(int yourTopNum) {
        // Creates a random number between 0 and 50
        // Since randomNumber is a class variable you don't have to declare, or define its type
        // If int randomNumber was declared in this method it wouldn't effect the global variable named randomNumber
        randomNumber = (int) (Math.random() * yourTopNum + 1);
        return randomNumber;

    }

}