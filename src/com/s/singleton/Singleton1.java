package com.s.singleton;
/*饿汉式（静态常量）*/
public class Singleton1 {
    //创建一个私有构造器，不让其他类new
    private Singleton1(){}
    //创建一个静态常量
    public static final Singleton1 INSTANCE = new Singleton1();
    //实例方法，方法是静态是为了通过类名调用
    public static Singleton1 newInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.newInstance();
        Singleton1 s2 = Singleton1.newInstance();
        //比较两个实例是否相等 结果：true
        System.out.println(s1==s2);
    }
}
