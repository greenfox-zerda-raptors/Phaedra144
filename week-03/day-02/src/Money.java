/**
 * Created by ${SzilviaB} on 2016. 11. 05..
 */
public class Money {
    public static void main(String[] args) {
        System.out.println((int)calculateYears(1000, 0.05, 0.18, 3000));
    }
    public static double calculateYears(double principal, double interest, double tax, double desired) {
        double yearlyRate = principal * interest;
        double taxRate = yearlyRate * tax;
        int Y = 0;
           for ( Y = 0; principal <= desired; Y++ ){
               principal = principal + yearlyRate - taxRate;
           }
            return Y;
        }

    }

//[1:37]
//    Let P be the Principal = 1000.00
//    Let I be the Interest Rate = 0.05
//    Let T be the Tax Rate = 0.18
//    Let D be the Desired Sum = 1100.00
//
//
//    After 1st Year -->
//    P = 1041.00
//    After 2nd Year -->
//    P = 1083.86
//    After 3rd Year -->
//    P = 1128.30
//
//            [1:39]
//    r. Scrooge has a sum of money 'P' that wants to invest, and he wants to know how many years 'Y' this sum has to be kept in the bank in order for this sum of money to amount to 'D'.
//
//    The sum is kept for 'Y' years in the bank where interest 'I' is paid yearly, and the new sum is re-invested yearly after paying tax 'T'
//
//    Note that the principal is not taxed but only the year's accrued interest
//}
