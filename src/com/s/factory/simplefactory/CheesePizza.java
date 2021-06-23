package com.s.factory.simplefactory;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("原料奶酪");
    }

}
