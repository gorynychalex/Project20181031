package ru.popovich.theme10.task01;

public class Triangle extends Shape{

    float a, b, c;

    @Override
    void draw() {

    }

    @Override
    void setParams(float[] params) {
        this.a = params[0];
        this.b = params[1];
        this.c = params[2];
    }
}
