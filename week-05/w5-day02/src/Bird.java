/**
 * Created by ${SzilviaB} on 2016. 11. 15..
 */
public class Bird extends Animal {
    public Bird() {
        super("new bird", 2, false);
    }
    public void speak(){
        System.out.println("chirp");
    }

    public void fly(){
        System.out.println("The bird can fly.");
    }

    public void sleep (){
        System.out.println("The bird is sleeping.");
        super.sleep();
    }
    public void eat (){
        super.eat();
    }

    public void nightyNight(){
        super.eat();
        sleep();
    }


}
