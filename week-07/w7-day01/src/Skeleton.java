import java.util.ArrayList;

/**
 * Created by ${SzilviaB} on 2016. 12. 08..
 */
public class Skeleton extends Character {




    public Skeleton() {
        super("skeleton.png", 0,0, 1, true);
        maxHP = this.maxHP();
        currentHP = maxHP;
        DP = this.DP();
        SP = this.SP();

    }




    @Override
    public int maxHP() {
        int hp = 2 * level * rollDice();
        return hp;
    }

    @Override
    public int DP() {
        int dp = (int) ((double)level / 2 * rollDice());
        return dp;
    }

    @Override
    public int SP() {
        return level * rollDice();
    }
}
