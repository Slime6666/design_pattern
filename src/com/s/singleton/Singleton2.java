package com.s.singleton;
/*饿汉式（静态代码块）*/
public class Singleton2 {
    //创建一个私有构造器，不让其他类new
    private Singleton2(){}
    //定义一个静态实例
    public static Singleton2 instance;
    //静态代码块中实例化对象
    static {
         instance= new Singleton2();
    }
    //提供一个公有静态方法，放回实例化对象
    public static Singleton2 newInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.newInstance();
        Singleton2 s2 = Singleton2.newInstance();
        //比较两个实例是否相等 结果：true
        System.out.println(s1==s2);
    }
}
