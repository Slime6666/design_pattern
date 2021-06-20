package com.s.singleton;
/*
 * 懒汉式（线程安全，加入同步方法）
 * */
public class Singleton4 {
    //定义instance静态变量
    private static Singleton4 instance;
    private Singleton4(){}
    //加入同步方法，保证只有一个线程进入
    public static synchronized Singleton4 newInstance() throws InterruptedException {
        //没有实例，则创建对象
        if (instance == null){
            //让线程睡一下，创造多线程进入条件
            Thread.sleep(20);
            instance = new Singleton4();
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
                        System.out.println(Singleton4.newInstance().hashCode());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
