package com.s.bridge;

public class UpRightPhone extends Phone {
    //构造器中调用父类品牌
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("直立型手机解锁");
    }
    public void playgame(){
        super.playgame();
        System.out.println("用直立型手机玩游戏");
    }
    public void watchTV(){
        super.watchTV();
        System.out.println("用直立型手机看电视");
    }
}
