/**
 * Created by ${SzilviaB} on 2016. 11. 30..
 */
public class Circle {

    private int radius;
    private String name;
    private static int countCircle;


    public Circle(){
        this.name = "standardCircle";
        this.radius = 1;
        countCircle++;
    }

    public Circle (int radius, String name) {
        this.radius = radius;
        this.name = name;
        countCircle++;
    }

    public double getPerimeter(){
        double k = 2 * radius * Math.PI;
        return k;
    }

    private double getArea() {
        double t = radius * radius * Math.PI;
        return t;
    }

    public static int countObjects(){
        return countCircle;
    }

    @Override
    public String toString() {
        return String.format("The %s's perimeter is %.2f and its area is %.2f", name,getPerimeter(), getArea());
    }

    public static void main(String[] args) {
        Circle standardCircle = new Circle();
        Circle myCircle = new Circle(5, "myCircle");

        standardCircle.getPerimeter();
        standardCircle.getArea();

        myCircle.getPerimeter();
        myCircle.getArea();

        System.out.println(standardCircle);
        System.out.println(myCircle);
        System.out.println("The number of created circles are = " + Circle.countObjects());



    }



}
