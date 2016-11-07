import java.util.ArrayList;

/**
 * Created by ${SzilviaB} on 2016. 11. 07..
 */
public class Workshop01arraylist {
    public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    // Add multiple elements to the list and print the number of the elements
        arrayList.add("Jack Ryan");
        arrayList.add("John Smith");
        arrayList.add("Dalai Lama");
        arrayList.add("52");


    System.out.println(arrayList.size());
}

}
