import java.util.ArrayList;

/**
 * Created by ${SzilviaB} on 2016. 11. 15..
 */
public class Person {
    String name;
    int age;

    public Person () {

    }

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

