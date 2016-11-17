package main.java.music;

/**
 * Created by ${SzilviaB} on 2016. 11. 16..
 */
abstract public class StringedInstrument extends Instrument { //nincs olyan hangszer, hogy húros, csak hegedű meg gitár hangszerek vannak, ezért kell abstract, ha többen dolgozunk a programon, akkor ezzel jelezzük, hogy nem tudunk objektumot létrehozni, ha létre kell hoznom olyan metódust, ami a gitárban és a hegedűben más, akkor abstract metódust kéne rá gyártanom és akkor is abstract osztályban tudom csak megtenni

    public int numberOfStrings;
    public String sound;
    final String formatForPlay ="%s, a %d-stringed instrument that %s\n";

    public StringedInstrument(String name, int numberOfStrings, String sound){
        super(name);
        this.numberOfStrings = numberOfStrings;
        this.sound = sound;
    }

    public void play() {
        System.out.printf(formatForPlay, name, numberOfStrings, sound);
    }
}
