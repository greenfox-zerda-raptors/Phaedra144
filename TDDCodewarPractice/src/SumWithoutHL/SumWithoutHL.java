package SumWithoutHL;

import java.util.Arrays;

/**
 * Created by ${SzilviaB} on 2017. 01. 02..
 */
public class SumWithoutHL {

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 3) {
            return 0;
        }
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum - min - max;

    }
}
