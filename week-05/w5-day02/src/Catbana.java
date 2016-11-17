// Cat is a Subclass of Animal
// You create subclasses with the extends keyword
// Now Catbana has all the Methods and Fields that Animal defined
// This is known as inheritance because Catbana inherits all
// the methods and fields defined in Animal

public class Catbana extends Animalbana{

    // You can add new fields to the subclass
    public String favToy = "Yarn";

    // You can add new methods
    public void playWith(){

        System.out.println("Yeah " + favToy);

    }

    // Here I overrode the Animal walkAround method
    public void walkAround(){

        // this refers to a specific object created of type Catbana

        System.out.println(this.getName() + " stalks around and then sleeps");

    }

    public String getToy(){

        return this.favToy;

    }

    public Catbana(){

    }

    public Catbana(String name, String favFood, String favToy){

        // super calls the constructor for the super class Animal

        super(name, favFood);

        // We set the favToy value in Catbana because it doesn't
        // exist in the Animal class

        this.favToy = favToy;

    }

}