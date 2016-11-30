import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by ${SzilviaB} on 2016. 11. 30..
 */
public class Garage extends ArrayList<Car08> {
    ArrayList<Car08> garage = new ArrayList<>();

    ArrayList<String> colors = new ArrayList<String>(Arrays.asList("white", "blue", "red", "silver", "black", "green", "banana"));
    ArrayList<String> makes = new ArrayList<String>(Arrays.asList("toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes"));
    ArrayList<Integer> engineSizes = new ArrayList<>(Arrays.asList(1100, 1400, 1600, 1800, 2500));

    public Garage() {
        this.addRandomCar(5);

    }

    private void addRandomCar(int ct) {
        Random rand = new Random();
        for (int i = 0; i < ct; i++) {
            int color = rand.nextInt(colors.size());
            int brand = rand.nextInt(makes.size());
            int cc = rand.nextInt(engineSizes.size());
            Car08 myRandomCar = new Car08(colors.get(color), makes.get(brand), engineSizes.get(cc));
            garage.add(myRandomCar);
        }
    }

    public void addCar(Car08 c){
         garage.add(c);
    }

    public String toString() {
        for (Car08 oneCar : garage) {
            System.out.println(oneCar);

        }
        return "There are " + garage.size() + " cars in the garage.";
    }
}
