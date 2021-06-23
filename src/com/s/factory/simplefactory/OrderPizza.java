package com.s.factory.simplefactory;

import java.util.Scanner;

public class OrderPizza {
    //定义简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    //设置工厂
    public void setFactory(SimpleFactory simpleFactory){
        String type = "";//用户输入披萨类型
        this.simpleFactory = simpleFactory;//设置简单工厂对象
        do{
            type = getType();
            pizza = this.simpleFactory.createPizza(type);
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
