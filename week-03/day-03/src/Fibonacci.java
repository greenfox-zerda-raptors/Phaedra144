/**
 * Created by ${SzilviaB} on 2016. 11. 08..
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }

    public static int fibo(int number){
        if (number < 3){
            return 1;
        }
        return fibo (number -1) + fibo (number -2);
    }
}
