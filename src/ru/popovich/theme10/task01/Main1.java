package ru.popovich.theme10.task01;

public class Main1 {
    public static void main(String[] args) {

        Shape rectangle1 = new Rectangle(100,50);

        rectangle1.setParams(50,40);

        Shape circle1 = new Circle(40);
        circle1.setParams(50);

        Shape triangle1 = new Triangle();
        triangle1.setParams(20,30,40);



    }
}
