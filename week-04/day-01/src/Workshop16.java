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
        for (int element : al) {
            int even = al.get(element) % 2;
            if (even == 0) {
                al.remove(element);
            }
            System.out.println(al);
        }
    }
}
//    Got the error below, why is that?
// Exception in thread "main" java.util.ConcurrentModificationException
//        at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
//        at java.util.ArrayList$Itr.next(ArrayList.java:851)
//        at Workshop16.main(Workshop16.java:12)
//        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.lang.reflect.Method.invoke(Method.java:498)
//        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)