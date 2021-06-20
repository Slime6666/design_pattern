package com.s.singleton;

public class Singleton7 {
    private Singleton7() {}
    //静态内部类里实例化对象,在Singleton7加载的时候，SingletonInstance内部类不加载，只在实例的时候加载
    private static class SingletonInstance{
    //静态属性,实例化对象
        private static final Singleton7 INSTANCE = new Singleton7();
    }
    //提供一个静态的公有方法,返回SingletonInstance类的实例
    public static Singleton7 newInstance(){
        return SingletonInstance.INSTANCE;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton7.newInstance().hashCode());
            }).start();
        }
    }
}
