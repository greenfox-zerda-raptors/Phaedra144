import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ${SzilviaB} on 2016. 11. 07..
 */
public class Workshop05arraylisttoarray {
    public static void main(String... args) {
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));
        // Copy every element of "numList" to an Array

        Integer[] array = numList.toArray(new Integer[0]);

        System.out.println(numList);

        int[] result = new int[numList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = numList.get(i);
        }
        System.out.println(numList);


        }
    }

