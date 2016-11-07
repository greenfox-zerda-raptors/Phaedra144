/**
 * Created by ${SzilviaB} on 2016. 11. 07..
 */
import java.lang.StringBuilder;

public class Workshop19stringbuilderaddrename {
    public static void main(String... args){
        String name = "World";
        StringBuilder builder = new StringBuilder("Heljo");
        // Please change "Heljo" to "Hello" and add name ("World") to the end of the string builder
        builder.replace(3, 4, "l");
        builder.append(" World!");
        System.out.println(builder);
    }
}
