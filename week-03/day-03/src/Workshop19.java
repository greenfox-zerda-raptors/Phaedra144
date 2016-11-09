/**
 * Created by ${SzilviaB} on 2016. 11. 05..
 */
public class Workshop19 {
    public static void main(String[] args) {
        // create a function that returns it's input factorial

        System.out.println(fact(1));
    }
    public static int fact(int length){
        int sum = 1; /*ha csak a sumot deklaráljuk, akkor defaultként 0-t hív meg, muszáj  1-et hívni, hogy összeszorozva ne legyen 0*/
        for (int i = 1; i <= length; i++ ){
            sum *= i;
        }
        return sum;
    }
}
