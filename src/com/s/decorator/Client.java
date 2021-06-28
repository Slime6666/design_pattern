package com.s.decorator;

public class Client {
    public void needBird(Bird bird){
        int flyDistance = bird.fly();
        System.out.println(flyDistance+"米");
    }
    public static void main(String[] args) {
        Client client = new Client();
        Canary canary = new Canary();//能飞100米
        //金丝雀加了装饰器，一个装饰器50米
        CanaryDecorator canaryDecorator1 = new CanaryDecorator(canary);
        //如果还不够高，再加一个装饰器多高50米
        CanaryDecorator canaryDecorator2 = new CanaryDecorator(canaryDecorator1);
        client.needBird(canaryDecorator1);
        client.needBird(canaryDecorator2);
        //飞1150米
        PhoenixDecorator phoenixDecorator = new PhoenixDecorator(new Canary());//1100meter
        CanaryDecorator canaryDecorator = new CanaryDecorator(phoenixDecorator);
        client.needBird(canaryDecorator);
    }
}
