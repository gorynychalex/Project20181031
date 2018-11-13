package ru.popovich.theme10.task01;

// Тип объекта окружность
public class Circle extends Shape{

    // Радиус
    float r;

    Circle (){}

    // Конструктор с параметром радиуса
    public Circle(float r) {
        this.r = r;
    }

    // Метод назначения параметров точки опоры
    void setXY(float x1, float y1){
        this.x = x1;
        this.y = y1;
    }

    @Override
    void setParams(float[] params) {
        this.r = params[0];
    }

    // Метод SETTER для радиуса
    public void setR(float r) {
        this.r = r;
    }

    // Метод отображения окружности
    @Override
    void draw(){
        System.out.println("Рисуем окружность с радиусом:");
        System.out.println("r = " + r);
        System.out.println("в координатах (" + x + "," + y + ");" );
    }

}
