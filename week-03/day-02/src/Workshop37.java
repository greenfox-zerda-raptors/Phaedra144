/**
 * Created by ${SzilviaB} on 2016. 11. 03..
 */
public class Workshop37 {
    public static void main(String[] args) {
        // Write a program which has this output
        //# # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        // The # character should be replacable, hence store it in a variable
        char x = 35;
        String y = "";
        for (int i = 0; i < 5; i++) {
            for (int h = 0; h < 4; h++) {
                if (i % 2 == 1) {
                    y = x + " ";
                    System.out.print(y);
                } else {
                    y = " " + x;
                    System.out.print(y);
                }
            }
                System.out.println(y);
            }
        }
    }
