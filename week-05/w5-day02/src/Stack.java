import java.util.ArrayList;

/**
 * Created by ${SzilviaB} on 2016. 12. 01..
 */
public class Stack extends ArrayList {

    Stack myStack = new Stack();

    public int size() {
        int numberOfItems = 0;
        for (int i = 0; i < myStack.size(); i++) {
            numberOfItems++;
        }
        return numberOfItems;
    }

    public void push(String newElement) {
        myStack.add(newElement);
    }

    public void pop (){
        myStack.remove(get(myStack.size()-1));
    }


}


