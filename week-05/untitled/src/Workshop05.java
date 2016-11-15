/**
 * Created by ${SzilviaB} on 2016. 11. 14..
 */
public class Workshop05 {
    public static void main(String[] args){
        Car05 myCar = new Car05();
        Car05 myCar1 = new Car05();
        Car05 myCar2 = new Car05();
        Car05 myCar05 = new Car05("Opel", "white", 1400, 25);
        Car05 myCar06 = new Car05("VW", "grey"); // defaults to 1600 cc, 10 kms
        Car05 myCar07 = new Car05(1100, 15); // defaults to a red Mazda

        myCar1.setType("Mazda");
        myCar1.setColour("red");
        myCar1.setEngine(1600);
        myCar1.setKmOdometer(12312);

        myCar2.setType("Ford");
        myCar2.setColour("silver");
        myCar2.setEngine(2500);
        myCar2.setKmOdometer(152312);

        myCar.drive(15);

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar1.getType(),
                myCar1.getColour(), myCar1.getEngine(), myCar1.getKmOdometer()
        );
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar2.getType(),
                myCar2.getColour(), myCar2.getEngine(), myCar2.getKmOdometer()
        );

        System.out.println(myCar05.toString());
        System.out.println(myCar06.toString());
        System.out.println(myCar07.toString());
    }
}
