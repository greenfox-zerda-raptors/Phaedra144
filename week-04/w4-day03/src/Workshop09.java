/**************************************************************************************************
 * Workshop: Practice Exceptions: I have to have it my way.  When an exception occurs, I want a
 * special error message, namely "7's are cannibals!" printed.
 *
 *
 * So, I'm looking for the following output:
 * try - first statement
 * start - myMethod
 * An Exception Occurred
 * 7's are cannibals
 * Finally I did this instead
 * ::::FINISH LINE:::: out of the try/catch/finally statement
 *
 * Refer to Workshop07
 **************************************************************************************************/
import java.util.*;

public class Workshop09{
    public static void main(String  args[]){
        try {
            System.out.println("first statement");
            myMethod(5);
        } catch (Exception e) {
            System.out.println("An Exception Occurred");
            System.out.println("7's are cannibals");

        }
        finally {
            System.out.println("Finally I did this");
        }
        System.out.println("::::FINISH LINE::::");

    }
    static void myMethod(int inNumber) throws Exception {

        System.out.println("start - myMethod");
        Exception e = new Exception();
        throw e;

    }// see Workshop07

}


