
import java.util.Random;

/**
 * Created by ${SzilviaB} on 2016. 12. 07..
 */
public abstract class Character extends GameObject {

    public Random rand = new Random();
    protected int dice;
    protected int currentHP, maxHP, DP, SP, SV, level;
    protected boolean isAlive = true;


    public Character(String filename, int posX, int posY, int level, boolean isAlive) {
        super(filename, posX, posY);
        this.level = level;
        this.isAlive = isAlive;

    }

    public abstract int maxHP();

    public abstract int DP();

    public abstract int SP();

    public int SV (){
        int sv = 2 * rollDice() + SP;
        return sv;
    }



    public void setAlive(boolean alive) {
        isAlive = alive;
    }


    public void battle(Character randomEnemy){
        if (randomEnemy != null && this.SV > randomEnemy.DP){
            randomEnemy.currentHP =- this.SV - randomEnemy.DP;
            if (randomEnemy.isAlive){
                this.currentHP = this.currentHP +1;
            }
            if (randomEnemy != null && randomEnemy.currentHP <= 0){
                randomEnemy.setAlive(false);
            }
        }
        else{
            this.currentHP =- randomEnemy.SV - this.DP;
            if (this.currentHP <= 0){
                this.setAlive(false);
            }
        }

    }

    public void strike (Character random){
        if (this.isAlive){
            random.currentHP = random.currentHP - 2;
        }        
    }

    public void moveEnemy (int x){

        if (x == 1){
            posX += 1;
        }
        else if (x == 2){
            posX -= 1;
        }
        else if (x == 3){
            posY += 1;
        }
        else if (x == 4){
            posY -= 1;
        }

    }


    public int rollDice() {
        dice = rand.nextInt(6) + 1;
        return dice;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + String.format("(Level %d) HP: %d/%d | DP: %d | SP: %d", level, currentHP, maxHP, DP, SP);
    }
}
