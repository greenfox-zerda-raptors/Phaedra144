/**
 * Created by ${SzilviaB} on 2016. 11. 15..
 */
public class Workshop03 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println("Testing Animal");
        // how does it speak, sleep, and tell me about its lifeExpectancy and if its a carnivore
        animal.speak();
        animal.sleep();
        System.out.println(animal.toString());

        System.out.println("\nTesting Bird");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore
        bird.speak();
        bird.sleep();
        System.out.println(bird.toString());

        System.out.println("\nTesting Dog");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        dog.speak();
        dog.sleep();
        dog.beg();
        System.out.println("And a dog: " + dog.toString() + "and" + dog.hasTail);


        System.out.println("\nTesting Dog2");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        Animal dog2 = new Dog();
        dog2.speak();
        dog2.sleep();
        Dog y = (Dog) dog2;
        y.lifeExpectancy = 22;
        y.hasTail = false;
        y.beg();
        System.out.println("And a dog2 cast as (Dog) Y: " + y.toString() + "and " + y.hasTail);


        System.out.println("\nTesting Dog 'd'");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        Dog d = new Dog();
        d.speak();
        d.sleep();

        System.out.println("And a dog: " + d.toString());

    }
}
