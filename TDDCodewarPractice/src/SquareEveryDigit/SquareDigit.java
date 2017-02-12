package SquareEveryDigit;

/**
 * Created by ${SzilviaB} on 2017. 01. 02..
 */
public class SquareDigit {

    public int squareDigits(int n) {
        int result = 0;

        String number = String.valueOf(n);
        StringBuilder concatenated = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            concatenated.append(j*j);

        }
        return result = Integer.valueOf(concatenated.toString());

//        if (n> 99){
//            int num1 = n % 10;
//            int num2 = n / 10 % 10;
//            int num3 = n / 100 % 10;
//            return result = Integer.valueOf(String.valueOf(num1*num1) + String.valueOf(num2*num2)+String.valueOf(num3*num3));
//        }
//        else if(n >9 && n <= 99){
//            int num1 = n % 10;
//            int num2 = n / 10 % 10;
//            return result = Integer.valueOf(String.valueOf(num1*num1) + String.valueOf(num2*num2));
//        }
//
//        else if (n <= 9 && n >=1){
//            return n *n;
//        }
//        else{
//            return result;
//        }
//    }

    }
}
