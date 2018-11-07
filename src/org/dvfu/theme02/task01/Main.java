package org.dvfu.theme02.task01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String menu = "1) a+b;\n2) a-b;\n3) a*b;";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи значения: a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();

        System.out.println("Выберите пункт соответствующий вычислению:");
        System.out.println(menu);

        int n = scanner.nextInt();

        int result=0;

        switch (n){
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            default:
                break;
        }

        System.out.println(result);

    }
}
