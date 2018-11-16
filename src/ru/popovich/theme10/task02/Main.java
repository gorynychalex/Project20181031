package ru.popovich.theme10.task02;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Person[] people = new Person[10];

        Person vasya = new Person("Вася","Пупкин");
        vasya.setAge(30); vasya.setEmail("pupkin@mail.ru");
        String[] phonesVasya = {"12345678","987654331"};
        vasya.setPhoneNumbers(phonesVasya);
        String[] addressesVasya = {"Владивосток, ул. Пушкинская, 10", "г. Артем, ул. Фрунзе, 15, кв. 20"};
        vasya.setAddresses(addressesVasya);

        vasya.getPhoneNumbers1().add("111111111");

        people[0] = vasya;



        System.out.println(people[0]);

    }

    public static Person methodAddPerson(Scanner in){

        System.out.println("Введите имя и фамилию");

        Person petya = new Person(in.next(),in.next());
        System.out.println("Введите возраст:");
        petya.setAge(in.nextInt());


        return null;
    }
}
