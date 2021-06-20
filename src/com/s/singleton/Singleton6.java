package com.s.singleton;

public class Singleton6 {
    private static Singleton6 instance;
    private Singleton6(){};
    public static Singleton6 newInstance() throws InterruptedException {
        //双重检查,是单例
        if (instance == null){
            synchronized (Singleton6.class){
                if (instance == null){
                    Thread.sleep(20);
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Singleton6.newInstance().hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
