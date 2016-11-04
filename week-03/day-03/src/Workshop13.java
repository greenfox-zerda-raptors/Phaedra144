/**
 * Created by ${SzilviaB} on 2016. 11. 04..
 */
public class Workshop13 {
    public static void main(String[] args) {
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };
        // print the sum of all numbers in ah
        int sum = 0;
        for( int i : ah) {
            sum += i;
        }

        System.out.println(sum);
    }
}
