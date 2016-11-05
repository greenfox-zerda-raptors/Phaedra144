/**
 * Created by ${SzilviaB} on 2016. 11. 05..
 */
public class Prime_number{
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++){
            if (isPrime(i) == true){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int number) {
        for(int check = 2; check < number; ++check) {
            if(number % check == 0) {
                return false;
            }
        }
        return true;
    }
}
