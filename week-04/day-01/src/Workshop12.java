import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ${SzilviaB} on 2016. 11. 07..
 */
public class Workshop12 {
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        ArrayList listTwo = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16));
        if (list.containsAll(listTwo)) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
