package com.s.decorator;
//金丝雀，具体组件，继承抽象类
public class Canary extends Bird{
    public static final int INSTSNCE = 100;
    @Override
    public int fly() {
        return INSTSNCE;
    }
}
