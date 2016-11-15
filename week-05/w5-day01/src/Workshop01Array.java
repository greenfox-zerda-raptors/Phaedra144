import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by ${SzilviaB} on 2016. 11. 14..
 */
public class Workshop01Array {
    public static void main(String[] args) {

            ArrayList<String> colors = new ArrayList<String>(Arrays.asList("white", "blue", "red", "silver", "black", "green", "banana"));
            ArrayList<String> makes = new ArrayList<String>(Arrays.asList("toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes"));
            ArrayList<Integer> engineSizes = new ArrayList<>(Arrays.asList(1100, 1400, 1600, 1800, 2500));
            ArrayList<Car05> lsCars = new ArrayList<>();

            Random rand = new Random();
            int color = 0;
            int brand = 0;
            int cc = 0;

            for (int i = 0; i < 10; i++) {
                color = rand.nextInt(colors.size());
                brand = rand.nextInt(makes.size());
                cc = rand.nextInt(engineSizes.size());
                Car05 myRandomCar = new Car05(colors.get(color), makes.get(brand), engineSizes.get(cc));
                lsCars.add(myRandomCar);
            }
//            System.out.println(lsCars.get(0).toString());
//            System.out.println(lsCars.get(1).toString());
            lsCars.get(0).drive(20);
            lsCars.get(1).drive(400);


    }


}

