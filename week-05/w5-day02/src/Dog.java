/**
 * Created by ${SzilviaB} on 2016. 11. 15..
 */
public class Dog extends Animal {

    public boolean hasTail = true;

    public Dog() {
        super("new dog", 15, true);

    }

    public void speak(){
        System.out.println("barks");
    }

    public void beg(){
        System.out.println("begs");
    }



}
