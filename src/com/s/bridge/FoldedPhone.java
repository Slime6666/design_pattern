package com.s.bridge;

public class FoldedPhone extends Phone {
    //构造器中调用父类品牌
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("折叠式手机解锁");
    }
    public void playgame(){
        super.playgame();
        System.out.println("用折叠式手机玩游戏");
    }
    public void watchTV(){
        super.watchTV();
        System.out.println("用折叠式手机看电视");
    }
}
