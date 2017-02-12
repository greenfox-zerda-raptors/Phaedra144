package Persistence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${SzilviaB} on 2017. 01. 21..
 */
public class Persist {


    public static int persistence(long n) {

        List<Integer> digits = getDigits((int) n);
        int newInt = 1;
        int counter = 0;

        while (digits.size() < 2){
            for(int digit : digits){
                newInt *= digit;
                digits = getDigits(newInt);
                counter++;
            }

        }


        return counter;
    }

    private static List<Integer> getDigits(int n) {
        List<Integer> digits = new ArrayList<Integer>();
        while(n > 0) {
            digits.add((int) (n % 10));
            n /= 10;
        }
        return digits;
    }


}
