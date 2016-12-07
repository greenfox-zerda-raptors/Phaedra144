/**
 * Created by ${SzilviaB} on 2016. 12. 07..
 */
public abstract class Character extends GameObject {

    protected int HP, maxHP, DP, SP, level;
    protected boolean isAlive;

    public Character(String filename, int posX, int posY, int HP, int maxHP, int DP, int SP, int level) {
        super(filename, posX, posY);
        this.HP = HP;
        this.maxHP = maxHP;
        this.DP = DP;
        this.SP = SP;
        this.level = level;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void die(){
        if (this.maxHP <= 0){
            this.setAlive(false);
        }
    }




}
