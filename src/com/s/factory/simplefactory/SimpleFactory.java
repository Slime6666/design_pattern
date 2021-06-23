package com.s.factory.simplefactory;

public class SimpleFactory {

    public static Pizza createPizza(String type){
        Pizza pizza = null;
        System.out.println("简单工厂模式");
        //输入火腿类型披萨
        if ("ham".equals(type)){
            pizza = new HamPizza();
            pizza.setName("火腿披萨");
        }
        if ("cheese".equals(type)){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
