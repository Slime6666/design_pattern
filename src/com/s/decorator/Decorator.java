package com.s.decorator;
//装饰类
public abstract class Decorator extends Bird{
    protected Bird bird;

    public Decorator() {
    }

    public Decorator(Bird bird) {
        this.bird = bird;
    }
}
