import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ${SzilviaB} on 2016. 11. 07..
 */
public class Workshop02arraytoarraylist {
    public static void main(String... args){
        String[] numbers = new String[] { "one", "two", "three", "four", "five"};
        // Initialize the arrayList using the numbers array
        ArrayList arrayList = new ArrayList(Arrays.asList(numbers)); //

        System.out.println(arrayList);
    }
}
