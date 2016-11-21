import java.util.ArrayList;

/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */

public class Apple {

    public String getApple() {
        return "apple";
    }

    public int sumArray(ArrayList<Integer> aList) {
        int sum = 0;
        for (int i = 0; i < aList.size(); i++) {
            sum += aList.get(i);
        }
        return sum;
    }
}


