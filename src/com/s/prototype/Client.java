package com.s.prototype;

public class Client {
    public static void main(String[] args) {
        System.out.println("原型模式完成对象创建");
        Monkey m1 = new Monkey("齐天大圣", 1000, "金色");
        m1.friend = new Monkey("六耳猕猴", 800, "金色");
        //克隆
        Monkey m2 = (Monkey) m1.clone();
        Monkey m3 = (Monkey) m1.clone();
        //对象的克隆默认是浅拷贝，即指向同一地址
        System.out.println("monkey="+m1+"friend1="+m1.friend+m1.friend.hashCode());
        System.out.println("monkey="+m2+"friend2="+m2.friend+m2.friend.hashCode());
        System.out.println("monkey="+m3+"friend3="+m3.friend+m3.friend.hashCode());

    }
}
