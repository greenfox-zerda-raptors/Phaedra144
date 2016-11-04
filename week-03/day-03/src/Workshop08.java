import java.util.Arrays;

/**
 * Created by ${SzilviaB} on 2016. 11. 04..
 */
public class Workshop08 {
    public static void main(String[] args) {
        // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        // Task 2: Print this two dimensional array to the output
        int[][] twoDimA = new int[4][4];
        for (int i = 0; i < twoDimA.length; i++) {
            for (int j = 0; j < twoDimA[i].length; j++) {
                twoDimA[i][j] = 0;

                if (i == j) {
                    twoDimA[i][j] = 1;

                }
                System.out.print(twoDimA[i][j] + " ");
            }
          System.out.println("");

        }
    }
}

