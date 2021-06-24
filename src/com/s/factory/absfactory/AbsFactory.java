package com.s.factory.absfactory;

public interface AbsFactory {
    //根据子类工厂类创建披萨
    public Pizza createPizza(String type);
}
