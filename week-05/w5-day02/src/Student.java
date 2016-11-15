import java.util.ArrayList;

/**
 * Created by ${SzilviaB} on 2016. 11. 15..
 */
public class Student extends Person {

    public Student(String name, int age) {
        super(name, age);
    }

    ArrayList<Integer> greenfox = new ArrayList<>();

    public void addGrade(int grade) {
        if (grade < 6 && grade > 0) {
            greenfox.add(grade);
        } else {
            System.out.println("invalid value");
        }
    }

    public double getAverage() {
        double sum = 0;
        for (int i=0; i < greenfox.size(); i++){
            sum = sum + greenfox.get(i);
    }

        return sum / greenfox.size();
    }

    @Override
    public String toString() {
        return super.toString() + "average: " + getAverage();
    }
}



