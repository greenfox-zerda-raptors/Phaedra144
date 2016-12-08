
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import static javax.swing.plaf.basic.BasicGraphicsUtils.drawString;


/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class Board extends JPanel implements KeyListener {

    Hero myhero;
    Area myarea;
    ArrayList<Monster> monsters = new ArrayList<Monster>();
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
        for (GameObject item2 : monsters) {
            item2.draw(graphics);
        }
        graphics.drawString(myhero.toString(), 20, 565);
        if (ifTheSameTile()){
            for (int i = 0; i < monsters.size(); i++) {
                graphics.drawString(monsters.get(i).toString(), 20, 580 + 15 * i);
            }
        }

    }


    public ArrayList<Monster> createSkeletons() {
        monsters = new ArrayList<Monster>();
        int j = rand.nextInt(4) + 3;
        for (int i = 0; i < j; i++) {
            int randomPosX = rand.nextInt(10) + 1;
            int randomPosY = rand.nextInt(9) + 1;
            Monster randomSkel = new Monster("skeleton.png");
            while (myarea.getPosition(randomPosX, randomPosY) == 1) {
                randomPosX = rand.nextInt(10) + 1;
                randomPosY = rand.nextInt(9) + 1;
            }
            randomSkel.setPosX(randomPosX);
            randomSkel.setPosY(randomPosY);

            monsters.add(randomSkel);
        }
        return monsters;
    }

    public void monsterStrikesHero() {
        for (Character randomMonster : monsters) {
            if (randomMonster.getPosX() == myhero.getPosX() && randomMonster.getPosY() == myhero.getPosY()) {
                randomMonster.strike(myhero);

            }
        }
    }

    public boolean ifTheSameTile() {
        for (Character randomMonster : monsters) {
            if (randomMonster.getPosX() == myhero.getPosX() && randomMonster.getPosY() == myhero.getPosY()) {
                return true;
            }

        }
        return false;
    }

    public Monster findMonster() {
        for (Monster randomMonster : monsters) {
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

