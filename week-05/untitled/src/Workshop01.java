public class Workshop01 {

    public static void main(String[] args){
        Car01 myCar = new Car01("red", 1600);

        System.out.printf("Just got a new Car, it's %s and has a %d cc Engine!\n",
                myCar.colour , myCar.engine // replace this stuff with the way we get those attributes about myCar
        );
    }
}