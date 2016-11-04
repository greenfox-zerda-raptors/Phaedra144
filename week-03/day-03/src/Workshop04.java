import java.util.Arrays;

/**
 * Created by ${SzilviaB} on 2016. 11. 04..
 */
public class Workshop04 {
    public static void main(String[] args) {
        int[] s = new int[] { 1, 2, 3, 8, 5, 6 };
        // change the 8 to 4
//          s[3] = 4;
//        System.out.println(Arrays.toString(s));

        int indexOfArray = getArrayIndex(s, 8);
        s[indexOfArray] = 4;
        System.out.println(Arrays.toString(s));
}
    public static int getArrayIndex(int[] arr,int value) {
        for(int i=0;i<arr.length;i++)
            if(arr[i]==value) {
                return i;}
        return -1;

    }
}