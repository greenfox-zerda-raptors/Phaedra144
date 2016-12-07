
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class Board extends JPanel implements KeyListener {

    Hero myhero;
    Area myarea;


    public Board() {

        myarea = new Area();
        myhero = new Hero(0, 0);

        this.addKeyListener(this);
        this.setPreferredSize(new Dimension(520, 520));
        this.setVisible(true);


    }

    public void addNotify() {
        super.addNotify();
        requestFocus();
    }


    public void paint(Graphics graphics) {

        myarea.draw(graphics);
        myhero.draw(graphics);
        

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            int check = myarea.getPosition(myhero.getPosX(), myhero.getPosY() + 1);
            myhero.move("hero-down.png", 0, 1, check);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            int check = myarea.getPosition(myhero.getPosX(), myhero.getPosY() - 1);
            myhero.move("hero-up.png", 0, -1, check);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            int check = myarea.getPosition(myhero.getPosX() + 1, myhero.getPosY());
            myhero.move("hero-right.png", 1, 0, check);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            int check = myarea.getPosition(myhero.getPosX() - 1, myhero.getPosY());
            myhero.move("hero-left.png", -1, 0, check);
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

