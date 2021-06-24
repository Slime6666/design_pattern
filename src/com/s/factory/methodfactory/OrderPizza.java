package com.s.factory.methodfactory;

import com.s.factory.methodfactory.Pizza;

import java.util.Scanner;

public abstract class OrderPizza {
    //定义一个抽象方法，createPizza ,让各个工厂子类自己实现
    abstract Pizza createPizza(String type);
    //构造器完成订购功能
    public OrderPizza(){
    Pizza pizza = null;
    String type = "";//用户输入披萨类型
        do{
            type = getType();
            //披萨生产由厂家实现
            pizza = createPizza(type);
            //输出披萨信息
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.box();
            }else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        }while (true);
    }

    //用户填写订单
    private String getType(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入披萨ham或cheese");
        String type = sc.nextLine();
        return type;
    }

}
