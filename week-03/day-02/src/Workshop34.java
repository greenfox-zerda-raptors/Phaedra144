/**
 * Created by ${SzilviaB} on 2016. 11. 03..
 */
public class Workshop34 {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".
        for(int i = 1; i <= 100; i++) {                    // count from 1 to 100
            if (((i % 3) == 0) && ((i % 5) == 0)){           // A multiple of both?
                System.out.print("fizzbuzz");}
            else if ((i % 3) == 0){ System.out.print("fizz");} // else a multiple of 5?
            else if ((i % 5) == 0){ System.out.print("buzz");}// else a multiple of 7?
            else {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
