/**
 * Created by ${SzilviaB} on 2016. 11. 07..
 */
public class Workshop23 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("first second third third");
        // Accidentally I inserted the word "third" twice. Your task is to change the last word to "fourth"
        // Expected outpt: first second third fourth
        sb.delete(17, 23);
        sb.append(" fourth");
        System.out.println(sb.toString());
    }
}
