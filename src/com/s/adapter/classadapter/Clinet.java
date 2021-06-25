package com.s.adapter.classadapter;

public class Clinet {
    public static void main(String[] args) {
        Phone phone = new Phone();
        //通过传递实现类VoltageAdapter来充电
        phone.charging(new VoltageAdapter());
    }
}
