package ru.popovich.theme09.task01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        int t = in.nextInt();

        int y = myPowR(x, t);

        System.out.println("Число x = " + x
                + ", возведенное в степень " + t + "  равно " + y);
    }

    static int myPowR(int x, int t){
        if(t == 0) return 1;
        else if(t == 1) return x;
        else return x * myPowR(x,t-1);
    }

}
