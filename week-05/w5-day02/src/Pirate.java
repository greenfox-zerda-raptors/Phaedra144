import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ${SzilviaB} on 2016. 12. 01..
 */
public class Pirate {

    public String name;
    public int shot;

    public boolean alive = true;
    Random rand = new Random();

    ArrayList<Pirate> pirates = new ArrayList<Pirate>();

    public Pirate (){
    }

    public Pirate (String name){
        this.name = name;
    }

    public int getShot() {
        return shot;
    }

    public void setShot(int shot) {
        this.shot = shot;
    }

    public boolean isAlive() {
        return alive;
    }


    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void drinkSomeRum(){
        if (alive){
            int randomNumber = rand.nextInt(4)+1;
            for(int i = 0; i <= randomNumber; i++){
                shot++;
            }
        }
        else {
            System.out.println("He is dead.");
        }

    }

    public void howIsItGoing(){
        if (shot <= 4 && alive){
            System.out.println("Pour me anudder");
        }
        else if (4 < shot && shot < 10 && alive){
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            System.out.println("And he sleeps it off.");
        }
        else {
            this.setAlive(false);
            System.out.println("He is dead.");
        }

    }

    public void addPirate(String pirateName){
        Pirate x = new Pirate(pirateName);
        pirates.add(x);
    }

    public void die (){
        this.setAlive(false);
    }

    public void brawl(){
        int temp1 = rand.nextInt(pirates.size());

        int randomNumber = rand.nextInt(3)+1;
            if (randomNumber == 1){
            this.die();
        }
        else if (randomNumber == 2) {
            pirates.get(temp1).die();
        }
        else {
            pirates.get(temp1).die();
            this.die();
        }

    }

}
