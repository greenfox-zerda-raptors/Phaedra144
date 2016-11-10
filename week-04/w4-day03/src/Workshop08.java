/**************************************************************************************************
 * Workshop: Practice Exceptions: Having raised exceptions, then what?  I'm looking to get some
 * closure here.  "Finally" would do... whatever else, this is what I need if something goes
 * wrong...
 *
 *
 *
 * So, I'm looking for the following output:
 * try - first statement
 * start - myMethod
 * An Exception Occurred
 * Finally I did this instead
 * ::::FINISH LINE:::: out of the try/catch/finally statement
 *
 **************************************************************************************************/
import java.util.*;

public class Workshop08{

    static void myMethod(int inNumber) throws Exception {

        System.out.println("start - myMethod");
        Exception e = new Exception();
        throw e;

    }// something should appear here before (see Workshop07)

    public static void main(String  args[]){
        try {
            System.out.println("first statement");
            myMethod(5);
        } catch (Exception e) {
            System.out.println("An Exception Occurred");
        }
        finally {
            System.out.println("Finally I did this");
        }
        System.out.println("::::FINISH LINE::::");

    } // see Workshop07

}
