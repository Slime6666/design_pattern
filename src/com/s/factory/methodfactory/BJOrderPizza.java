package com.s.factory.methodfactory;

public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new BJCheesePizza();
        } else if ("ham".equals(type)) {
            pizza = new BJHamPizza();
        }
        return pizza;
    }
}
