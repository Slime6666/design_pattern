package com.s.factory.methodfactory;

import java.util.Scanner;

public class PizzaStore {
    public static void main(String[] args) {
        System.out.println("请输入厂家bj或sm");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if ("bj".equals(s)){
            new BJOrderPizza();
        }else if ("sm".equals(s)){
            new SMOrderPizza();
        }else {
            System.out.println("请输入存在厂家");

        }


    }
}
