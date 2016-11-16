package com.greenfox.bx;

import java.util.ArrayList;

import static com.greenfox.bx.App.randomDow;
import static com.greenfox.bx.AppCreditCard.random16;

/**
 * Created by ${SzilviaB} on 2016. 11. 16..
 */
public class AppCreditCardReservation {

    final static String[] lsDow = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    public static void main(String[] args) {
        ArrayList<CreditCardReservation> bookings = new ArrayList<CreditCardReservation>();
        int ct = 10;

        for (int i = 0; i < ct; i++) {
            bookings.add(new CreditCardReservation(randomDow(10), "DEF" + i, random16()));
        }

        for (CreditCardReservation iBooking : bookings) {
            System.out.println(iBooking.toString());
        }

    }
}
