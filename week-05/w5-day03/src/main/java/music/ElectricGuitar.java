package main.java.music;

/**
 * Created by ${SzilviaB} on 2016. 11. 16..
 */
public class ElectricGuitar extends StringedInstrument {


    public ElectricGuitar (){
        super("Electric Guitar",6, "twangs");
    }


    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar", numberOfStrings, "twangs");
    }
}
