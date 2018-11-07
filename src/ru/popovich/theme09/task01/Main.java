package ru.popovich.theme09.task01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        int t = in.nextInt();

        int y = myPow(x, t);

        System.out.println("Число x = " + x
                + ", возведенное в степень 2 равно " + y);
    }

    static int myPow(int x1, int t1) {
        int z = 0;
        if(t1 == 2) z = x1 * x1;
        return z;
    }


}
