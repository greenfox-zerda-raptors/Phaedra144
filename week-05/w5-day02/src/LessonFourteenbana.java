public class LessonFourteenbana {

    public static void main(String[] args){

        // I create a Animal object named genericAnimal

        Animalbana genericAnimal = new Animalbana();
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);


        // I create a Catbana class like any other
        Catbana morris = new Catbana("Morris", "Tuna", "Rubber Mouse");

        // Print out the name, favFood and favToy
        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);

        // You can also create classes based on the super class

        Animalbana tabby = new Catbana("Tabby", "Salmon", "Ball");

        // You pass objects like any other field
        acceptAnimal(tabby);
    }

    public static void acceptAnimal(Animalbana randAnimal){

        // Gets the name and favFood for the Animal passed

        // This is Polymorphism
        // The interpreter automatically figures out what type
        // of Animal it's dealing with and checks to make sure
        // if methods were overwritten that they are called
        // instead
        randAnimal.walkAround();

        // The interpreter won't find anything that doesn't
        // originally exist in the Animal class however
        // System.out.println(randAnimal.favToy); Throws an ERROR

        // If you want access to fields or methods only found
        // in the Catbana class you have to cast the object to
        // that specific class first
        Catbana tempCatbana = (Catbana) randAnimal;

        System.out.println(tempCatbana.favToy);

        // You could also cast the object directly like this
        System.out.println(((Catbana) randAnimal).favToy);

        // You can use instanceof to check what type of object
        // you have. This results in a positive for Animal
        // and for Catbana
        if (randAnimal instanceof Catbana)
        {
            System.out.println(randAnimal.getName() + " is a Catbana");
        }

    }

}