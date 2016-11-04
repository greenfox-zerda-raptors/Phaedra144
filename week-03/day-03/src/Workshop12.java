/**
 * Created by ${SzilviaB} on 2016. 11. 04..
 */
public class Workshop12 {
    public static void main(String[] args) {
        // Swap the first element of the array
        // Expected outpt: third second first
        String[] abc = new String[]{"first", "second", "third"};

        for (int i = abc.length-1; i >= 0; i--) {
            System.out.print(abc[i] + " ");
        }
    }
}
