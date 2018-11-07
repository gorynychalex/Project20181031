package org.dvfu.theme01.task02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Введите идентификатор месяца: ");

        int n = new Scanner(System.in).nextInt();

        switch (n) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            default:
                System.out.println("Введите значение в диапазоне от 1 до 12");
                break;
        }

    }
}
