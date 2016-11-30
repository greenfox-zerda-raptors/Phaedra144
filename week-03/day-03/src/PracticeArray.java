import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ${SzilviaB} on 2016. 11. 29..
 */
public class PracticeArray {

    public static void main(String[] args) {


        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = merge(a,b);
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");
    }

    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i;
        for (i = 0; i < a.length; i++)
            c[i] = a[i];

        for (int j = 0; j < b.length; j++)
            c[i++] = b[j];
        return c;
    }
}


