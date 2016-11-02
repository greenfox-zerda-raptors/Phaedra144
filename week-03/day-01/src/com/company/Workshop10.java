package com.company;

public class Workshop10 {
    public static void main(String[] args) {
        int j1 = 10;
        int j2 = 3;

        if (j1 >= Math.pow(j2, 2) && j1 <= Math.pow(j2, 3)) {

            System.out.println(j1 + " is between " + (int) Math.pow(j2, 2) + " " + (int) Math.pow(j2, 3) );
        } else {
            System.out.println(j1 + " " + "is not between");
        }

    }
}
