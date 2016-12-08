import java.util.ArrayList;

/**
 * Created by ${SzilviaB} on 2016. 12. 08..
 */
public class Monster extends Character {




    public Monster(String filename) {
        super(filename, 0,0, 1, true);
        maxHP = this.maxHP();
        currentHP = maxHP;
        DP = this.DP();
        SP = this.SP();
        SV = this.SV();

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

    @Override
    public String toString() {
        return String.format("Monster (Level %d) HP: %d/%d | DP: %d | SP: %d", level, currentHP, maxHP, DP, SP);
    }
}
