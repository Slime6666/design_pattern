package com.s.bridge;

public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机解锁");
    }

    @Override
    public void playgame() {
        System.out.println("小米手机打游戏");
    }

    @Override
    public void watchTV() {
        System.out.println("小米手机看电视");
    }
}
