/**
 * Created by ${SzilviaB} on 2016. 11. 05..
 */
public class Workshop21 {
    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial
        System.out.println(fact(4));
    }
        public static int fact(int num) {
        if(num == 1){
            return 1;
        }
        return num * (fact(num-1));
    }
//    public static int fact4(int 4) {
//        if(4 == 1){
//            return 1;
//        }
//        return 4 * (fact3(4-1));
//    }
//    public static int fact3(int 3) {
//        if(3 == 1){
//            return 1;
//        }
//        return 3 * (fact2(3-1));
//    }
//    public static int fact2(int 2) {
//        if(2 == 1){
//            return 1;
//        }
//        return 2 * (fact1(2-1));
//    }
//    public static int fact1(int 1) {
//        if(1 == 1){
//            return 1;
//        }
    }

