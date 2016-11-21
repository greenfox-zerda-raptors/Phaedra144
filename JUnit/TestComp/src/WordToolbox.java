/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
public class WordToolbox implements IWordToolBox {
    String stringHeld;

    public WordToolbox(String stringHeld) {

        this.stringHeld = stringHeld;
    }

    public boolean isAnAnagram (String stringToCheck){

        return false;
    }

    @Override
    public void WaitingItOut() {

    }

    public int countHowMany(char charToFind){
        int res = 0;
        for (int i = 0; i < getS().length(); i++)
            if (charToFind == getS().charAt(i))
                res++;
        return res;
    }

    @Override
    public void setS(String s) {
        stringHeld = s;
    }

    @Override
    public String getS() {
        return stringHeld;
    }
}
