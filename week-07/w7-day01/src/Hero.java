import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by ${SzilviaB} on 2016. 12. 07..
 */
public class Hero extends Character {



    public Hero(int posX, int posY) {
        super("hero-down.png", posX, posY, 1, true);
        maxHP = this.maxHP();
        currentHP = maxHP;
        DP = this.DP();
        SP = this.SP();
    }

    public int maxHP (){
        int hp = 20 + 3*rollDice();
        return hp;
    }
    public int DP (){
        int dp = 2*rollDice();
        return dp;
    }
    public int SP (){
        int sp = 5*rollDice();
        return sp;
    }

}
