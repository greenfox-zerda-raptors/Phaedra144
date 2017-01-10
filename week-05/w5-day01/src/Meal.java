import java.util.Date;

/**
 * Created by ${SzilviaB} on 2017. 01. 09..
 */
public class Meal {

    private Date createdAt;
    private String name;
    private int calorie;
    public MealType type;

    public Meal (String name, int calorie, MealType type){
        this.createdAt = new Date();
        this.name = name;
        this.calorie = calorie;
        this.type = type;
    }

}
