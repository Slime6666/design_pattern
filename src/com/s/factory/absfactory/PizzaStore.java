package com.s.factory.absfactory;

import java.util.Scanner;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SMFactory());
    }
}
