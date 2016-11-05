/**
 * Created by ${SzilviaB} on 2016. 11. 05..
 */
public class Workshop18 {
    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter

        System.out.println(sumUp(5));
    }
    public static int sumUp(int length){
        int sum = 0;
        for (int i = 1; i <= length; i++ ){
            sum += i;
        }
        return sum;
    }
}
