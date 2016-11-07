import java.util.*;

/**
 * Created by ${SzilviaB} on 2016. 11. 07..
 */
public class Workshop14 {
    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
        // Add "a" to every string in al. Use an iterator!
        ListIterator<String> items = al.listIterator();
        for( ;items.hasNext(); )
        {
            String s = items.next();
            items += "a";

        }

        System.out.println(al);
    }
}
