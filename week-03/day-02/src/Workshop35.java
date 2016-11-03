/**
 * Created by ${SzilviaB} on 2016. 11. 03..
 */
public class Workshop35 {
    public static void main(String[] args) {
        // Write a program which has this output
        // 1******
        // 12*****
        // 123****
        // 1234***
        // 12345**
        // 123456*
        // 1234567
        String x = "*******";
        for (int i = 1; i < 8; i++)
        {
            x = x.replaceFirst("\\*", Integer.toString(i));
        System.out.println(x);
        }
    }
}
