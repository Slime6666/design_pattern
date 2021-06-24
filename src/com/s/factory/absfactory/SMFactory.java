package com.s.factory.absfactory;

public class SMFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String type) {
        System.out.println("抽象工厂实现");
        Pizza pizza = null;
        if ("ham".equals(type)){
            pizza = new SMHamPizza();
        }else if ("cheese".equals(type)){
            pizza = new SMCheesePizza();
        }
        return pizza;
    }
}
