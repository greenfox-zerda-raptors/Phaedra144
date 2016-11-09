import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by ${SzilviaB} on 2016. 11. 07..
 */
public class Workshop16 {
    public static void main(String... args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        // Fix this code fragment! It should remove every even number from the list.

//        for (int i = 0, i < al.size(); i++) {
//            Integer even = al.get(i) % 2;
//            if (even == 0) {
//                al.remove(even);
//            }
//            System.out.println(al);
//        }

        Iterator iterator = al.iterator();
        while (iterator.hasNext()){
            int element = (Integer) iterator.next();
            if (element % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(al);

    }
}
//    Got the error below, why is that? Mert nem birja ebben a formaban.
// Exception in thread "main" java.util.ConcurrentModificationException
//        at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
//        at java.util.ArrayList$Itr.next(ArrayList.java:851)
//        at Workshop16.main(Workshop16.java:12)
//