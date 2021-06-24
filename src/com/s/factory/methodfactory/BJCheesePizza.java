package com.s.factory.methodfactory;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京厂家准备奶酪材料");
    }
}
