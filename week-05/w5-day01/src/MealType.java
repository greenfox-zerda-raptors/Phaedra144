import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ${SzilviaB} on 2017. 01. 09..
 */


public class MealType {
    private long id;
    private String name;
    private int sequence;

    public MealType(int sequence) {
        this.name = typeOptions.get(sequence);
    }

    private final ArrayList<String> typeOptions = new ArrayList<>(
            Arrays.asList("Breakfast", "Elevenses", "Lunch", "Snack", "Dinner", "Midnight Snack"));

    private final ArrayList<Integer> sequences = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5, 6));


}

