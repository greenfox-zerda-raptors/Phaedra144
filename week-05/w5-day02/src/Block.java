/**
 * Created by ${SzilviaB} on 2016. 11. 15..
 */
public class Block extends Rectangle {
    int length;

    public Block() {
        super();
        this.length = 1;
    }

    public Block(int length){
        super();
        this.length = length;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getVolume() {
        return length*getHeight()*getWidth();
    }

    @Override
    public String toString() {
        return "Block's length = " + getLength() + " and it's volume is = " + getVolume();
    }
}
