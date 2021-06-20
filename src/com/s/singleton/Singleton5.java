package com.s.singleton;
/*
 * 懒汉式（看情况是否线程安全，加入同步代码块）
 * */
public class Singleton5 {
    //定义instance静态变量
    private static Singleton5 instance;
    private Singleton5(){}
    //在方法内加锁
    /*public static Singleton5 newInstance() throws InterruptedException {
        //方式一：此方法是一个实例,同时锁住空判断和创建实例，线程安全
        synchronized (Singleton5.class) {
            //没有实例，则创建对象
            if (instance == null) {
                //让线程睡一下，创造多线程进入条件
                Thread.sleep(20);
                instance = new Singleton5();
            }
            //实例化过，直接返回
            return instance;
        }
    }*/

    public static Singleton5 newInstance() throws InterruptedException {
            if (instance == null) {
                //方式2：此方法不是一个实例,没有同时锁住空判断和创建实例，线程不安全
                synchronized (Singleton5.class) {
                Thread.sleep(20);
                instance = new Singleton5();
            }
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
                        System.out.println(Singleton5.newInstance().hashCode());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
