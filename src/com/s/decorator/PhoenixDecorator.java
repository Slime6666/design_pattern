package com.s.decorator;
//凤凰装饰器
public class PhoenixDecorator extends Decorator{
    private static final int phoenixDecorator = 1000;

    public PhoenixDecorator(Bird bird) {
        super(bird);
    }
    private int canaryFly(){
        System.out.println("加入凤凰装饰器");
        return phoenixDecorator;
    }
    @Override
    public int fly() {
        return bird.fly()+canaryFly();
    }
}
