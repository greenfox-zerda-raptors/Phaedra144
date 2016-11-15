/**
 * Created by ${SzilviaB} on 2016. 11. 14..
 */
public class Workshop02 {
    public static void main(String[] args){
        Car02 myCar1 = new Car02("Mazda", "red", 1600, 12312);
        Car02 myCar2 = new Car02("Ford", "silver", 2500, 152312);
        Car02 myCar3 = new Car02("Beamer", "green", 2800, 42521);

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",myCar1.type,
                myCar1.colour , myCar1.engine, myCar1.kmOdometer
        );
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",myCar2.type,
                myCar2.colour , myCar2.engine, myCar2.kmOdometer
        );
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",myCar3.type,
                myCar3.colour , myCar3.engine, myCar3.kmOdometer
        );
    }
}
