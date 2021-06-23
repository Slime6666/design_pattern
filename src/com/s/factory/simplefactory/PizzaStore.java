package com.s.factory.simplefactory;

public class PizzaStore {
    public static void main(String[] args) {
        //OrderPizza使用功能的位置，SimpleFactory创建产品的对象
        new OrderPizza(new SimpleFactory());
    }
}
