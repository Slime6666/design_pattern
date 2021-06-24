package com.s.factory.methodfactory;

public class SMHamPizza extends Pizza{
    @Override
    public void prepare() {
        setName("三明火腿披萨");
        System.out.println("三明厂家准备火腿材料");
    }
}
