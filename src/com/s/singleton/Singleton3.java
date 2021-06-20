package com.s.singleton;
/*
 * 懒汉式
 * 实例是在使用的时候创建，但线程不安全,会创建多个对象
 * */
public class Singleton3 {
    //定义instance静态变量
    private static Singleton3 instance;
    private Singleton3(){}
    //初始化方法，实现懒加载，需要时才创建对象
    public static Singleton3 newInstance() throws InterruptedException {
        //没有实例，则创建对象
        if (instance == null){
            //让线程睡一下，创造多线程进入条件
            Thread.sleep(20);
            instance = new Singleton3();
        }
        //实例化过，直接返回
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //创建多线程，实现Runnable接口，重写run方法
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //通过哈希码，看对象是否一样
                        System.out.println(Singleton3.newInstance().hashCode());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
