import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by ${SzilviaB} on 2016. 11. 14..
 */
public class Workshop08 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>(Arrays.asList("white", "blue", "red", "silver", "black", "green", "banana"));
        ArrayList<String> makes = new ArrayList<String>(Arrays.asList("toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes"));
        ArrayList<Integer> engineSizes = new ArrayList<>(Arrays.asList(1100, 1400, 1600, 1800, 2500));
        ArrayList<Car08> lsCars = new ArrayList<>();

        Random rand = new Random();
        int color = 0;
        int brand = 0;
        int cc = 0;

        System.out.println("Number of Cars Available = " + Car08.getCount());

        Car08 myFirstCar = new Car08(colors.get(color), makes.get(brand), engineSizes.get(cc));
        Car08 mySecondCar = new Car08(colors.get(color), makes.get(brand), engineSizes.get(cc));
        Car08 myThirdCar = new Car08("red", "Volvo", 1800);

        System.out.println("Number of Cars Available = " + Car08.getCount());

        int ct = 10;
        for (int i = 0; i < ct; i++) {
            color = rand.nextInt(colors.size());
            brand = rand.nextInt(makes.size());
            cc = rand.nextInt(engineSizes.size());
            Car08 myRandomCar = new Car08(colors.get(color), makes.get(brand), engineSizes.get(cc));
            lsCars.add(myRandomCar);
        }
//            System.out.println(lsCars.get(0).toString());
//            System.out.println(lsCars.get(1).toString());
//        lsCars.get(0).drive(20);
//        lsCars.get(1).drive(400);

        System.out.println("Number of Cars Available = " + Car08.getCount());
//        for (Car08 oneCar : lsCars){
//            System.out.println(oneCar);
//        }

        Garage garage = new Garage();
        garage.addCar(myThirdCar);
        System.out.println(garage);
    }


}