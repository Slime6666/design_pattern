package com.s.factory.absfactory;

import java.util.Scanner;

public class OrderPizza {
    //定义一个抽象工厂
    AbsFactory absFactory;
    //构造器完成订购功能
    public OrderPizza(AbsFactory absFactory){
    setFactory(absFactory);
    }

    private void setFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String type = "";//用户输入披萨类型
        this.absFactory = absFactory;
        do{
            type = getType();
            //披萨生产由子类工厂生产
            pizza = absFactory.createPizza(type);
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
