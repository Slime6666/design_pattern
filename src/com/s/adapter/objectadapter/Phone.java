package com.s.adapter.objectadapter;

public class Phone {
    //充电
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V()== 5){
            System.out.println("5v电压可充电");
        }else if (iVoltage5V.output5V() > 5){
            System.out.println("电压大于5v，不可充电");
        }else {
            System.out.println("小于5v电压可充电");
        }
    }
}
