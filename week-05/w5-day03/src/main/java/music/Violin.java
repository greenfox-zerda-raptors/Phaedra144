package main.java.music;

/**
 * Created by ${SzilviaB} on 2016. 11. 16..
 */
public class Violin extends StringedInstrument {

    public Violin(){
        this(4);
    }

    public Violin(int numberOfStrings) {
        this.name = "Violin";
        this.numberOfStrings = numberOfStrings;
        this.sound = "screeches";
    }
}
