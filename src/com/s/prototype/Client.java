package com.s.prototype;

public class Client {
    public static void main(String[] args) {
        System.out.println("原型模式完成对象创建");
        Monkey monkey1 = new Monkey("齐天大圣", 1000, "金色");
        //克隆
        Monkey m2 = (Monkey) monkey1.clone();
        Monkey m3 = (Monkey) monkey1.clone();
        System.out.println("monkey"+monkey1+monkey1.hashCode());
        System.out.println("monkey"+m2+m2.hashCode());
        System.out.println("monkey"+m3+m3.hashCode());
    }
}
