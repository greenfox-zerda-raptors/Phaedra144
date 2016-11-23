import java.util.HashMap;

/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
public class WordToolbox implements IWordToolBox {
    String stringHeld;

    public WordToolbox(String stringHeld) {

        this.stringHeld = stringHeld;
    }

    public boolean isAnAnagram(String stringToCheck) {
        if (countAllLetters(stringHeld).equals(countAllLetters(stringToCheck))) {
            return true;
        } else {
            return false;
        }
    }

    private HashMap<Character, Integer> countAllLetters(String word) {
        // Here create the HashMap and go through the word letters, count them if the letter is not already counted
        WordToolbox otherWord = new WordToolbox(word.toLowerCase());
        HashMap<Character, Integer> mapOfWord = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            mapOfWord.put(word.toLowerCase().charAt(i), otherWord.countHowMany(word.toLowerCase().charAt(i)));
        }
        return mapOfWord;
    }

    @Override
    public void WaitingItOut() {

    }

    public int countHowMany(char charToFind) {
        int res = 0;
        for (int i = 0; i < getS().length(); i++)
            if (charToFind == getS().toLowerCase().charAt(i))
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
