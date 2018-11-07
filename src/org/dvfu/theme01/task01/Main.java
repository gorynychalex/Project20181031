package org.dvfu.theme01.task01;


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        InputStream inS = System.in;
//        InputStreamReader inSR = new InputStreamReader(inS);
//        BufferedReader bufferedReader = new BufferedReader(inSR);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите значение: ");

        String inString = br.readLine();

        int x=0;

        if(inString.matches("\\d+")) {
            x = Integer.parseInt(inString);
        } else {
            System.out.println("Введено не число! Введите только число!");
        }

        System.out.println(x);

        for (int i = 0; i < args.length; i++) {

        }

        int i = 0;
        for (;i < args.length;){
            //...
            i++;
        }

    }

}
