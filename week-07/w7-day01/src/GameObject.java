import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class GameObject {
    BufferedImage image;
    int posX, posY;

    public GameObject() {

    }

    public GameObject(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }



    public void move (String filename, int x, int y, int getPosition){

        if (getPosition == 0){
            posX += x;
            posY += y;
        }
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void moveWithPosOnly ( int x, int y){
        this.posX =+ x;
        this.posY =+ y;
    }



    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX * 52, posY * 52, null);
        }
    }
}
