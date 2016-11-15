/**
 * Created by ${SzilviaB} on 2016. 11. 14..
 */
public class Workshop03 {
    public static void main(String[] args){
        Car03 myCar = new Car03();
        Car03 myCar1 = new Car03();
        Car03 myCar2 = new Car03();

        myCar1.setType("Mazda");
        myCar1.setColour("red");
        myCar1.setEngine(1600);
        myCar1.setKmOdometer(12312);

        myCar2.setType("Ford");
        myCar2.setColour("silver");
        myCar2.setEngine(2500);
        myCar2.setKmOdometer(152312);


        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",myCar.getType(),
                myCar.getColour() , myCar.getEngine(), myCar.getKmOdometer()
        );
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar1.getType(),
                myCar1.getColour(), myCar1.getEngine(), myCar1.getKmOdometer()
        );
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar2.getType(),
                myCar2.getColour(), myCar2.getEngine(), myCar2.getKmOdometer()
        );
    }
}

