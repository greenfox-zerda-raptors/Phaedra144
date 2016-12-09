
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;


/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class Board extends JPanel implements KeyListener {

    Hero myhero;
    Area myarea;
    ArrayList<Skeleton> skeletons = new ArrayList<Skeleton>();
    Random rand = new Random();


    public Board() {

        myarea = new Area();
        myhero = new Hero(0, 0);
        this.createSkeletons();
        this.monsterStrikesHero();

        this.addKeyListener(this);
        this.setPreferredSize(new Dimension(600, 640));
        this.setVisible(true);


    }

    public void addNotify() {
        super.addNotify();
        requestFocus();
    }


    public void paint(Graphics graphics) {

        myarea.draw(graphics);
        myhero.draw(graphics);
        for (GameObject item2 : skeletons) {
            item2.draw(graphics);
        }
        graphics.drawString(myhero.toString(), 20, 565);
        if (ifTheSameTile(myhero)){
            for (int i = 0; i < skeletons.size(); i++) {
                graphics.drawString(skeletons.get(i).toString(), 20, 580 + 15 * i);
            }
        }

    }


    public ArrayList<Skeleton> createSkeletons() {
        skeletons = new ArrayList<Skeleton>();
        int j = rand.nextInt(4) + 3;
        for (int i = 0; i < j; i++) {
            int randomPosX = rand.nextInt(10);
            int randomPosY = rand.nextInt(9);
            Skeleton randomSkel = new Skeleton("skeleton.png");
            while (myarea.getPosition(randomPosX, randomPosY) == 1 && !(ifTheSameTile(randomSkel))) {
                randomPosX = rand.nextInt(10);
                randomPosY = rand.nextInt(9);
            }
            randomSkel.setPosX(randomPosX);
            randomSkel.setPosY(randomPosY);

            skeletons.add(randomSkel);
        }
        return skeletons;
    }

    public void monsterStrikesHero() {
        for (Character randomMonster : skeletons) {
            if (randomMonster.getPosX() == myhero.getPosX() && randomMonster.getPosY() == myhero.getPosY()) {
                randomMonster.strike(myhero);

            }
        }
    }

    public boolean ifTheSameTile(Character randomChar) {
        for (Character randomMonster : skeletons) {
            if (randomMonster.getPosX() == randomChar.getPosX() && randomMonster.getPosY() == randomChar.getPosY()) {
                return true;
            }

        }
        return false;
    }

    public Skeleton findMonster() {
        for (Skeleton randomMonster : skeletons) {
            if (randomMonster.getPosX() == myhero.getPosX() && randomMonster.getPosY() == myhero.getPosY()) {
                return randomMonster;

            }
        }
        return null;
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

        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            myhero.strike(findMonster());
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

