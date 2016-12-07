import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by ${SzilviaB} on 2016. 12. 07..
 */
public class Hero extends GameObject {

    public Hero(){

    }


    public Hero(int posX, int posY) {
        super("hero-down.png", posX, posY);
    }


}
