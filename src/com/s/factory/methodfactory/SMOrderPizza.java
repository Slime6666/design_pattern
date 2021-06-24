package com.s.factory.methodfactory;

public class SMOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new SMCheesePizza();
        } else if ("ham".equals(type)) {
            pizza = new SMHamPizza();
        }
        return pizza;
    }
}
