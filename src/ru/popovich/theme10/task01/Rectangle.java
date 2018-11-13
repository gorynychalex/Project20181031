package ru.popovich.theme10.task01;

// Определение типа объекта "Прямоугольник"

public class Rectangle extends Shape{

    // Стороны прямоугольника
    float a, b;

    // Пустой конструктор
    Rectangle(){}

    // Конструктор с заданием параметров
    Rectangle(float a1, float b1) {
        this.a = a1;
        this.b = b1;
    }

    // Метод задания сторон прямоугольника
    void setAB(float a1, float b1){
        this.a = a1;
        this.b = b1;
    }

    @Override
    void setParams(float[] params) {
        this.a = params[0];
        this.b = params[1];
    }

    // Метод отображения прямоугольника
    @Override
    void draw(){
        System.out.println("Рисуем прямоугольник со сторонами:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("в координатах (" + x + "," + y + ");" );
    }

    // Метод рассчета площади прямоугольника
    float getSquare(){
        return a * b;
    }

    // Метод рассчета периметра прямоугольника
    float getArea(){
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        return "Фигура: Прямоугольник со сторонами \n" +
                "a = " + a + ", b = " + b +"\n" +
                "в координатах (" + x + "," + y + ");" ;
    }
}
