/**
 * Created by ${SzilviaB} on 2016. 12. 07..
 */
public class Tile extends GameObject {
    public boolean moveable;

    public Tile(String filename, int posX, int posY, boolean moveable) {
        super(filename, posX, posY);
        this.moveable = moveable;
    }
    public boolean isMoveable() {
        return moveable;
    }

    public void setMoveable(boolean moveable) {
        this.moveable = moveable;
    }

}
