package com.s.factory.simplefactory;

public class HamPizza  extends Pizza{
    @Override
    public void prepare() {
        System.out.println("原料火腿");
    }
}
