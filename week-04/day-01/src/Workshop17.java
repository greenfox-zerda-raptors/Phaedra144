import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ${SzilviaB} on 2016. 11. 07..
 */
public class Workshop17 {
    static void trimAll(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            strings.set(i, strings.get(i).trim());
        }
    }

    public static void main(String... args) {
        List<String> strList = new ArrayList<String>(Arrays.asList("   first", "second   ", "  third ", "fourth", "    fifth "));
        trimAll(strList);
        for (String str : strList) {
            System.out.format("\"%s\"%n", str);
        }
    }
}
