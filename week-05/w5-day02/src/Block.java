/**
 * Created by ${SzilviaB} on 2016. 11. 15..
 */
public class Block extends Rectangle {
    int length;

    public Block() {
        super();
        this.length = 1;
    }

//    public Block(int length){
//        super();
//    }
//
//    public int getLength() {
//        return length;
//    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getVolume() {
        return length*getHeight()*getWidth();
    }



}
