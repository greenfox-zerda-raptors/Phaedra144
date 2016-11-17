/**
 * Created by ${SzilviaB} on 2016. 11. 14..
 */
public class Car03 {

    //note that these are now private!
    private int engine;
    private String colour;
    private int kmOdometer;
    private String type;

    public int bla;

    //Add something here to access the various fields, itt hozzuk letre a prototipust
    public Car03(){
        this.engine = 2800;
        this.colour = "green";
        this.type = "Beamer";
        this.kmOdometer = 42521;
    }
    //getters to refer myCar the basic prototype

    public String getType() {
        return this.type;
    }

    public String getColour() {
        return this.colour;
    }

    public int getEngine() {
        return this.engine;
    }

    public int getKmOdometer() {
        return this.kmOdometer;
    }

    public int getBla() { return this.bla; }





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


