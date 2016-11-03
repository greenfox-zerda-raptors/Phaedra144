/**
 * Created by ${SzilviaB} on 2016. 11. 03..
 */
public class Workshop36 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replacable, hence store it in a variable
        char x = 35;
        String y = "";
        for (int i = 0; i < 5; i++) {
            y = x + " " + x + " " + x + " " + x + " " + x;
            System.out.println(y);
        }
    }

}
