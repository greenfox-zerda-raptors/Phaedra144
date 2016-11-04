import java.util.Arrays;

/**
 * Created by ${SzilviaB} on 2016. 11. 04..
 */
public class Workshop03 {
    public static void main(String[] args) {
        int[] r = new int[] {54, 23, 66, 12};
        // add the second the third
        r[2] = r [1];
        System.out.println(Arrays.toString(r));
        int x = r [1] + r[2];
        System.out.println(x);
    }
}
