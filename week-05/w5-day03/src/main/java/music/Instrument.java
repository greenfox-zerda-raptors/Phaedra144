package main.java.music;

/**
 * Created by ${SzilviaB} on 2016. 11. 16..
 */
abstract public class Instrument {

    protected String name;

    public Instrument(String name){
        this.name = name;
    }

    public abstract void play ();




}
