package com.s.decorator;

public class CanaryDecorator extends Decorator{
    public static final int DISTANCE = 50;

    public CanaryDecorator(Bird bird) {
        super(bird);
    }

    //装饰类新增方法,private修饰方法是为了调用fly才可以使用canaryFly方法
    private int canaryFly(){
        System.out.println("加入金丝雀装饰器");
        return DISTANCE;
    }

    @Override
    public int fly() {
        int distance = 0;
        distance = bird.fly()+canaryFly();
        return distance;
    }
}
