/**
 * Created by ${SzilviaB} on 2016. 11. 30..
 */
public class Circle02 {

    private double radius = 1.0;
    private String colour = "red";
    private static int countCircle;


    public Circle02() {
        countCircle++;
    }

    public Circle02(double radius) {
        this.radius = radius;
        countCircle++;
    }

    public Circle02 (double radius, String colour){
        this.radius = radius;
        this.colour = colour;
        countCircle++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPerimeter() {
        double k = 2 * radius * Math.PI;
        return k;
    }

    private double getArea() {
        double t = radius * radius * Math.PI;
        return t;
    }

    public static int countObjects() {
        return countCircle;
    }

    @Override
    public String toString() {
        return "Circle02{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle02 c1 = new Circle02();
        System.out.println(c1);
        Circle02 c2 = new Circle02(5.0, "blue");
        System.out.println(c2);
        Circle02 c3 = new Circle02(1.1);

        c1.setRadius(4.0);
        c1.setColour("pink");
        System.out.println(c1);
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColour());

        System.out.printf("The area is: %.2f%n", c1.getArea());
        System.out.printf("The circumference is: %.2f%n", c1.getPerimeter());

        System.out.println("The number of created circles are = " + Circle02.countObjects());


    }
}