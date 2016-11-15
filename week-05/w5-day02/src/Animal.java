/**
 * Created by ${SzilviaB} on 2016. 11. 15..
 */
public class Animal {
    int lifeExpectancy;
    boolean isCarnivore;

    public Animal() {
        this.lifeExpectancy = 10;
        this.isCarnivore = false;
        System.out.println("An animal is created.");
    }
    public Animal(String type, int lifeExpectancy, boolean isCarnivore) {
        this.lifeExpectancy = lifeExpectancy;
        this.isCarnivore = isCarnivore;
        System.out.println(type);
    }

//    public Animal (String type){
//        this();
//        System.out.println( type + " animal is created.");
//    }
    public void speak(){
        System.out.println("speaks");
    }

    public String toString(){
        return String.format("isCarnivore=%b,lifeExpectancy=%d", isCarnivore, lifeExpectancy);
    }


    public void sleep (){
        System.out.println("The animal is sleeping.");
    }

    public void eat (){
        System.out.println("The animal is eating.");
    }


}
