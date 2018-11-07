package ru.popovich.theme08.task01;

// Простые массивы

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];

//        System.out.println("Задание начальных значений массива");
        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (new Random().nextDouble()*10);

            array[i] = new Random().nextBoolean()?
                    new Random().nextInt(10) :
                    -new Random().nextInt(10);
        }

        for (int el:
             array) {
            System.out.print(el + "\t");
        }
    }
}
