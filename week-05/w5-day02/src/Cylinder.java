/**
 * Created by ${SzilviaB} on 2016. 12. 01..
 */
public class Cylinder extends Circle02 {

    public int height;

    public Cylinder(int height){
        super();
        this.height = height;
    }

    public Cylinder(int radius, int height){
        super(radius);
        this.height = height;
    }

    public Cylinder(int radius, int height, String colour){
        super(radius, colour);
        this.height = height;
    }

    public double getVolume(){
        double v = getRadius() * getRadius() * Math.PI * height;
        return v;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
