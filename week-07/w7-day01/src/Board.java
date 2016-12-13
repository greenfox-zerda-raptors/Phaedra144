
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

    protected Hero myhero;
    protected Area myarea;
    protected ArrayList<Character> enemies;
    protected Boss myboss;
    protected Random rand = new Random();
    static int moveCounter;


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
            while (myarea.getPosition(randomPosX, randomPosY) == 1 &&
                    !(ifTheSameTile(randomSkel))) {

                randomPosX = rand.nextInt(10);
                randomPosY = rand.nextInt(9);
            }
            randomSkel.setPosX(randomPosX);
            randomSkel.setPosY(randomPosY);

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
        for (Character randomEnemy : enemies) {
            if (randomEnemy.getPosX() == myhero.getPosX() && randomEnemy.getPosY() == myhero.getPosY()) {
                randomEnemy.strike(myhero);
            }
        }
    }

    public void monstersMoveRandom(){
        int random4 = rand.nextInt(4)+1;
        for (Character randomEnemy : enemies){
            int check1 = myarea.getPosition(randomEnemy.getPosX() + 1, randomEnemy.getPosY());
            int check2 = myarea.getPosition(randomEnemy.getPosX() - 1, randomEnemy.getPosY());
            int check3 = myarea.getPosition(randomEnemy.getPosX(), randomEnemy.getPosY() + 1);
            int check4 = myarea.getPosition(randomEnemy.getPosX(), randomEnemy.getPosY() - 1);

            if (moveCounter % 2 == 0 && check1 == 0 && random4 == 1){
                randomEnemy.moveEnemy(1);
            }
            else if (moveCounter % 2 == 0 && check2 == 0 && random4 == 2){
                randomEnemy.moveEnemy(2);
            }
            else if (moveCounter % 2 == 0 && check3 == 0 && random4 == 3){
                randomEnemy.moveEnemy(3);
            }
            else if (moveCounter % 2 == 0 && check4 == 0 && random4 == 4){
                randomEnemy.moveEnemy(4);
            }
        }
    }

    public boolean ifTheSameTile(Character randomChar) {
        for (Character randomEnemy : enemies) {
            if (randomEnemy.getPosX() == randomChar.getPosX() && randomEnemy.getPosY() == randomChar.getPosY()) {
                return true;
            }

        }
        return false;
    }

    public Character findCharacter() {
        for (Character randomEnemy : enemies) {
            if (randomEnemy.getPosX() == myhero.getPosX() && randomEnemy.getPosY() == myhero.getPosY()) {
                return randomEnemy;

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
            moveCounter++;
            this.monstersMoveRandom();

        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            int check = myarea.getPosition(myhero.getPosX(), myhero.getPosY() - 1);
            myhero.move("hero-up.png", 0, -1, check);
            this.monsterStrikesHero();
            moveCounter++;
            this.monstersMoveRandom();

        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            int check = myarea.getPosition(myhero.getPosX() + 1, myhero.getPosY());
            myhero.move("hero-right.png", 1, 0, check);
            this.monsterStrikesHero();
            moveCounter++;
            this.monstersMoveRandom();

        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            int check = myarea.getPosition(myhero.getPosX() - 1, myhero.getPosY());
            myhero.move("hero-left.png", -1, 0, check);
            this.monsterStrikesHero();
            moveCounter++;
            this.monstersMoveRandom();

        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            myhero.battle(findCharacter());
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

