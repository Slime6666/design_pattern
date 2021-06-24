package com.s.factory.methodfactory;

public class SMCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("三明奶酪披萨");
        System.out.println("三明厂家准备奶酪材料");
    }
}
