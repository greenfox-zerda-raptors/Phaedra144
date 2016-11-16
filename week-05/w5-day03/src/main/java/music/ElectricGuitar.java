package main.java.music;

/**
 * Created by ${SzilviaB} on 2016. 11. 16..
 */
public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar (){
        this(6);
    }

    public ElectricGuitar(int numberOfStrings) {
        this.name = "Electric Guitar";
        this.numberOfStrings = numberOfStrings;
        this.sound = "twangs";

    }
}
