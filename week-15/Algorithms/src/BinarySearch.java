import java.sql.Array;

/**
 * Created by ${SzilviaB} on 2017. 02. 07..
 */
public class BinarySearch {

    int first, last, middle;

    public static void main(String[] args) {
        BinarySearch testObj = new BinarySearch();
        int[] myArray = {2,5,6,8,9,15,22,34};

        System.out.println(testObj.binarySearch(64,myArray));
    }

    public boolean binarySearch(int key, int array[]) {
        first = 0;
        last = array.length - 1;
        middle = (first+last)/2;

        while (first <= last ) {

            if (array[middle] == key) {
                return true;
            }
            else if (array[middle] < key) {
                first = middle + 1;
            }
            else if (array[middle] > key) {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        return false;
    }
}
