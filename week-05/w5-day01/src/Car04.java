/**
 * Created by ${SzilviaB} on 2016. 11. 14..
 */
public class Car04 {
    //note that these are now private!
    private int engine;
    private String colour;
    private int kmOdometer;
    private String type;


    public void drive(int drivenKm) {
        int km = 0;
        if(drivenKm < 20){
            System.out.printf("brrrm, %s %s just drove around town" + drivenKm + "clicks.\n", colour, type);
        }
        else if(drivenKm < 50){
            System.out.printf("brrm, screech, brrm, screech; %s %s commuted " + drivenKm + " clicks.\n");
        }
        else {
            System.out.printf("whee, %s %s " + drivenKm + "clicks.\n");
        }
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",type,
                colour , engine, kmOdometer + drivenKm);
    }
    //Add something here to access the various fields, itt hozzuk letre a prototipust
    public Car04(){
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
