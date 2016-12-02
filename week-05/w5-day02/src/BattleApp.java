/**
 * Created by ${SzilviaB} on 2016. 12. 02..
 */
public class BattleApp {

    public static void main(String[] args) {
        Ship ship01 = new Ship();
        Ship ship02 = new Ship();

        ship01.fillShip();
        ship02.fillShip();

        ship01.captain.drinkSomeRum();
        ship02.captain.drinkSomeRum();

        ship01.battle(ship02);

        ship01.print();


    }
}
