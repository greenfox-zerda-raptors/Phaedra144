/**
 * Created by ${SzilviaB} on 2016. 11. 14..
 */
public class Car08 {
    private int engine;
    private String colour;
    private int kmOdometer;
    private String type;
    private static int countCar;

    //Add something here to access the various fields, itt hozzuk letre a prototipust, ezzel a constructorral, nem kell this. minden esetben
//    public Car08(){
//        engine = 2800;
//        colour = "green";
//        type = "Beamer";
//        kmOdometer = 42521;
//    }
    public Car08(String type, String colour) {
        this.type = type;
        this.colour = colour;
        this.kmOdometer = 10;
        this.engine = 1600;
    }
    public Car08(int engine, int kmOdometer) {
        this.engine = engine;
        this.kmOdometer = kmOdometer;
        this.colour = "red";
        this.type = "Mazda";
    }
    public Car08(String type, String colour, int engine, int kmOdometer){
        this.colour = colour;
        this.engine = engine;
        this.type = type;
        this.kmOdometer = kmOdometer;

    }

    public Car08(String colour, String type, int engine) {
        this.colour = colour;
        this.type = type;
        this.engine = engine;
        countCar++;
    }

    public static int getCount() {
        return countCar;
    }


    public void drive(int drivenKm) {
        if(drivenKm < 20){
            System.out.printf("brrrm, %s %s just drove around town " + drivenKm + " clicks.\n", colour, type);
        }
        else if(drivenKm < 50){
            System.out.printf("brrm, screech, brrm, screech; %s %s commuted " + drivenKm + " clicks.\n", colour, type);
        }
        else {
            System.out.printf("whee, %s %s " + drivenKm + " clicks.\n", colour, type);
        }
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",type,
                colour , engine, kmOdometer + drivenKm);
    }

    @Override
    public String toString() {
        return String.format("This %s is %s, has %d cc engine and clocked %d km's", type, colour, engine, kmOdometer);
    }





    //getters to refer myCar the basic prototype

    public String getType() {
        return type;
    }
    public String getColour() {
        return colour;
    }
    public int getEngine() {
        return engine;
    }
    public int getKmOdometer() {
        return kmOdometer;
    }


//here we can change the prototype and set other values to the fields

    public void setType(String type) {
        this.type = type;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setEngine(int engine) {
        this.engine = engine;
    }
    public void setKmOdometer(int kmOdometer) {
        this.kmOdometer = kmOdometer;
    }
}