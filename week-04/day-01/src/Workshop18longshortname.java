/**
 * Created by ${SzilviaB} on 2016. 11. 07..
 */
public class Workshop18longshortname {
    public static void main(String... args){
        String example = "A long example string";

        example.replaceAll("long", "short");
        String example2 = example.replaceAll("long", "short");
        // I would like to replace "long" with "short" in this example, but it has a problem. Please fix it! Don't forget that String is immutable
        // Expected ouput: A short example string


        System.out.println(example2);
    }
}
