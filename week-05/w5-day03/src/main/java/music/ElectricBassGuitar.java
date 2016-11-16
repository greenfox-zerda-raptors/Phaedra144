package main.java.music;

/**
 * Created by ${SzilviaB} on 2016. 11. 16..
 */
public class ElectricBassGuitar extends StringedInstrument {

    public ElectricBassGuitar (){
        this(4);
    }

    public ElectricBassGuitar(int numberOfStrings) {
        this.name = "Electric Bass Guitar";
        this.numberOfStrings = numberOfStrings;
        this.sound = "duum-du-dum";
    }
}
