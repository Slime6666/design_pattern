package com.s.bridge;

public class VIVO implements Brand{
    @Override
    public void open() {
        System.out.println("vivo手机解锁");
    }

    @Override
    public void playgame() {
        System.out.println("vivo手机打游戏");
    }

    @Override
    public void watchTV() {
        System.out.println("vivo手机看电视");
    }
}
