package com.s.factory.methodfactory;

public class BJHamPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京火腿披萨");
        System.out.println("北京厂家准备火腿材料");
    }
}
