
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
    ArrayList<Character> enemies;
    Boss myboss;
    Random rand = new Random();


    public Board() {

        myarea = new Area();
        myhero = new Hero(0, 0);
        this.createEnemies();
        this.createBoss();

        this.addKeyListener(this);
        this.setPreferredSize(new Dimension(880, 540));
        this.setVisible(true);


    }

    public void addNotify() {
        super.addNotify();
        requestFocus();
    }


    public void paint(Graphics graphics) {
        super.paint(graphics);
        myarea.draw(graphics);
        myhero.draw(graphics);
        for (Character enemy : enemies) {
            if(enemy.isAlive == true){
                enemy.draw(graphics);
            }
        }
//        myboss.draw(graphics);

        graphics.drawString(myhero.toString(), 620, 20);
        if (ifTheSameTile(myhero)) {
            for (int i = 0; i < enemies.size(); i++) {
                graphics.drawString(enemies.get(i).toString(), 620, 35 + 15 * i);
            }

        }
    }


    public ArrayList<Character> createEnemies() {
        enemies = new ArrayList<Character>();
        int j = rand.nextInt(4) + 3;
        for (int i = 0; i < j; i++) {
            int randomPosX = rand.nextInt(10);
            int randomPosY = rand.nextInt(9);
            Skeleton randomSkel = new Skeleton("skeleton.png");
            Boss randomBoss = new Boss("boss.png");
            while (myarea.getPosition(randomPosX, randomPosY) == 1 && !(ifTheSameTile(randomSkel))) {

                randomPosX = rand.nextInt(10);
                randomPosY = rand.nextInt(9);
            }
            randomSkel.setPosX(randomPosX);
            randomSkel.setPosY(randomPosY);
            randomBoss.setPosX(randomPosX);

            enemies.add(randomSkel);
        }
        return enemies;
    }

    public Boss createBoss() {
        int randomPosX = rand.nextInt(10);
        int randomPosY = rand.nextInt(9);
        myboss = new Boss("boss.png");
        while (myarea.getPosition(randomPosX, randomPosY) == 1
                && !(ifTheSameTile(myboss))) {

            randomPosX = rand.nextInt(10);
            randomPosY = rand.nextInt(9);
        }
        myboss.setPosX(randomPosX);
        myboss.setPosY(randomPosY);
        enemies.add(myboss);
        return myboss;
    }

    public void monsterStrikesHero() {
        for (Character randomMonster : enemies) {
            if (randomMonster.getPosX() == myhero.getPosX() && randomMonster.getPosY() == myhero.getPosY()) {
                randomMonster.strike(myhero);
            }
        }
    }

    public boolean ifTheSameTile(Character randomChar) {
        for (Character randomMonster : enemies) {
            if (randomMonster.getPosX() == randomChar.getPosX() && randomMonster.getPosY() == randomChar.getPosY()) {
                return true;
            }

        }
        return false;
    }

    public Character findCharacter() {
        for (Character randomMonster : enemies) {
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
            this.monsterStrikesHero();

        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            int check = myarea.getPosition(myhero.getPosX(), myhero.getPosY() - 1);
            myhero.move("hero-up.png", 0, -1, check);
            this.monsterStrikesHero();

        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            int check = myarea.getPosition(myhero.getPosX() + 1, myhero.getPosY());
            myhero.move("hero-right.png", 1, 0, check);
            this.monsterStrikesHero();

        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            int check = myarea.getPosition(myhero.getPosX() - 1, myhero.getPosY());
            myhero.move("hero-left.png", -1, 0, check);
            this.monsterStrikesHero();

        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            myhero.battle(findCharacter());
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

