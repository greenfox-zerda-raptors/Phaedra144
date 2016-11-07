import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by ${SzilviaB} on 2016. 11. 07..
 */
public class Workshop13iteratorforloop {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
        // Print all elements of the list using a for loop and an Iterator
        Iterator indivItems = list.iterator();

        // When hasNext is called it returns true or false
        // depending on whether there are more items in the list

        for ( ;indivItems.hasNext(); ) {
            // next retrieves the next item in the ArrayList
            System.out.println(indivItems.next());

        }
    }
}
