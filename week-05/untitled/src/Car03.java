/**
 * Created by ${SzilviaB} on 2016. 11. 14..
 */
public class Car03 {

    //note that these are now private!
    private int engine;
    private String colour;
    private int kmOdometer;
    private String type;

    //Add something here to access the various fields, itt hozzuk letre a prototipust
    public Car03(){
        engine = 2800;
        colour = "green";
        type = "Beamer";
        kmOdometer = 42521;
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


