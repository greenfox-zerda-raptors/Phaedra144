import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ${SzilviaB} on 2016. 12. 01..
 */
public class Ship extends ArrayList<Pirate> {
    ArrayList<Pirate> alives;
    Pirate captain;
    public static int countShot;
    Random rand = new Random();


    public void fillShip() {
        for (int i = 0; i < rand.nextInt(20); i++) {
            Pirate randomPirate = new Pirate();
            this.add(randomPirate);
        }
        captain = new Pirate("Captain Sparrow");
        this.add(captain);
    }


    public int getAlivePirates() {
        int alivePirates = 0;
        for (Pirate x : this) {
            if (x.isAlive()) {
                alivePirates++;
            }
        }
        return alivePirates;

    }

    public int countScores() {
        int x = captain.getShot() + this.getAlivePirates();
        return x;
    }

    public void party() {
        int randomPirate = rand.nextInt(this.size());
        int randomNumber = rand.nextInt(100);
        for (int i = 0; i <= randomNumber; i++) {
            this.get(randomPirate).drinkSomeRum();
        }
    }

    public boolean battle(Ship othership) {
        if (this.countScores() > othership.countScores()) {
            System.out.println("Hurraaayy, we won!");
            this.party();
            return true;
        }
        int randomNumber = rand.nextInt(this.size());
        for (int i = 0; i <= randomNumber; i++) {
            this.get(i).die();
        }
        System.out.println("Run! Run while you can and save the rum!");
        return false;
    }


    public void print() {
        System.out.println("Number of pirates: " + this.size());
        System.out.println("Number of pirates that alive: " + getAlivePirates());
        System.out.println("The captain has drunk: " + captain.getShot() + " shots.");
    }
}
